package Morrisje.com;

public class VIPCustomer {
    private String name;
    private  double creditLimit;
    private String email;


    public VIPCustomer(){
        //Default Customer
        this("default",10000, "default");
    }

    public VIPCustomer(String name, double creditLimit) {
       this(name,creditLimit, "  anything");
    }

    public VIPCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }



}
