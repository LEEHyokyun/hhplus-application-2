package kr.hhplus.be.server.infrastructure.domainjparepository.history.pointhistory;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.hhplus.be.server.domain.model.history.pointhistory.PointHistoryDTO;

public interface PointHistoryJpaRepository extends JpaRepository<Long, PointHistoryDTO>{

	int save(PointHistoryDTO pointHistoryDTO);
	
}
