package kr.hhplus.be.server.domain.service.productsales;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.hhplus.be.server.domain.model.productsales.ProductSalesDTO;
import kr.hhplus.be.server.infrastructure.mybatis.productsales.ProductSalesMapper;

@Service
public class ProductSalesService {
	
	@Autowired
	ProductSalesMapper productSalesMapper;
	
	public List<ProductSalesDTO> search(){
		return productSalesMapper.search();
	}
}
