package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.dao.ShareDAO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class WorkStatusService {
    private final ShareDAO shareDAO;

    public void insertWorkStatus(Map param) {
        shareDAO.insert("insertWorkStatus", param);
    }

    public void deleteWorkStatus(Map param) {
        shareDAO.delete("deleteWorkStatus", param);
    }

    public Object selectWorkStatus(Map param) {
        Object result = shareDAO.getOne("selectWorkStatus", param);
        return result;
    }

}
