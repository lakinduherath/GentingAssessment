package com.currency.request;

public class AddCurrencyRequest {

	private String currency;
	private String exchangeRate;

	public AddCurrencyRequest(String currency, String exchangeRate) {
		this.currency = currency;
		this.exchangeRate = exchangeRate;
	}

	public AddCurrencyRequest() {
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(String exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

}
