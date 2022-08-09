package lecture3.bankAcc;

public class BankExecute {
    public static void main(String[] args) {

     BankOps bankAction = new BankOps();
        bankAction.deposit(100);
        bankAction.withdraw(50);
        bankAction.checkBalance();
        bankAction.deposit(1100);
    }
}
