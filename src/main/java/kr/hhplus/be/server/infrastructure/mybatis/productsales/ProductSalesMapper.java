package kr.hhplus.be.server.infrastructure.mybatis.productsales;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import kr.hhplus.be.server.domain.model.productsales.ProductSalesDTO;

@Mapper
public interface ProductSalesMapper {

	/*
	 * JpaImpl 대신에 mybatis 사용하여 구현
	 * */
	
	List<ProductSalesDTO> search();
}
