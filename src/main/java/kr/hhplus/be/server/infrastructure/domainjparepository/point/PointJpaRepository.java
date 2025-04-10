package kr.hhplus.be.server.infrastructure.domainjparepository.point;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.hhplus.be.server.domain.model.point.PointDTO;

public interface PointJpaRepository extends JpaRepository<Long, PointDTO>{

	int charge(PointDTO pointDTO);

	int use(PointDTO pointDTO);

}
