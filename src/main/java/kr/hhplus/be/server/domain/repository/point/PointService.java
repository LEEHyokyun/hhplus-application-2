package kr.hhplus.be.server.domain.repository.point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hhplus.be.server.domain.model.point.PointDTO;
import kr.hhplus.be.server.infrastructure.domainjparepository.point.PointJpaRepository;

@Service
public class PointService {
	
	@Autowired
	PointJpaRepository pointJpaRepository;
	
	public int insert(PointDTO pointDTO) {
		return pointJpaRepository.save(pointDTO);
	}
}
