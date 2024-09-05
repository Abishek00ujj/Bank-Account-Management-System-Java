import java.lang.annotation.Target;
import java.util.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int Balance=1000;
        String heartEmoji = "\u2764\uFE0F";
        ArrayList<String> Transaction=new ArrayList<>();
        System.out.println("Bank Account Management System!");
        System.out.println("1.Deposit");
        System.out.println("2.Withdrawal");
        System.out.println("3.Balance Inquiry");
        System.out.println("4.Transaction History");
        System.out.println("0.Exit");
        int choice=-1;
        Scanner sc=new Scanner(System.in);
        while(choice!=0)
        {
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter the amount to be deposited to your account:\n");
                int amount=sc.nextInt();
                Transaction.add("Deposited : +"+amount);
                Balance=Balance+amount;
                System.out.println("New Account Balance: "+Balance);
                System.out.println("Rupees "+amount+" is Transfered Successfully to your account!,");
                System.out.println("__________________________________________________________________________");
            }
            else if(choice==2)
            {
                System.out.println("Enter the amount to be withdraw from your account:\n");
                int amount=sc.nextInt();
                if(amount<=Balance) {
                    Transaction.add("Withdraw : -" + amount);
                    Balance=Balance-amount;
                    System.out.println("New Account Balance: "+Balance);
                    System.out.println("Rupees " + amount + " is Withdrawed Successfully from your account!,");
                }
                else
                {
                    System.out.println("Insufficient funds!...../*");
                }
                System.out.println("__________________________________________________________________________");
            }
            else if(choice==3)
            {
                System.out.println("Account Balance :"+Balance);
                System.out.println("__________________________________________________________________________");
            }
            else if(choice==4)
            {
                if(Transaction.size()==0)
                {
                    System.out.println("No Transaction is found..");
                }
                else {
                    for(String s:Transaction)
                    {
                        System.out.println(s);
                    }
                }
            }
            else {
                choice=0;
                System.out.println("Thank you for using Bank Account Management System");
                System.out.println("__________________________________________________________________________");
                System.out.println("                       Made with "+heartEmoji+" by Abishek.S");
            }
        }
    }
}