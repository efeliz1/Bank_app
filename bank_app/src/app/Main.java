package app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Menu menu = new Menu( new Bank());
        menu.showMenu();
        //No need for all this
//        Address address1 = new Address("121 Brookline St", " Boston Ma");
//                                                                                    this will do
//        Person p1 = new Person("Edwin", "Feliz", new Address("121 Brookline St", " Boston Ma"));
//        Person p2 = new Person("Michael", "Olivo", new Address("121 Main St", " Boston Ma"));
//        Person p3 = new Person("Felipe", "Lulo", new Address("121 white St", " Boston Ma"));

//        Account acc1 = new Account(p1);
//
//        Bank bank1 = new Bank(acc1);

//        System.out.println(p1);

//        Account account = new OverdraftAccount(p1,10);
//        Account account2 = new OverdraftAccount(p2,10);
//        Account account3 = new OverdraftAccount(p3,10);
//
//        OverdraftAccount overdraftAccount = new OverdraftAccount(p1,10);
//        Bank bank = new Bank();
//        bank.addAccount(account);
//        bank.addAccount(account2);
//        bank.addAccount(account3);
//        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < bank.getAccountCount(); i++) {
//            System.out.println(i+": "+
//                    bank.getAccount(i).getPerson().getFirstName() + " " +
//                    bank.getAccount(i).getPerson().getLastName());
//        }
//        System.out.println(" ");
//        System.out.print("Select Account by number: ");
//        int choice = sc.nextInt();
//        System.out.print("Enter amount: ");
//        int amount = sc.nextInt();
//        System.out.println(bank.getAccount(choice).deposit(amount));
//        System.out.println("Success");
//        System.out.print("New Balances: ");
//        System.out.print(bank.getAccount(choice).getBalance());

    }
}
