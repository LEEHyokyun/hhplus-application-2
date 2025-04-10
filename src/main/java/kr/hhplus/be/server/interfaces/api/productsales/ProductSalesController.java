package kr.hhplus.be.server.interfaces.api.productsales;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.hhplus.be.server.domain.model.productsales.ProductSalesDTO;
import kr.hhplus.be.server.domain.service.productsales.ProductSalesService;

@RequestMapping("/productsales")
@RestController
public class ProductSalesController {

	@Autowired
	ProductSalesService productSalesService;
	
	@GetMapping("/search")
	public List<ProductSalesDTO> search(){
		return productSalesService.search();
	}
}
