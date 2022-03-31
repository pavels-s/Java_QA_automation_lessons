package Lecture2;

public class Bank {

    private int bankBalance = 0;

    public void deposit(int amount) {
        bankBalance = bankBalance + amount;
        System.out.println("You have deposited " + amount + "eur");
    }

    public void withdraw(int amount) {
        bankBalance = bankBalance - amount;
        System.out.println("You have withdrawed " + amount + "eur");
    }

    public void checkBalance() {
        System.out.println("Your balance is " + bankBalance + "eur");
    }

}
