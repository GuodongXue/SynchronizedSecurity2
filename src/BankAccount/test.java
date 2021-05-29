package BankAccount;

public class test {
    public static void main(String[] args) {
        AccountThread ac = new AccountThread();
        new Thread(ac, "男主人").start();
        new Thread(ac, "女主人").start();


        //线程安全， 效率就低
        //线程不安全， 效率就高
    }

}
