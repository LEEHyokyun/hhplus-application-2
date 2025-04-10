package kr.hhplus.be.server.domain.service.history.pointhistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hhplus.be.server.domain.model.history.pointhistory.PointHistoryDTO;
import kr.hhplus.be.server.infrastructure.domainjparepository.history.pointhistory.PointHistoryJpaRepository;

@Service
public class PointHistoryService {
	
	@Autowired
	PointHistoryJpaRepository pointHistoryRepository;
	
	public int insert(PointHistoryDTO pointHistoryDTO) {
		return pointHistoryRepository.save(pointHistoryDTO);
	}
}
