import java.util.Scanner;

public class example
{
    public static void main(String[] args)
    {
        int balance = 25000;

        System.out.println("Enter the ammount you want to widraw: ");
        Scanner obj = new Scanner(System.in);
        int ammount = obj.nextInt();

        try
        {
            if(ammount > 25000)
            {
                throw new ArithmeticException("Insufficient Balance");

            }

            int currentBalance = balance - ammount;
            System.out.println("Transaction Successful and the current balance is " + currentBalance);
            
        }
        catch(ArithmeticException e)
        {
           System.out.println("Exception "+ e.getMessage());
        }

    }
}
