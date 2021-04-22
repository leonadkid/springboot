package com.leonadkid.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Transaction")
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer transId;
    private Date date;
    private String entity;
    private String categoryId;
    private String paymentTypeId;
    private Float amount;
    private Integer transactionType;
    private String note;

    public Integer getTransId() {
        return transId;
    }

    public Date getDate() {
        return date;
    }

    public String getEntity() {
        return entity;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public Float getAmount() {
        return amount;
    }

    public Integer getTransactionType() {
        return transactionType;
    }

    public String getNote() {
        return note;
    }

    public void setTransId(Integer transId) {
        this.transId = transId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public void setTransactionType(Integer transactionType) {
        this.transactionType = transactionType;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
