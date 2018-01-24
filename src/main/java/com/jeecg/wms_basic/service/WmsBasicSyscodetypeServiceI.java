package com.jeecg.wms_basic.service;
import com.jeecg.wms_basic.entity.WmsBasicSyscodetypeEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface WmsBasicSyscodetypeServiceI extends CommonService{
	
 	public void delete(WmsBasicSyscodetypeEntity entity) throws Exception;
 	
 	public Serializable save(WmsBasicSyscodetypeEntity entity) throws Exception;
 	
 	public void saveOrUpdate(WmsBasicSyscodetypeEntity entity) throws Exception;
 	
}
