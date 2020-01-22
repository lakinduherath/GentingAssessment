package com.currency.response;

import java.math.BigDecimal;
import java.util.Date;

public class ExchangeResponse {

	private String status;
	private String currency;
	private BigDecimal exchangeRate;
	private BigDecimal exchangeAmount;
	private Date date;

	public ExchangeResponse() {
	}
	
	public ExchangeResponse(String status) {
		this.status = status;
	}

	public ExchangeResponse(String status, String currency, BigDecimal exchangeRate, BigDecimal exchangeAmount, Date date) {
		this.status = status;
		this.currency = currency;
		this.exchangeRate = exchangeRate;
		this.exchangeAmount = exchangeAmount;
		this.date = date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(BigDecimal exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	public BigDecimal getExchangeAmount() {
		return exchangeAmount;
	}

	public void setExchangeAmount(BigDecimal exchangeAmount) {
		this.exchangeAmount = exchangeAmount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
