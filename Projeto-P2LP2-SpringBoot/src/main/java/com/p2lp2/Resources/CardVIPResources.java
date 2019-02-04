package com.p2lp2.Resources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import com.p2lp2.domain.CardVIP;
import com.p2lp2.repository.CardVIPRepository;


public class CardVIPResources {
	
	@Autowired
	private CardVIPRepository repository;
	
	@GetMapping("/cardvip") //www.meusite.com/cardvip - GET/HTTP
	public List<CardVIP> getAllCardVIP(){
		List<CardVIP> card = repository.findAll();
		return card;
	}
	
	public void save (CardVIP card) {
		repository.save(card);
	}  
	
	public void delete (CardVIP card) {
		repository.delete(card);
		
	}
	
}
	
	
	
