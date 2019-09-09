package com.company;

public class Hamburger {
    private String name ;
    private String meat ;
    private String breadType ;
    private double price;


    private String addition1Name ;
    private  double addition1Price;

    private String addition2Name ;
    private double addition2Price;

    private String addition3Name ;
    private double addition3Price;

    private String addition4Name ;
    private double addition4Price;


    public Hamburger(String name, String meat, String breadType, double price) {
        this.name = name;
        this.meat = meat;
        this.breadType = breadType;
        this.price = price;
    }

    public void add1extra(String name , double price){
        this.addition1Name = name ;
        this.addition1Price = price;

    }
    public void add2extra(String name , double price){
        this.addition2Name = name ;
        this.addition2Price = price;

    }
    public void add3extra(String name , double price){
        this.addition3Name = name ;
        this.addition3Price = price;

    }
    public void add4extra(String name , double price){
        this.addition4Name = name ;
        this.addition4Price = price;

    }
    public double itemizeBurger (){
        double hamburgerPrice = this.price ;


        if(this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
           System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(addition2Name != null){
            hamburgerPrice += this.addition2Price ;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(addition3Name != null){
            hamburgerPrice += this.addition3Price ;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(addition4Name != null){
            hamburgerPrice += this.addition4Price ;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        System.out.println(this.name + " hamburger on a " + this.breadType + " bread with " + this.meat + " for " + hamburgerPrice);
        return hamburgerPrice;

    }
}
