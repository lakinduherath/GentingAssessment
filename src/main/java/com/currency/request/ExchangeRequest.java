package com.currency.request;

import java.math.BigDecimal;

public class ExchangeRequest {

	private String currency;
	private BigDecimal amount;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

}
