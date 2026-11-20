public class Main {
    public static void main(String[] args) {
        //First class task
        Student student1 = new Student("Виктор",5);
        IO.println(student1.toString());
        if(student1.isExcellent()) IO.println("Отличник");
        Student student2 = new Student("Никита",2);
        IO.println(student2.toString());
        if(student2.isExcellent()) IO.println("Отличник");
        Student student3 = new Student("Николай",3);
        IO.println(student3.toString());
        if(student3.isExcellent()) IO.println("Отличник");
        //First class task


        //Second class task
        BankAccountClass bankaccount1 = new BankAccountClass("Виктор",0);
        bankaccount1.withdraw(100);
        bankaccount1.deposit(-0.1);
        bankaccount1.deposit(1000);
        bankaccount1.withdraw(100);
        IO.println(bankaccount1.getBalance());
        //Second class task


        //First home task
        BankAccount bankaccount_1 = new BankAccount(12345);
        IO.println(bankaccount_1.getAccountNumber());
        //First home task


        //Second home task
        IO.println(MathUtils.add(7,8));
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        IO.println(Counter.count);
        int R = 2;
        IO.print(Constants.PI*R*R);
        //Second home task
    }
}