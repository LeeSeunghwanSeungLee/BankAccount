package com.naver.line.demo.account;

import com.naver.line.demo.account.entities.Account;
import com.naver.line.demo.user.entities.User;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Test Method 순서를 위해 추가
class AccountRepositoryTest {
    @Autowired
    AccountRepository accountRepository;

    @Test
    @Order(2)
    void select() { // 저장된 데이터 모두를 Spring JPA에 미리 구현된 findAll 명령을 통해 불러온다.
        List<Account> userList = accountRepository.findAll();
        for(Account u : userList) System.out.println("[FindAll]: " + u.getId() + " | " +u.getNumber());
    }
}