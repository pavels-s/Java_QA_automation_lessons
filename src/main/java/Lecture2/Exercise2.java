package Lecture2;

public class Exercise2 {
    public static void main(String[] args) {

        Bank bankVarialbe = new Bank();
        bankVarialbe.checkBalance();
        bankVarialbe.withdraw(50);
        bankVarialbe.deposit(100);
        bankVarialbe.checkBalance();

    }
}
