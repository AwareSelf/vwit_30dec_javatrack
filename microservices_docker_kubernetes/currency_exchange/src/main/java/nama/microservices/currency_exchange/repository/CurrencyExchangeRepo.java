package nama.microservices.currency_exchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import nama.microservices.currency_exchange.entity.CurrencyExchange;

@Repository
public interface CurrencyExchangeRepo extends JpaRepository<CurrencyExchange,Long> {
	
	CurrencyExchange findByFromAndTo(String from,String to);

}
