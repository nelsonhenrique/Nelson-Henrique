package com.p2lp2.Resources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.p2lp2.domain.Sale;
import com.p2lp2.repository.SaleRepository;

public class SaleResources {
	
	@Autowired
	private SaleRepository repository;
	
	@GetMapping("/sales") //www.meusite.com/sales - GET/HTTP
	public List<Sale> getAllSale(){
		List<Sale> sales = repository.findAll();
		return sales;
	}
	
	public void save (Sale sale) {
		repository.save(sale);
	}  
	
	public void delete (Sale sale) {
		repository.delete(sale);
		
	}
	
	
}
