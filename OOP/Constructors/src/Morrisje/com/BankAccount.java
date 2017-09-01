package Morrisje.com;

import java.math.BigDecimal;

/**
 * Created by John on 8/30/2017.
 */
public class BankAccount {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
public BankAccount(){
    //Default
    this(12345, 2.85, "default Name", "example@somewhere.com", "(123)456-7890");
    System.out.println("Empty constructor called");
}

public BankAccount(int number, double balance, String customerName, String customerEmail, String customerPhone){
    System.out.println("Account Constructor with params");
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.customerEmail= customerEmail;
    this.customerPhone=customerPhone;
}

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this(12485, 100.55,customerName,customerEmail,customerPhone);

    }

    public void deposit (double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit amount " + depositAmount);
        System.out.println("New Balance" + this.balance);
    }
    public void withdrawal (double withdrawalAmount){
        if(this.balance - withdrawalAmount < 0){
            System.out.println("Your balance is " + this.balance + " Withdrawal not possible at this time.");
        } else {

            //withdrawal the funds from the account
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " was completed successfully");
            System.out.println("Balance remaining " + this.balance);
        }


    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
