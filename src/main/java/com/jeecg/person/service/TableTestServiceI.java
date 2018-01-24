package com.jeecg.person.service;
import com.jeecg.person.entity.TableTestEntity;
import org.jeecgframework.core.common.service.CommonService;

import java.io.Serializable;

public interface TableTestServiceI extends CommonService{
	
 	public void delete(TableTestEntity entity) throws Exception;
 	
 	public Serializable save(TableTestEntity entity) throws Exception;
 	
 	public void saveOrUpdate(TableTestEntity entity) throws Exception;
 	
}
