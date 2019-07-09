package com.jeecg.demo.service;

import org.jeecgframework.core.common.service.CommonService;
import com.jeecg.demo.entity.HelloEntity;

import java.io.Serializable;

/**
 * @Description
 * @Author ghy
 * @Date 2019/7/9 15:12
 */
public interface HelloServiceI extends CommonService {

    public void delete(HelloEntity entity) throws Exception;

    public Serializable save(HelloEntity entity) throws Exception;

    public void saveOrUpdate(HelloEntity entity) throws Exception;

    public void jdbcBatchSave() throws Exception;

    public void jdbcProcedure() throws Exception;
}
