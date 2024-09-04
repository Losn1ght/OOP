package org.example;

public class Account {

    private double currentBalance;
    private double availableBalance;
    private String accountName;
    private int accountNumber;

    public Account(String accountName, int accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }


    public double getAvailableBalance() {
        return availableBalance;
    }


    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public boolean deposit(double amount){
        if(amount % 100 == 0){
            currentBalance += amount;
            System.out.println("Deposit successful!\n");
            return true;
        }else{
            System.out.println("Deposit failed!");
            return false;
        }
    }

    public boolean withdraw(double amount){
        int fee = 10;
        if(availableBalance >= amount + fee && amount % 100 == 0){
            availableBalance -= amount + fee;

            System.out.println("Withdraw successful!\n");
            return true;
        }else{
            System.out.println("Withdraw failed!\n");
            return false;
        }
    }

    public boolean transfer(Account another, double amount){
        int fee = 10;
        if(amount % 100 == 0 && availableBalance >= amount + fee){
            availableBalance -= amount + fee;
            another.deposit(amount);
            System.out.println("Transfer successful\n");
            return true;
        }else{
            System.out.println("Transfer failed\n");
            return false;
        }
    }

    public double checkBalance(){
        return getCurrentBalance();
    }

    public void display(){
        System.out.println(this.toString());
    }

    public void verify(){
        availableBalance += currentBalance ;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Account ID: ");
        sb.append(accountNumber);
        sb.append("\n");
        sb.append("Account Name: ");
        sb.append(accountName);
        sb.append("\n");
        sb.append("Current Balance: ");
        sb.append(currentBalance);
        sb.append("\n");
        sb.append("Available Balance: ");
        sb.append(availableBalance);
        sb.append("\n");



        return sb.toString();
    }

}
