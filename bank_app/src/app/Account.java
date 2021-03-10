package app;

import java.util.List;

public class Account extends Bank{
    private Person person;
    private double balance;

    public Account(Person person){
        this.person = person;
        //starting balance
        balance = 0;
    }


    public Person getPerson() {
        return person;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * if amount to withdraw must be >0
     * else if  amount to with must be <= balance
     * @param amount value to be withdraw
     * @return
     */
    public boolean withdraw(double amount){
            if(amount> 0){
                if(amount <= balance){
                    this.balance -= amount;
                    return true;
                }
            }
            return false;
    }


    /**
     *  if balance > 0
     * @param amount
     * @return
     */
    public boolean deposit(double amount){
            if(amount> 0){
                this.balance += amount;
                return true;
            }
        return false;
    }
}
