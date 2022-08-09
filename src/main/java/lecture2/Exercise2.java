package lecture2;

public class Exercise2 {
    public static void main(String[] args) {

        Bank bankVariable = new Bank();
        bankVariable.checkBalance();
        bankVariable.withdraw(50);
        bankVariable.deposit(100);
        bankVariable.checkBalance();

    }
}
