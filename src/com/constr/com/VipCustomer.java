package com.constr.com;

public class VipCustomer {

    private String name;
    private double creditlimit;
    private  String emailaddress;


    public VipCustomer(){
        this("Default Name ", 5000.0,"deafulat@email.com");

    }

    // creating a second constructor
    public VipCustomer(String name, double creditlimit) {
        this(name,creditlimit,"unknown@gmail.com");

    }

    // creating 1st constructor
    public VipCustomer(String name, double creditlimit, String emailaddress) {
        this.name = name;
        this.creditlimit = creditlimit;
        this.emailaddress = emailaddress;




    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(double creditlimit) {
        this.creditlimit = creditlimit;
    }

    public String getEmailaddress() {
        return emailaddress;
    }

    public void setEmailaddress(String emailaddress) {
        this.emailaddress = emailaddress;
    }
}


