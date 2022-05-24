package com.naver.line.demo.test;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Test
class TransfersRepositoryTest {
    @Autowired TransfersRepository transfersRepository;

    @Test
    @Order(1)
    @DisplayName("리포지토리에서 실제로 값을 가져오는지 확인한다.")
    void find() {
        List<Transfers> list = transfersRepository.findAll();
        System.out.println(list);
    }
}