package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
    @Autowired
    private TransactionRepository transactionRepository;

    @PostMapping(path = "/add")
    public @ResponseBody String addNewTransaction(@RequestParam Date date, @RequestParam String entity,
                                                 @RequestParam String categoryId, @RequestParam String paymentTypeId,
                                                 @RequestParam Float amount, @RequestParam Integer transactionType,
                                                 @RequestParam String note){
        Transaction transaction = new Transaction();
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
    public @ResponseBody Iterable<Transaction> getAllTransaction(){
        return transactionRepository.findAll();
    }

}
