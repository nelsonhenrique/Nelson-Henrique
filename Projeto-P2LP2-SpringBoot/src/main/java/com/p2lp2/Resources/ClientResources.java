package com.p2lp2.Resources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.p2lp2.domain.Client;
import com.p2lp2.repository.ClientRepository;

public class ClientResources {
	
	@Autowired
	private ClientRepository repository;
	
	@GetMapping("/clients") //www.meusite.com/clients - GET/HTTP
	public List<Client> getAllClient(){
		List<Client> clients = repository.findAll();
		return clients;
	}
	
	public void save (Client client) {
		repository.save(client);
	}  
	
	public void delete (Client client) {
		repository.delete(client);
		
	}
}
