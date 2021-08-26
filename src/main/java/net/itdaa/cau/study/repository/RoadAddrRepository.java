package net.itdaa.cau.study.repository;

//Entity 객체로 DB 테이블 구조 알려주는 느낌?
import net.itdaa.cau.study.entity.RoadAddrIntg;
import net.itdaa.cau.study.entity.RoadAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DB의 Table (RoadAddrIntg Entity) 와 연결하여 Table 처리를 위한 JPA Repository 객체
 */

@Repository
public interface RoadAddrRepository extends JpaRepository<RoadAddrIntg, String> {
    //JPA를 사용해 DB를 사용하기 위한 Repository 클래스
    //저거 상속받으면 기본적인 CRUD 메소드가 자동으로 생성된대
    //위의 기본 기능을 제외한 조회 기능을 추가하고 싶으면 규칙에 맞는 메서드 추가하자!

    //와! findBy로 시작하는건 규칙에 맞춘거래! 쿼리를 요청하는 메소드임~~

    // 도로명주소를 도로명 LIKE 로 조회 ( LIKE '검색어%' )
    List<RoadAddress> findByRoadNameStartingWith(String roadName);

    // 도로명주소를 도로명 LIKE 와 빌딩본번 = 로 조회
    List<RoadAddress> findByRoadNameStartingWithAndBldgMainNo(String roadName, Integer bldgMainNo);

    // 도로명주소를 도로명,빌딩본번,빌딩부번 모두 = 로 조회
    List<RoadAddress> findByRoadNameAndBldgMainNoAndBldgSubNo(String roadName, Integer bldgMainNo, Integer bldgSubNo);
}
