package oop.inheritance.small_bank;

public class Account {
    String name;
    static long accNumber = 0;
    long balance;

    Account(String name,long accNumber, long balance) {
        this.name = (name==null || name.trim().isEmpty())?"unknown":name;
        Account.accNumber = accNumber;
        this.balance = balance;
        accNumber+=1;
    }

    Account(){
        this.name = "unknown";
        accNumber = 0;
        this.balance = 0;
        accNumber+=1;
    }

    Account(Account account){
        this.balance = account.balance;
    }

}
