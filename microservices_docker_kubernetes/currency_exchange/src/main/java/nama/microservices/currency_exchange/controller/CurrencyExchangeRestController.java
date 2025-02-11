package nama.microservices.currency_exchange.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import nama.microservices.currency_exchange.entity.CurrencyExchange;
import nama.microservices.currency_exchange.repository.CurrencyExchangeRepo;

@RestController
public class CurrencyExchangeRestController {
	
	
	@Autowired
	CurrencyExchangeRepo repo;
	
	
	@Autowired
	Environment env;
	
	
	@GetMapping("/exchangerate/from/{from}/to/{to}")
	public CurrencyExchange getExchangeRate(@PathVariable String from, @PathVariable String to)
	{
		
		
		CurrencyExchange ce =  this.repo.findByFromAndTo(from, to);
		
		String env = this.env.getProperty("local.server.port");
		ce.setEnvironment(env);
		
		return ce;
		
		
		
	}

}
