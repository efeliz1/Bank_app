package app;

import java.util.Scanner;

public class Menu {
    Bank bank;
    public Scanner sc;

    public Menu(Bank bank){
        this.bank = bank;
        sc = new Scanner(System.in);
    }

    /**
     * Menu to display while the condition are true;
     */
    public void showMenu(){
        boolean continueLoop = true;
        while (continueLoop) {
            System.out.println(" ");
            System.out.println("1: Create Account");
            System.out.println("2: Show Account");
            System.out.println("3: Deposit");
            System.out.println("4: Withdraw");
            System.out.println("5: exit");
            System.out.println(" ");
            System.out.print("Select choice: ");
            Scanner sc = new Scanner(System.in);
            int choice;
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    createAccount();
                    break;
                case 2:
                    showAllAccount();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withDraw();
                    break;
                case 5:
                    continueLoop = false;
                    break;
            }
        }
    }

    /**
     * create the account and assign to either limit Account or overdraft Account;
     */
    public void createAccount(){
        System.out.println(" ");
        System.out.print("Enter First Name:");
        String fName = sc.nextLine();
        System.out.print("Enter Last Name:");
        String lName = sc.nextLine();
        System.out.print("Enter Street:");
        String address = sc.nextLine();
        System.out.print("Enter City:");
        String city = sc.nextLine();
        System.out.println(" ");
        System.out.println("1: Limited Action");
        System.out.println("2: Overdraft");
        System.out.println(" ");
        System.out.print("Select choice: ");
        int choice = sc.nextInt();
        if(choice == 1){
            Person person = new Person(fName, lName, new Address(address, city));
            Account limitedActionAccount = new LimitedActionAccount(person,30);

            bank.addAccount(limitedActionAccount);
        }else {
            Person person = new Person(fName, lName, new Address(address, city));
            Account overdraftAccount = new OverdraftAccount(person,10);

            bank.addAccount(overdraftAccount);
        }
    }

    /**
     * Display all the account in the bank;
     */
    public void showAllAccount(){
        for (int i = 0; i < bank.getAccountCount(); i++) {
            System.out.println(i+": "+
                    bank.getAccount(i).getPerson().getFirstName() + " " +
                    bank.getAccount(i).getPerson().getLastName());
        }
        System.out.println(" ");
        System.out.print("Select Account by number: ");
        int choice = sc.nextInt();
        printAllAccountInfo(choice);
    }

    public void printAllAccountInfo(int choice){
        System.out.println("First Name: "+ bank.getAccount(choice).getPerson().getFirstName());
        System.out.println("Last Name: "+ bank.getAccount(choice).getPerson().getLastName());
        System.out.println("Street address: "+ bank.getAccount(choice).getPerson().getAddress().getStreet());
        System.out.println("City: "+ bank.getAccount(choice).getPerson().getAddress().getCity());
        System.out.println("Balance: "+ bank.getAccount(choice).getBalance());
        Account account= bank.getAccount(choice);
        if(account instanceof LimitedActionAccount){
            System.out.println("Account Type: Limited Action Account");
        }else if (account instanceof OverdraftAccount){
            System.out.println("Account Type: Overdraft Account");
        }

    }



    public void deposit(){
        for (int i = 0; i < bank.getAccountCount(); i++) {
            System.out.println(i+": "+
                    bank.getAccount(i).getPerson().getFirstName() + " " +
                    bank.getAccount(i).getPerson().getLastName());
        }
        System.out.println(" ");
        System.out.print("Select Account by number: ");
        int choice = sc.nextInt();
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        bank.getAccount(choice).deposit(amount);
        System.out.println("Success");
        System.out.print("New Balances: ");
        System.out.print(bank.getAccount(choice).getBalance());
    }


    public void withDraw(){
        for (int i = 0; i < bank.getAccountCount(); i++) {
            System.out.println(i+": "+
                    bank.getAccount(i).getPerson().getFirstName() + " " +
                    bank.getAccount(i).getPerson().getLastName());
        }
        System.out.println(" ");
        System.out.print("Select Account by number: ");
        int choice = sc.nextInt();
        System.out.print("Enter amount: ");
        int amount = sc.nextInt();
        bank.getAccount(choice).withdraw(amount);
        System.out.println("Success");
        System.out.print("New Balances: ");
        System.out.print(bank.getAccount(choice).getBalance());
    }

}
