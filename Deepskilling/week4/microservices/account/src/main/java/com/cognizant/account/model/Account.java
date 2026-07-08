package com.cognizant.account.model;

public class Account {
    private  String acc_no ;
    private  String type ;
    private  float balance ;

    public Account() {
    }

    public Account(float balance, String acc_no, String type) {
        this.balance = balance;
        this.acc_no = acc_no;
        this.type = type;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
