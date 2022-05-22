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
    @Order(1)
    void save() { // User 객체를 생성하여 User 테이블에 저장한다.
        Account account = new Account();
        account.setStatus(User.Status.ENABLED);
        account.setAmount(1);
        account.setNumber("100");
        account.setDaily_transfer_limit(1);
        account.setTransfer_limit(1);
        account.setUser_id(1);
        accountRepository.save(account);

        System.out.println(account.getUser_id());

        account = new Account();
        account.setStatus(User.Status.ENABLED);
        account.setAmount(1);
        account.setNumber("105");
        account.setDaily_transfer_limit(1);
        account.setTransfer_limit(1);
        account.setUser_id(2);
        accountRepository.save(account);

        System.out.println(account.getUser_id());
    }

    @Test
    @Order(2)
    void select() { // 저장된 데이터 모두를 Spring JPA에 미리 구현된 findAll 명령을 통해 불러온다.
        List<Account> userList = accountRepository.findAll();
        for(Account u : userList) System.out.println("[FindAll]: " + u.getId() + " | " +u.getNumber());
    }
}