package com.jeecg.test1.service;
import com.jeecg.test1.entity.TableTest5Entity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TableTest5ServiceI extends CommonService{
	
 	public void delete(TableTest5Entity entity) throws Exception;
 	
 	public Serializable save(TableTest5Entity entity) throws Exception;
 	
 	public void saveOrUpdate(TableTest5Entity entity) throws Exception;
 	
}
