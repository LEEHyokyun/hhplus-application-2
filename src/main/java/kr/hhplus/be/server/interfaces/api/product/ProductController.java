package kr.hhplus.be.server.interfaces.api.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hhplus.be.server.domain.model.product.ProductDTO;
import kr.hhplus.be.server.domain.repository.product.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@GetMapping("/search")
	public List<ProductDTO> search(String productName){
		return productService.search(productName);
	}
}
