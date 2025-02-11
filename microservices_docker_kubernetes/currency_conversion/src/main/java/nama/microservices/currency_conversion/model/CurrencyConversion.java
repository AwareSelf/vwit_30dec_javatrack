package nama.microservices.currency_conversion.model;

import java.math.BigDecimal;


public class CurrencyConversion {
	

	private Long id;
	
    private String from;
	
	private String to;
	
	private BigDecimal conversionRate;
	
	private BigDecimal quantity;
	
	private BigDecimal calculatedAmt;
		
	private String environment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getCalculatedAmt() {
		return calculatedAmt;
	}

	public void setCalculatedAmt(BigDecimal calculatedAmt) {
		this.calculatedAmt = calculatedAmt;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CurrencyConversion))
			return false;
		CurrencyConversion other = (CurrencyConversion) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CurrencyConversion [id=" + id + ", from=" + from + ", to=" + to + ", conversionRate=" + conversionRate
				+ ", quantity=" + quantity + ", calculatedAmt=" + calculatedAmt + ", environment=" + environment + "]";
	}

	
	
}
