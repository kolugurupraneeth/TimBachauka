package com.constr.com;

import org.w3c.dom.ls.LSOutput;

public class  Main2{
    public static void main(String[] args) {

        VipCustomer customer = new VipCustomer();
        System.out.println(customer.getName());

        VipCustomer customer1 =new VipCustomer("Gicelle", 25000,"Gicelle@gmail.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditlimit());
        System.out.println(customer1.getEmailaddress());


    }
    }



