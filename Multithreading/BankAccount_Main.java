import java.util.*;

class BankAccount
{
    int available_bal;
    int withdrawal_val;
    int deposit_val;
    int f=0;
    BankAccount(int available_bal)
    {
        this.available_bal=available_bal;
    }

    synchronized void withdraw(int val)
    {
        withdrawal_val=val;
        while(val>available_bal)
        {
            System.out.println("available balance : "+available_bal);
            System.out.println("deposite : "+ (val-available_bal) +" first");
            f=1;
            try{this.wait();}catch(InterruptedException e){}
        }
        available_bal-=val;
        System.out.println("withdrawal of : "+val+" succesfully done");
        System.out.println("available balance : "+available_bal);
    } 

    synchronized void deposit(int val)
    {
        deposit_val=val;
        available_bal+=val;
        System.out.println("Deposit of : "+val+" succesfully done");
        System.out.println("available balance : "+available_bal);
        if(f==1 && available_bal>=withdrawal_val)
        {
            this.notify();
        }
    }

}
class WithdrawThread extends Thread
{
    BankAccount b;
    int val;
    WithdrawThread(BankAccount b,int val)
    {
        this.b=b;
        this.val=val;
    }
    public void run()
    {
        b.withdraw(val);
    }
}
class DepositThread extends Thread
{
    BankAccount b;
    int val;
    DepositThread(BankAccount b,int val)
    {
        this.b=b;
        this.val=val;
    }
    public void run()
    {
        b.deposit(val);
    }
}
class BankAccount_Main
{
    public static void main(String args[]) throws InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        BankAccount OmPatel=new BankAccount(10000);
        System.out.println("Deposit(1) OR withdraw(2) OR end(3)?");
        while(true)
        {
            int c=sc.nextInt();
            int val;
            if(c==1)
            {
                System.out.println("Enter amount for deposit");
                val=sc.nextInt();
                DepositThread dt=new DepositThread(OmPatel,val);
                dt.start();
                //dt.join();
            }
            else if(c==2)
            {
                System.out.println("Enter amount for withdrawal");
                val=sc.nextInt();
                WithdrawThread wt=new WithdrawThread(OmPatel,val);
                wt.start();
                //wt.join();
            }
            else if(c==3)
            {
                break;
            }
        }
    }
}