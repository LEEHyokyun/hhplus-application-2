package kr.hhplus.be.server.infrastructure.mybatis.product;

import java.util.List;

import org.springframework.data.repository.query.Param;

import kr.hhplus.be.server.domain.model.product.ProductDTO;

@Mapper
public interface ProductMapper {
	List<ProductDTO> search(@Param("productName") String productName);
}
