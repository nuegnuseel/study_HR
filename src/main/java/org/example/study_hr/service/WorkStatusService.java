package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WorkStatusService {
    private final SqlSessionTemplate sqlSessionTemplate;

}
