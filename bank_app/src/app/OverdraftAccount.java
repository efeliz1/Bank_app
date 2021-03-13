package app;

public class OverdraftAccount extends Account{
    private double overdraft;

    public OverdraftAccount(Person person,double overdraft){
        super(person);
        setOverdraft(overdraft);
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public boolean withdraw(double amount){

        if(getBalance() > overdraft ){
            double balance = getBalance();
            balance -= overdraft;
            setBalance(balance);
            return true;
        }
        return false;
    }

    @Override
    public boolean deposit(double amount){
        if(amount > overdraft ){
            double balance = getBalance();
            balance += amount;
            setBalance(balance);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "OverdraftAccount{" +
                "overdraft=" + overdraft +
                '}';
    }
}
