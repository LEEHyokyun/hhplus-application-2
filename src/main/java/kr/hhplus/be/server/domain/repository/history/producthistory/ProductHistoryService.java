package kr.hhplus.be.server.domain.repository.history.producthistory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hhplus.be.server.domain.model.history.producthistory.ProductHistoryDTO;
import kr.hhplus.be.server.infrastructure.domainjparepository.history.producthistory.ProductHistoryJpaRepository;

@Service
public class ProductHistoryService {

	@Autowired
	ProductHistoryJpaRepository productHistoryJpaRepository;
	
	public int insert(ProductHistoryDTO productHistoryDTO) {
		return productHistoryJpaRepository.insert(productHistoryDTO);
	}
}
