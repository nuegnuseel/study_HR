package org.example.study_hr.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class HRDao {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;


    public Object insert(String sqlMapId, Object dataMap){
        Object result = sqlSessionTemplate.insert(sqlMapId, dataMap);
        return result;
    }
}
