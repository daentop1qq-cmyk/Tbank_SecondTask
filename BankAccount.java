public class BankAccount {
    final int accountNumber;

    public BankAccount(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
        //this.accountNumber-=1;    Commit: Это невозмиожно т.к. final это модификатор, который ограничил изменения переменной после ввода
    }
}
