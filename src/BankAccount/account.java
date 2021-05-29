package BankAccount;

public class account{

    //共享钱
    int money = 600;
    // 得到余额
    public void getMoney(int Money){
        this.money = this.money- money;
    }

    public int getBalance(){
        return money;
    }
}
