package kr.hhplus.be.server.infrastructure.domainjparepository.history.producthistory;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.hhplus.be.server.domain.model.history.producthistory.ProductHistoryDTO;

public interface ProductHistoryJpaRepository extends JpaRepository<Long, ProductHistoryDTO>{

	int save(ProductHistoryDTO productHistoryDTO);

}
