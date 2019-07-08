package org.jeecgframework.web.system.dao;

import org.jeecgframework.minidao.annotation.MiniDao;
import org.jeecgframework.minidao.annotation.Param;
import org.jeecgframework.minidao.annotation.ResultType;
import org.jeecgframework.minidao.pojo.MiniDaoPage;
import org.jeecgframework.web.system.entity.HelloEntity;


/**
 * @Description
 * @Author ghy
 * @Date 2019/7/8 16:45
 */
@MiniDao
public interface HelloMinidaoDao {

    @ResultType(HelloEntity.class)
    MiniDaoPage<HelloEntity> page(@Param("hello") HelloEntity hello,
                                  @Param("page") int page, @Param("rows") int rows,
                                  @Param("sort") String sort, @Param("order") String order);


}
