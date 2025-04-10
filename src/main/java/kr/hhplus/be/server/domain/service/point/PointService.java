package kr.hhplus.be.server.domain.service.point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hhplus.be.server.domain.model.point.PointDTO;
import kr.hhplus.be.server.infrastructure.domainjparepository.point.PointJpaRepository;

@Service
public class PointService {
	
	@Autowired
	PointJpaRepository pointJpaRepository;
	
	public int charge(PointDTO pointDTO) {
		return pointJpaRepository.charge(pointDTO);
	}
	
	public int use(PointDTO pointDTO) {
		return pointJpaRepository.use(pointDTO);
	}
}
