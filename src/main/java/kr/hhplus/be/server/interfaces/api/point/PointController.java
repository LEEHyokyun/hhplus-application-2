package kr.hhplus.be.server.interfaces.api.point;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hhplus.be.server.domain.model.point.PointDTO;
import kr.hhplus.be.server.domain.service.point.PointService;

@RequestMapping("/point")
@RestController
public class PointController {
	
	@Autowired
	PointService pointService;
	
	@PostMapping("/charge")
	public int charge(PointDTO pointDTO) {
		return pointService.charge(pointDTO);
	}
	
	@PostMapping("/use")
	public int use(PointDTO pointDTO) {
		return pointService.use(pointDTO);
	}
}
