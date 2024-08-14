package org.example.study_hr.service;

import lombok.RequiredArgsConstructor;
import org.example.study_hr.dao.HRDAO;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class HRService {

    private final HRDAO hrdao;


}
