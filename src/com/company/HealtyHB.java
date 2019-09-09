package com.company;

public class HealtyHB extends  Hamburger {
    public HealtyHB( String meat,  double price) {
        super("HealtyHB", meat, "Brown", price);
    }

        private String healtyAddition1Name;
        private double healtyAddition1Price;

        private String healtyAddition2Name;
        private double healtyAddition2Price;

    public void healtyExtra1 (String healtyName , double healtyPrice){
        this.healtyAddition1Name = healtyName;
        this.healtyAddition1Price = healtyPrice;

    }
    public void healtyExtra2 (String healtyName , double healtyPrice){
        this.healtyAddition2Name = healtyName;
        this.healtyAddition2Price = healtyPrice;

    }

    @Override
    public double itemizeBurger() {
        double hamburgerPrice = super.itemizeBurger();
        if(this.healtyAddition1Name != null) {
            hamburgerPrice += this.healtyAddition1Price;
            System.out.println("Added " + this.healtyAddition1Name + " for an extra " + this.healtyAddition1Price);
        }
        if(this.healtyAddition2Name != null) {
            hamburgerPrice += this.healtyAddition2Price;
            System.out.println("Added " + this.healtyAddition2Name + " for an extra " + this.healtyAddition2Price);
        }
        return hamburgerPrice;
    }
}

