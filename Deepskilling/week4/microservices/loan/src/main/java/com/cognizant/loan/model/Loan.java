package com.cognizant.loan.model;

public class Loan {

    private  String number;
    private  String type;
    private  float loan;
    private  float emi;
    private  int tenure;

    public Loan() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getLoan() {
        return loan;
    }

    public void setLoan(float loan) {
        this.loan = loan;
    }

    public float getEmi() {
        return emi;
    }

    public void setEmi(float emi) {
        this.emi = emi;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public Loan(String number, int tenure, float emi, float loan, String type) {
        this.number = number;
        this.tenure = tenure;
        this.emi = emi;
        this.loan = loan;
        this.type = type;
    }

}
