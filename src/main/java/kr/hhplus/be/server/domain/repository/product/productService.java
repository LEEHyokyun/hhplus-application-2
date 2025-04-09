package kr.hhplus.be.server.domain.repository.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hhplus.be.server.domain.model.product.ProductDTO;
import kr.hhplus.be.server.infrastructure.mybatis.product.ProductMapper;

@Service
public class productService {
	
	@Autowired
	ProductMapper productMapper;
	
	public List<ProductDTO> search(String productName){
		return productMapper.search(productName);
	}
}
