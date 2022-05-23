## 기능리스트 정리

#### 공통 및 1번 문제 해결 

* 라이브러리 추가
  * pom.xml에 구현한다
  * Jpa 추가 및 테스트 진행 [0]
  * Junit5 추가 및 테스트 진행 [0]

* WebConfig.java
  * bean 또는 filter, converter, formatter, intercepter 등을 추가할 컴포넌트 구현 클래스입니다. [0]
  * 빈을 추가한 후 컨텍스트에 추가되어있는지 테스트 케이스를 구현할 줄 알아야합니다. [0]
  * `@Configuration` 에 추가한 빈과, `@Component` 를 통한 빈 추가의 경우, 반환 타입이 동일하면 중복이 될 가능성이 있으므로 name || Qualifier 를 고려해봅시다.

* 유저 엔티티 구현
  * .sql을 보고 유저 엔티티를 구현합니다. [0]
  * 테스트 케이스를 작성합니다. [0]
 
* Filter
  * request 헤더 정보에 문제에서 특정한 키값이 존재하는지 확인하기 위한 필터입니다.
  * 존재하지 않는다면 ExceptionHandler를 참조하여 ResponseStatus를 401(anauthorization) 으로 구현합니다. [0]
  * `@Configuration` 클래스를 필터를 추가하기 위한 추상 클래스 또는 인터페이스를 상속받아 구현합니다. [0]
  * `Spring Security` 를 검토합니다 [link](https://kimchanjung.github.io/programming/2020/07/01/spring-security-01/)


* interceptor
  * 필터는 WAS 에서 먼저 적용하는 기술이기 때문에 service, repository 적용이 힘들 수 있다. [0]
  * 스프링 기술을 활용하기 위해 인터셉터 적용도 고려해볼 필요가 있다. [0]

* ArgumentResolver
  * Sample 구현하기 [0]

* 컨트롤러 세팅
  * 계좌 설명을 위한 컨트롤러 진입점을 ApplicationContext에 구현합니다.[0]

* 계좌 엔티티 구현
  * .sql을 보고 계좌 엔티티를 구현합니다. [0]
* ExceptionHandler 구현
  * 컨트롤러 이후, 비지니스 로직 수행 중에 에러를 핸들링 하기 위해 Api Exception Handler 샘플을 구현한다.
  
* 리포지토리 설계
  * 위 2가지의 엔티티(유저, 계좌)를 기반으로 h2 와 연동할 수 있는 리포지토리르 설계합니다.
  * 유연성을 확보하기 위해서 인터페이스를 설계하여 OCP, DIP 를 적용할 수 있도록 합니다.
  * 이를 위해 일단 인메모리방식으로 저장하는 클래스를 구현한 후 h2와 연동하는 것도 방법이 될 수 있습니다.
  * findAll, findById(pk), update, delete 등 일반적인 CRUD 관련 리포지토리를 설계합니다 (JPA)를 확인해본다.

* 서비스 설계
  * 일반적인 비즈니스 로직에 맞게 문제를 풀기위한 설계를 진행합니다.

* 컨트롤러 설계
  * 테스트 코드 통과를 위한 해결을 합니다.
  
* 잊지말고, docs 파일을 만들기 위한 라이브러리를 찾아봐야 합니다.
#### 계속 업데이트하여 살아있는 기능구현 문서를 만들고 있습니다.
