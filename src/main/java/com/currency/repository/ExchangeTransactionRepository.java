package com.currency.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.currency.model.ExchangeTransaction;

@Repository
public interface ExchangeTransactionRepository extends CrudRepository<ExchangeTransaction, Long> {

}
