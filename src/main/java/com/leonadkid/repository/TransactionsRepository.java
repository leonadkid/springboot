package com.leonadkid.repository;

import com.leonadkid.model.Transactions;
import org.springframework.data.repository.CrudRepository;

public interface TransactionsRepository extends CrudRepository<Transactions, Integer> {
}
