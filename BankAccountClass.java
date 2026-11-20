public class BankAccountClass {
    private String owner;
    private double balance;

    public BankAccountClass(String owner,double balance){
        this.owner = owner;
        this.balance = CheckBalance(balance);
    }

    public double CheckBalance(double balance){
        if(balance>=0) return balance;
        else return 0;
    }

    public void deposit(double amount){
        if(amount > 0){ this.balance =+ amount;}
        else IO.println("Некорректная сумма");
    }

    public void withdraw(double amount){
        if(amount > 0) {
            if (this.balance >= amount) {this.balance -= amount;}
            else IO.println("Недостаточно средств");
        }
        else IO.println("Некорректная сумма");
    }

    public double getBalance(){
        return this.balance;
    }
}
