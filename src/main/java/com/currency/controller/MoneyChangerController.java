package com.currency.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.currency.request.AddCurrencyRequest;
import com.currency.response.ExchangeResponse;
import com.currency.service.MoneyChangerService;

@RestController
@RequestMapping("/moneychanger/v1")
public class MoneyChangerController {
	
	@Autowired
	public MoneyChangerService moneyChangerService;
	
	@RequestMapping(value = "/addCurrency", method = RequestMethod.POST)
	public String addCurrency(@RequestBody AddCurrencyRequest addCurrencyRequest) {
		BigDecimal exchangeRate = new BigDecimal(addCurrencyRequest.getExchangeRate());
		exchangeRate.setScale(6);
		return moneyChangerService.addCurrency(addCurrencyRequest.getCurrency(), exchangeRate);
	}
	
	@RequestMapping("/checkRate/{currency}")
	public @ResponseBody
	ExchangeResponse checkRate(@PathVariable String currency) {
		return moneyChangerService.checkRate(currency);
	}
	
	@RequestMapping("/checkAmount/{currency}/{amount}")
	public @ResponseBody
	ExchangeResponse checkAmount(@PathVariable String currency, @PathVariable String amount) {
		return moneyChangerService.checkAmount(currency, amount);
	}
	
	@RequestMapping("/recordTransaction/{currency}/{amountPaid}")
	public @ResponseBody
	ExchangeResponse recordTransaction(@PathVariable String currency, @PathVariable String amountPaid) {
		return moneyChangerService.recordTransaction(currency, amountPaid);
	}

}
