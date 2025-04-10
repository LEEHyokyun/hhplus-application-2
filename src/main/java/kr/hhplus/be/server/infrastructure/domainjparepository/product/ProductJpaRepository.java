package kr.hhplus.be.server.infrastructure.domainjparepository.product;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.hhplus.be.server.domain.model.product.ProductDTO;

public interface ProductJpaRepository extends JpaRepository<Long, ProductDTO>{

	int order(ProductDTO productDTO);
	
}
