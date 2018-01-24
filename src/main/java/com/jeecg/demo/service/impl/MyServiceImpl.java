package com.jeecg.demo.service.impl;

import com.jeecg.demo.entity.JeecgDemoEntity;
import com.jeecg.demo.service.MyService;
import org.jeecgframework.core.common.dao.jdbc.JdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;


@Service("myService")
@Transactional
public class MyServiceImpl implements MyService {

    @Autowired
    private JdbcDao jdbcDao;

    @Override
    public void delete(JeecgDemoEntity entity) throws Exception {
        jdbcDao.getMaxRows();

    }

    @Override
    public Serializable save(JeecgDemoEntity entity) throws Exception {
        return null;
    }

    @Override
    public void saveOrUpdate(JeecgDemoEntity entity) throws Exception {

    }

    @Override
    public void jdbcBatchSave() throws Exception {

    }

    @Override
    public void jdbcProcedure() throws Exception {

    }
}
