package com.currency.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExchangeTransaction {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long transactionId;
	private String baseCurrency;
	private String targetCurrency;
	private BigDecimal amountPaid;
	private Date transactionDate;
	private String cashierName;
	private String outlet;

	public ExchangeTransaction() {		
	}
	
	public ExchangeTransaction(Long transactionId, String baseCurrency, String targetCurrency, 
			BigDecimal amountPaid, Date transactionDate, String cashierName, String outlet) {		
		this.transactionId = transactionId;
		this.baseCurrency = baseCurrency;
		this.targetCurrency = targetCurrency;		
		this.amountPaid = amountPaid;
		this.transactionDate = transactionDate;
		this.cashierName = cashierName;
		this.outlet = outlet;
	}

	public Long getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(Long transactionId) {
		this.transactionId = transactionId;
	}

	public String getBaseCurrency() {
		return baseCurrency;
	}

	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}

	public String getTargetCurrency() {
		return targetCurrency;
	}

	public void setTargetCurrency(String targetCurrency) {
		this.targetCurrency = targetCurrency;
	}	

	public BigDecimal getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(BigDecimal amountPaid) {
		this.amountPaid = amountPaid;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getCashierName() {
		return cashierName;
	}

	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}

	public String getOutlet() {
		return outlet;
	}

	public void setOutlet(String outlet) {
		this.outlet = outlet;
	}

}
