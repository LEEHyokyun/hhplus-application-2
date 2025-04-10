package kr.hhplus.be.server.interfaces.api.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kr.hhplus.be.server.application.product.ProductFacade;
import kr.hhplus.be.server.domain.model.product.ProductDTO;
import kr.hhplus.be.server.domain.service.product.ProductService;

@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@Autowired
	ProductFacade productFacade;
	
	@GetMapping("/search")
	public List<ProductDTO> search(String productName){
		return productService.search(productName);
	}
	
	@PostMapping("/order")
	public int order(@RequestParam ProductDTO productDTO){
		return productService.order(productDTO);
	}
	
	@PostMapping("/orderpay")
	public int orderAndPay(@RequestParam ProductDTO productDTO) {
		return productFacade.orderAndPay(productDTO);
	}
}
