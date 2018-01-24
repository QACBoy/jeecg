package com.jeecg.demo.service;

import com.jeecg.demo.entity.JeecgDemoEntity;

import java.io.Serializable;

public interface MyService {
    public void delete(JeecgDemoEntity entity) throws Exception;

    public Serializable save(JeecgDemoEntity entity) throws Exception;

    public void saveOrUpdate(JeecgDemoEntity entity) throws Exception;
    public void jdbcBatchSave() throws Exception;

    public void jdbcProcedure() throws Exception;
}
