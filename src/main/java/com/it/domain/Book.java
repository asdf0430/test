package com.it.domain;

import java.util.Date;

public class Book {
    private Integer id;
    private String supplier;
    private String store;
    private boolean warehousing;
    private String settlement_account;
    private Integer paid_in_amount;
    private Integer arrears;
    private Date business_date;
    private String comments;


    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +
                ", store='" + store + '\'' +
                ", warehousing=" + warehousing +
                ", settlement_account='" + settlement_account + '\'' +
                ", paid_in_amount=" + paid_in_amount +
                ", arrears=" + arrears +
                ", business_date=" + business_date +
                ", comments='" + comments + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public boolean isWarehousing() {
        return warehousing;
    }

    public void setWarehousing(boolean warehousing) {
        this.warehousing = warehousing;
    }

    public String getSettlement_account() {
        return settlement_account;
    }

    public void setSettlement_account(String settlement_account) {
        this.settlement_account = settlement_account;
    }

    public Integer getPaid_in_amount() {
        return paid_in_amount;
    }

    public void setPaid_in_amount(Integer paid_in_amount) {
        this.paid_in_amount = paid_in_amount;
    }

    public Integer getArrears() {
        return arrears;
    }

    public void setArrears(Integer arrears) {
        this.arrears = arrears;
    }

    public Date getBusiness_date() {
        return business_date;
    }

    public void setBusiness_date(Date business_date) {
        this.business_date = business_date;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
