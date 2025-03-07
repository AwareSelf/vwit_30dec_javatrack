package nama.microservices.currency_conversion.MyConfig;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration(proxyBeanMethods=false)
public class MyConfiguration {
	
	
	    @Bean()
	    RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder.build();
	    }

}
