package com.naver.line.demo.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * table 생성을 위한 엔티티
 * 대상 Entity의 pk type
 */
@Repository
public interface SampleRepository extends JpaRepository<SampleEntity, Long> {

}
