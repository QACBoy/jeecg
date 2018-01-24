package com.jeecg.wms_basic.service;
import com.jeecg.wms_basic.entity.WmsBasicSyscodeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface WmsBasicSyscodeServiceI extends CommonService{
	
 	public void delete(WmsBasicSyscodeEntity entity) throws Exception;
 	
 	public Serializable save(WmsBasicSyscodeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(WmsBasicSyscodeEntity entity) throws Exception;
 	
}
