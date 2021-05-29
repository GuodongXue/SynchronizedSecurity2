package BankAccount;

public class AccountThread implements Runnable {
//多个线程共享一个账号
    private account ac = new account();
    @Override
    public void run() {
        synchronized (this){
            if(ac.getBalance()>=400){
                ac.getMoney(300);
                System.out.println(Thread.currentThread().getName()+ "在取款"+", 取款后金额为"+ac.getBalance());
            }else{
                System.out.println(Thread.currentThread().getName()+"在取款， 余额不足400， 取款失败");
            }
        }
    }
}
