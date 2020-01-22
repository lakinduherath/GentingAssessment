package com.currency.service;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currency.model.CurrencyRate;
import com.currency.model.ExchangeTransaction;
import com.currency.repository.CurrencyRateRepository;
import com.currency.repository.ExchangeTransactionRepository;
import com.currency.response.ExchangeResponse;

@Service
public class MoneyChangerService {
	
	@Autowired
	private CurrencyRateRepository currencyRateRepository;
	
	@Autowired
	private ExchangeTransactionRepository exchangeTransactionRepository;

	public String addCurrency(String currency, BigDecimal exchangeRate) {
		CurrencyRate savedCurrency = currencyRateRepository
				.save(new CurrencyRate(currency, "SGD", exchangeRate));
		return savedCurrency != null ? "OK" : "ERROR";

	}
	
	public ExchangeResponse checkRate(String currency) {
		CurrencyRate currencyRate = currencyRateRepository.findById(currency).orElse(null);
		if(null != currencyRate) {
			BigDecimal exchangeRate = currencyRate.getExchangeRate();
			exchangeRate.setScale(6);
			return new ExchangeResponse("SUCCESS",currencyRate.getTargetCurrency(), exchangeRate, null, new Date());
		}
		return new ExchangeResponse("FAILURE");
	}

	public ExchangeResponse checkAmount(String currency, String amount) {
		CurrencyRate currencyRate = currencyRateRepository.findById(currency).orElse(null);
		if(null != currencyRate) {
			BigDecimal exchangeAmount = new BigDecimal(amount).multiply(currencyRate.getExchangeRate());
			exchangeAmount = exchangeAmount.setScale(0, BigDecimal.ROUND_DOWN);
			return new ExchangeResponse("SUCCESS",currencyRate.getTargetCurrency(), currencyRate.getExchangeRate(), exchangeAmount, new Date());
		}
		return new ExchangeResponse("FAILURE");
	}

	public ExchangeResponse recordTransaction(String currency, String amountPaid) {
		ExchangeTransaction transaction = new ExchangeTransaction(); 
		transaction.setBaseCurrency("SGD");
		transaction.setTargetCurrency(currency);				
		transaction.setAmountPaid(new BigDecimal(amountPaid));
		transaction.setTransactionDate(new Date());
		exchangeTransactionRepository.save(transaction);
		return new ExchangeResponse("SUCCESS");
	}

	

}
