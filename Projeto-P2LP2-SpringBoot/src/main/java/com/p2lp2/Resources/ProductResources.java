package com.p2lp2.Resources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.p2lp2.domain.Product;
import com.p2lp2.repository.ProductRepository;

public class ProductResources {
	
	@Autowired
	private ProductRepository repository;
	
	@GetMapping("/products") //www.meusite.com/products - GET/HTTP
	public List<Product> getAllClient(){
		List<Product> products = repository.findAll();
		return products;
	}
	
	public void save (Product product) {
		repository.save(product);
	}  
	
	public void delete (Product product) {
		repository.delete(product);
		
	}
	
}
