package com.naver.line.demo.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping(value = "/api/sample")
public class SampleController {

    private final SampleService sampleService;


    /**
     * 전체 데이터 조회
     * @return 전체 데이터
     */
    @GetMapping(value = "/all")
    public ResponseEntity<?> list() {
        List<SampleEntity> list = sampleService.list();
        return ResponseEntity.ok().body(list);
    }
}
