package com.p2lp2.Resources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.p2lp2.domain.Worker;
import com.p2lp2.repository.WorkerRepository;

public class WorkerResources {
	@Autowired
	private WorkerRepository repository;
	
	@GetMapping("/workers") //www.meusite.com/workers - GET/HTTP
	public List<Worker> getAllWoker(){
		List<Worker> workes = repository.findAll();
		return workes;
	}
	
	public void save (Worker worker) {
		repository.save(worker);
	}  
	
	public void delete (Worker worker) {
		repository.delete(worker);
		
	}
}
