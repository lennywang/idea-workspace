package com.xdclass.business.impl;

import com.xdclass.business.QueryBusiness;
import com.xdclass.constant.DataStatusConstant;
import com.xdclass.middle.Person;
import com.xdclass.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;


/**
 *
 **/
public class QueryBusinessImpl implements QueryBusiness {

    private static final Logger LOGGER = LoggerFactory.getLogger(QueryBusinessImpl.class);

    public List queryList(int count) {
        SqlSession middleSqlSession = SqlSessionUtil.getSqlSession(SqlSessionUtil.MIDDLE);
        List<Object> objectList = null;

        try {
            objectList = middleSqlSession.selectList("", count);
        } catch (Exception e) {
            LOGGER.error("查询发生异常===》", e);
        } finally {
            middleSqlSession.close();
        }
        return objectList;
    }

    public int modifyListStatus(List data, String status) {
        List<Person> people =data;
        people.forEach(p ->{
            p.setDataStatus(DataStatusConstant.DEALING);
            SqlSession middleSqlSession= SqlSessionUtil.getSqlSession(SqlSessionUtil.MIDDLE);
            try {
                middleSqlSession.update("",p);
                middleSqlSession.commit();
            }catch (Exception e){
                LOGGER.error("修改状态失败===》",e);
            }finally {
                middleSqlSession.close();
            }
        });
        return 0;
    }
}
