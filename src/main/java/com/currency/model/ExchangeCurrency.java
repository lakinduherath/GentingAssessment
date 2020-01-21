package com.currency.model;

import java.math.BigDecimal;

public class ExchangeCurrency extends Currency{
	
	public Integer getId(){
		return this.id;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	@Override
	public BigDecimal getExchangeRate(Currency targetCurrency) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BigDecimal getExchangedAmount(Currency targetCurrency) {
		// TODO Auto-generated method stub
		return null;
	}

}
