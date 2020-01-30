import java.util.*;
class Account
{
    private int bal;
    public Account(int bal)
    {
        this.bal = bal;


    }
    public boolean insufficientBalance(int w)
    {
        if(w<bal)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void widrawl(int amnt)
    {
        int remaining;
        bal= bal - amnt;
        System.out.println("remaining balance is "+ bal);
    }
}
class Customar implements Runnable
{
    private String name;
    private Account account;
    public Customar(Account account ,String name)
    {
        this.account = account;
        this.name = name;
    }
    public void run()
    { synchronized(account){
        Scanner sb = new Scanner(System.in);
        System.out.println(name +" enter ammount to Widraw: ");
        int ammount = sb.nextInt();
        if(account.insufficientBalance(ammount))
        {
            System.out.println(name); 
            account.widrawl(ammount);

        }
        else
        {
            System.out.println("Insufficient Balance Baby");
        }
    }
}

}
public class ThreadExample
{
    public static void main(String[] args)
    {
        Account a1 = new Account(1000);
        Customar c1 = new Customar(a1,"person 1"), c2 = new Customar(a1,"person 2");
        
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();


    }
}