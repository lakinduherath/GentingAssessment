package com.currency.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrencyRate {

	@Id
	private String targetCurrency;
	private String baseCurrency;
	@Column(precision=11, scale=6)
	private BigDecimal exchangeRate;
	
	public CurrencyRate() {
		
	}	

	public CurrencyRate(String targetCurrency, String baseCurrency, BigDecimal exchangeRate) {
		this.targetCurrency = targetCurrency;
		this.baseCurrency = baseCurrency;
		this.exchangeRate = exchangeRate;
	}

	public String getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}
