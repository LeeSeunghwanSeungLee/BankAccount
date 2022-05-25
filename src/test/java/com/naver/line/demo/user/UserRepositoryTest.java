package com.naver.line.demo.user;

import com.naver.line.demo.account.AccountRepository;
import com.naver.line.demo.account.entities.Account;
import com.naver.line.demo.test.Transfers;
import com.naver.line.demo.test.TransfersRepository;
import com.naver.line.demo.user.entities.User;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Test
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Autowired
    AccountRepository accountRepository;

    @Test
    @Order(1)
    @DisplayName("리포지토리에서 실제로 값을 가져오는지 확인한다.")
    void findAll() {
        List<User> list = userRepository.findAll();
        for (User a : list) {
            System.out.println(a.getId() + " : " + a.getName() + " : " + a.getCreatedAt());
        }
    }

    @Test
    @Order(2)
    @DisplayName("리포지토리에서 값을 저장하고 가져오는 작업을 수행한다.")
    void save() {
        User newUser = new User("new", "asdfasdf@naver.com", "010-4990-1133", LocalDate.now());
        userRepository.save(newUser);

        User target = userRepository.findByName("new");
        System.out.println(target.getName());
    }

    @Test
    @Order(1)
    @DisplayName("리포지토리에서 실제로 값을 가져오는지 확인한다.")
    void findAllAccount() {
        List<Account> list = accountRepository.findAll();
        for (Account a : list) {
            System.out.println(a.getId() + " : " + a.getNumber());
        }
    }

}