package com.jeecg.demo.service.impl;

import org.apache.log4j.Logger;
import org.jeecgframework.core.common.service.impl.CommonServiceImpl;
import com.jeecg.demo.entity.HelloEntity;
import com.jeecg.demo.service.HelloServiceI;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * @Description
 * @Author ghy
 * @Date 2019/7/9 15:13
 */
@Service("helloService")
@Transactional
public class HelloServiceIImpl extends CommonServiceImpl implements HelloServiceI {
    private static final Logger logger = Logger.getLogger(HelloServiceIImpl.class);


    @Override
    public void delete(HelloEntity entity) throws Exception {
        super.delete(entity);
    }

    @Override
    public Serializable save(HelloEntity entity) throws Exception {
        Serializable t = super.save(entity);
        return t;
    }

    @Override
    public void saveOrUpdate(HelloEntity entity) throws Exception {
        super.saveOrUpdate(entity);
    }

    @Override
    public void jdbcBatchSave() throws Exception {

    }

    @Override
    public void jdbcProcedure() throws Exception {

    }
}
