package kr.hhplus.be.server.domain.service.point;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hhplus.be.server.domain.model.point.PointDTO;
import kr.hhplus.be.server.infrastructure.domainjparepository.point.PointJpaRepository;
import kr.hhplus.be.server.infrastructure.mybatis.point.PointMapper;

@Service
public class PointService {
	
	@Autowired
	PointJpaRepository pointJpaRepository;
	
	@Mapper
	PointMapper pointMapper;
	
	public int charge(PointDTO pointDTO) {
		return pointJpaRepository.charge(pointDTO);
	}
	
	public int use(PointDTO pointDTO) {
		return pointJpaRepository.use(pointDTO);
	}
	
	public PointDTO search(String userId){
		return pointMapper.search(userId);
	}
}
