package com.currency.model;

import java.math.BigDecimal;

public interface TradingCurrency {
	
	public BigDecimal getExchangeRate(Currency targetCurrency);
	public BigDecimal getExchangedAmount(Currency targetCurrency);
}
