package com.naver.line.demo.test;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import java.rmi.ServerException;
import java.util.List;

@RestController
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

    @GetMapping(value = "/exception/{id}")
    public String exceptionSample(@PathVariable("id") String id) {
        if (id.equals("ex")) {
            throw new RuntimeException("500 error");
        }

        if (id.equals("error")) {
            throw new IllegalArgumentException("400 error");
        }

        return "ok";
    }
}
