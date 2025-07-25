package main;

public class Attribute {

    private String email = "Jedidiahdavila@gmail.com",
            customername = "Jedidiah Davila",
            phonenum = "09168485259",
            id = "10312006";
    private double balance;
    
    public Attribute() {
        this.balance = 0.00;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

//Getter
    public String getEmail() {
        return email;
    }

    public String getCustomername() {
        return customername;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public double getBalance() {
        return balance;
    }

//Setter
    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public void setBalance(double balance) {
            this.balance = balance;
      
    }
     // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + customername);
        System.out.println("Account Number: " + phonenum);
        System.out.println("Balance: $" + balance);
    }

}
