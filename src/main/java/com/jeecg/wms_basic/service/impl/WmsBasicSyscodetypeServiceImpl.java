package com.jeecg.wms_basic.service.impl;
import com.jeecg.wms_basic.service.WmsBasicSyscodetypeServiceI;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.wms_basic.entity.WmsBasicSyscodetypeEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.io.Serializable;
import org.jeecgframework.core.util.ApplicationContextUtil;
import org.jeecgframework.core.util.MyClassLoader;
import org.jeecgframework.core.util.StringUtil;
import org.jeecgframework.web.cgform.enhance.CgformEnhanceJavaInter;

@Service("wmsBasicSyscodetypeService")
@Transactional
public class WmsBasicSyscodetypeServiceImpl extends CommonServiceImpl implements WmsBasicSyscodetypeServiceI {

	
 	public void delete(WmsBasicSyscodetypeEntity entity) throws Exception{
 		super.delete(entity);
 		//执行删除操作增强业务
		this.doDelBus(entity);
 	}
 	
 	public Serializable save(WmsBasicSyscodetypeEntity entity) throws Exception{
 		Serializable t = super.save(entity);
 		//执行新增操作增强业务
 		this.doAddBus(entity);
 		return t;
 	}
 	
 	public void saveOrUpdate(WmsBasicSyscodetypeEntity entity) throws Exception{
 		super.saveOrUpdate(entity);
 		//执行更新操作增强业务
 		this.doUpdateBus(entity);
 	}
 	
 	/**
	 * 新增操作增强业务
	 * @param t
	 * @return
	 */
	private void doAddBus(WmsBasicSyscodetypeEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 更新操作增强业务
	 * @param t
	 * @return
	 */
	private void doUpdateBus(WmsBasicSyscodetypeEntity t) throws Exception{
		//-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	/**
	 * 删除操作增强业务
	 * @param id
	 * @return
	 */
	private void doDelBus(WmsBasicSyscodetypeEntity t) throws Exception{
	    //-----------------sql增强 start----------------------------
	 	//-----------------sql增强 end------------------------------
	 	
	 	//-----------------java增强 start---------------------------
	 	//-----------------java增强 end-----------------------------
 	}
 	
 	private Map<String,Object> populationMap(WmsBasicSyscodetypeEntity t){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", t.getId());
		map.put("pk_syscodetypecode", t.getPkSyscodetypecode());
		map.put("syscodetypenamecn", t.getSyscodetypenamecn());
		map.put("syscodetypenameen", t.getSyscodetypenameen());
		map.put("codelength", t.getCodelength());
		map.put("variant1", t.getVariant1());
		map.put("variant2", t.getVariant2());
		map.put("variant3", t.getVariant3());
		return map;
	}
 	
 	/**
	 * 替换sql中的变量
	 * @param sql
	 * @param t
	 * @return
	 */
 	public String replaceVal(String sql,WmsBasicSyscodetypeEntity t){
 		sql  = sql.replace("#{id}",String.valueOf(t.getId()));
 		sql  = sql.replace("#{pk_syscodetypecode}",String.valueOf(t.getPkSyscodetypecode()));
 		sql  = sql.replace("#{syscodetypenamecn}",String.valueOf(t.getSyscodetypenamecn()));
 		sql  = sql.replace("#{syscodetypenameen}",String.valueOf(t.getSyscodetypenameen()));
 		sql  = sql.replace("#{codelength}",String.valueOf(t.getCodelength()));
 		sql  = sql.replace("#{variant1}",String.valueOf(t.getVariant1()));
 		sql  = sql.replace("#{variant2}",String.valueOf(t.getVariant2()));
 		sql  = sql.replace("#{variant3}",String.valueOf(t.getVariant3()));
 		sql  = sql.replace("#{UUID}",UUID.randomUUID().toString());
 		return sql;
 	}
 	
 	/**
	 * 执行JAVA增强
	 */
 	private void executeJavaExtend(String cgJavaType,String cgJavaValue,Map<String,Object> data) throws Exception {
 		if(StringUtil.isNotEmpty(cgJavaValue)){
			Object obj = null;
			try {
				if("class".equals(cgJavaType)){
					//因新增时已经校验了实例化是否可以成功，所以这块就不需要再做一次判断
					obj = MyClassLoader.getClassByScn(cgJavaValue).newInstance();
				}else if("spring".equals(cgJavaType)){
					obj = ApplicationContextUtil.getContext().getBean(cgJavaValue);
				}
				if(obj instanceof CgformEnhanceJavaInter){
					CgformEnhanceJavaInter javaInter = (CgformEnhanceJavaInter) obj;
					javaInter.execute("wms_basic_syscodetype",data);
				}
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("执行JAVA增强出现异常！");
			} 
		}
 	}
}