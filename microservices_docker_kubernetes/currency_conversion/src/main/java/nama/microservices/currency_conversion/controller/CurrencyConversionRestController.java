package nama.microservices.currency_conversion.controller;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import nama.microservices.currency_conversion.model.CurrencyConversion;

@RestController
public class CurrencyConversionRestController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/convert/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion calculateCurrencyConversion(@PathVariable String from,
			                                              @PathVariable String to,
			                                              @PathVariable BigDecimal quantity)   
	{
		HashMap<String,String> pathvariables = new HashMap<>();
		
		pathvariables.put("from",from);
		pathvariables.put("to", to);
		
		String uri="http://localhost:8001/exchangerate/from/{from}/to/{to}";
		 
		//call to CurrencyExchange microservice will return CurrencyExchange entity which we will copy/empty into CurrencyConversion
		// entity as CurrencyConversion is superset of CurrencyExchange
		ResponseEntity<CurrencyConversion> re = this.restTemplate.getForEntity(uri, CurrencyConversion.class, pathvariables);
		
		CurrencyConversion currConversion = re.getBody();
		
		
		BigDecimal finalAmt = quantity.multiply(currConversion.getConversionRate());
		
		currConversion.setCalculatedAmt(finalAmt);
		currConversion.setQuantity(quantity);
				
		return currConversion; 
		 
				
	}

}
