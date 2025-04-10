package kr.hhplus.be.server.domain.service.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hhplus.be.server.domain.model.product.ProductDTO;
import kr.hhplus.be.server.infrastructure.domainjparepository.product.ProductJpaRepository;
import kr.hhplus.be.server.infrastructure.mybatis.product.ProductMapper;

@Service
public class ProductService {
	
	@Autowired
	ProductMapper productMapper;
	
	@Autowired
	ProductJpaRepository productJpaRepositry;
	
	public List<ProductDTO> search(String productName){
		return productMapper.search(productName);
	}
	
	public int order(ProductDTO productDTO) {
		return productJpaRepositry.order(productDTO);
	}
}
