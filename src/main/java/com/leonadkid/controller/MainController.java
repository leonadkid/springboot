package com.leonadkid.controller;

import com.leonadkid.model.Transactions;
import com.leonadkid.repository.TransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private TransactionsRepository transactionRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewTransaction(@RequestParam Date date, @RequestParam String entity,
                                                 @RequestParam String categoryId, @RequestParam String paymentTypeId,
                                                 @RequestParam Float amount, @RequestParam Integer transactionType,
                                                 @RequestParam String note){
        Transactions transaction = new Transactions();
        transaction.setDate(date);
        transaction.setEntity(entity);
        transaction.setCategoryId(categoryId);
        transaction.setPaymentTypeId(paymentTypeId);
        transaction.setAmount(amount);
        transaction.setTransactionType(transactionType);
        transaction.setNote(note);
        transactionRepository.save(transaction);

        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody Iterable<Transactions> getAllTransaction(){
        return transactionRepository.findAll();
    }

    @GetMapping(path = "/search")
    public @ResponseBody Transactions getTransactionById(@RequestParam Integer id){
        return transactionRepository.findById(id).get();
    }
}
