package com.currency.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.currency.repository.CurrencyRateRepository;
import com.currency.repository.ExchangeTransactionRepository;

@ContextConfiguration(classes = {MoneyChangerService.class})
//@RunWith(SpringRunner.class)
@SpringBootTest
class MoneyChangerServiceTest {
	
	@Autowired
	private MoneyChangerService service;
	
	@InjectMocks
	private CurrencyRateRepository currencyRateRepository;
	
	@InjectMocks
	private ExchangeTransactionRepository exchangeTransactionRepository;
	
	@Test
	void testAddCurrency() {
		assertEquals("SUCCESS", service.addCurrency("USD", new BigDecimal("0.742164")));;
	}

	@Test
	void testCheckRate() {
//		fail("Not yet implemented");
	}

	@Test
	void testCheckAmount() {
//		fail("Not yet implemented");
	}

	@Test
	void testRecordTransaction() {
//		fail("Not yet implemented");
	}

}
