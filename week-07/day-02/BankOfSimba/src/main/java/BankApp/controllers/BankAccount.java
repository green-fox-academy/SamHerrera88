package BankApp.controllers;

public class BankAccount {
    private String name;
    private double balance;
    private String animalType;
    private String Currency;

    public BankAccount(String name, double balance, String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;
    }
    BankAccount newAccount = new BankAccount("Simba", 2000, "lion");

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }


    public BankAccount(String currency) {
        Currency = currency;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }
}
