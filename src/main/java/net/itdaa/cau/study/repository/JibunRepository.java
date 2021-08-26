package net.itdaa.cau.study.repository;

//Entity 객체로 DB 테이블 구조 알려주는 느낌?
import net.itdaa.cau.study.entity.Jibun;
import net.itdaa.cau.study.entity.JibunIntg;
import net.itdaa.cau.study.entity.RoadAddrIntg;
import net.itdaa.cau.study.entity.RoadAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * DB의 Table (RoadAddrIntg Entity) 와 연결하여 Table 처리를 위한 JPA Repository 객체
 */

@Repository
public interface JibunRepository extends JpaRepository<JibunIntg, String> {
    // 도로명주소의 관리번호 = 로 조회해서 서울특별시, 종로구, 청운동, 3, 100 가져올거야!
    List<Jibun> findByMgrNo(String mgrNo);

}
