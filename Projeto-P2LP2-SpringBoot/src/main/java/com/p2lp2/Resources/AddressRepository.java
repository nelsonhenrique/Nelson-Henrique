package com.p2lp2.Resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.p2lp2.domain.Address;


public class AddressRepository {
	@Autowired
	private com.p2lp2.repository.AddressRepository repository;
	
	@GetMapping("/addresses") //www.meusite.com/addresses - GET/HTTP
	public List<Address> getAllAddress(){
		List<Address> addresses = repository.findAll();
		return addresses;
	}
	
	public void save (Address address) {
		repository.save(address);
	}  
	
	public void delete (Address address) {
		repository.delete(address);
		
	}

}
