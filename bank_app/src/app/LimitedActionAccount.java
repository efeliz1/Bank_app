package app;



public class LimitedActionAccount extends Account {
    private double limit;


    public LimitedActionAccount(Person person,double limit){
        super(person);
        setLimit(limit);
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public boolean withdraw(double amount){
        if(limit> amount ){
            double  balance = getBalance();
             balance -= amount;
             setBalance(balance);
            return true;
        }
        return false;
    }
    @Override
    public boolean deposit(double amount){
        if(amount>limit){
            double  balance = getBalance();
            balance += amount;
            setBalance(balance);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "LimitedActionAccount{" +
                "limit=" + limit +
                '}';
    }
}
