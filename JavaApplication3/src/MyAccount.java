/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nandita
 */
import java.util.*;
public class MyAccount 
{
        public static void main(String s[])
        {
            Random ran=new Random();
            
            Account[] accountArray=new Account[5];
                        
            Account acc1=new SavingBankAccount("XYZ",1000);    
            Account acc2=new SavingBankAccount("ABC",9000);
            Account acc3=new SavingBankAccount("MNO",4000);
            Account acc4=new SavingBankAccount("PQR",1000);
            Account acc5=new SavingBankAccount("STU",7000);
            
            accountArray[0]=acc1;
            accountArray[1]=acc2;
            accountArray[2]=acc3;
            accountArray[3]=acc4;
            accountArray[4]=acc5;
        
        for(int i=0;i<accountArray.length;i++)
        {
         System.out.println(accountArray[i]);
         accountArray[i].diposit(ran.nextInt(300));
         accountArray[i].withdraw(ran.nextInt(3000));
         
         System.out.println("Balance"+accountArray[i].getBalance());
         System.out.println("Balance:"+accountArray[i].getBalance());
         System.out.println();
        }
        
        System.out.println("Checking for Duplicates now.....");
        for(int i=0;i<accountArray.length;i++)
        {
               for(int j=0;j<i;j++)
               {
                   if(accountArray[i].equals(accountArray[j]))
                   {
                       System.out.println("Account:"+accountArray[i].getAccount()+"and"+accountArray[j].getAccount()+"are duplicates");
                   }
               }
        }
    }
}
