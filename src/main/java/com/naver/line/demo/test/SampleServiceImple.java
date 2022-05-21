package com.naver.line.demo.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleServiceImple implements SampleService{

    private final SampleRepository sampleRepository;

    /**
     * 데이터 전체 조회
     */
    @Override
    public List<SampleEntity> list() {
        List<SampleEntity> list = sampleRepository.findAll();
        return list;
    }
}
