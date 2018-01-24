package com.jeecg.person2.service;
import com.jeecg.person2.entity.TableTest4Entity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TableTest4ServiceI extends CommonService{
	
 	public void delete(TableTest4Entity entity) throws Exception;
 	
 	public Serializable save(TableTest4Entity entity) throws Exception;
 	
 	public void saveOrUpdate(TableTest4Entity entity) throws Exception;
 	
}
