package lecture3.bankAcc;

public class BankOps {

    private int bankBalance = 0;

    public void deposit(int amount) {
        if (amount > 1000) {
            System.out.println("Need to register sum in VID");
        } else {
            bankBalance = bankBalance + amount;
            System.out.println("You have deposited " + amount + "eur");
        }
    }

    public void withdraw(int amount) {
        if (bankBalance < 0) {
            System.out.println("You dont have enough money");
        } else if (amount > 700) {
            System.out.println("Your daily limit exceeded");
        } else {
            bankBalance = bankBalance - amount;
            System.out.println("You have withdrawed " + amount + "eur");
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is " + bankBalance + "eur");
    }
}
