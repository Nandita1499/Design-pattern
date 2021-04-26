/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;
/**
 *
 * @author Nandita
 */
import java.util.*;
public class AbstractFactoryClient 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
             AbstractBankLoanFactory lf;
             int ch1;
             Scanner sc=new Scanner(System.in);
             
             System.out.println("1.Stat Bank of India");
             System.out.println("2.Bank of Baroda");
             System.err.print("Select Your Choice:-");
             ch1=sc.nextInt();
             
             AbstractBankLoanFactory lf1=AbstractBankLoanFactory.getFactory(ch1);
             IHomeLoan h1=lf1.getHomeLoan();
             System.out.println(h1.TearmCond());
             
             AbstractBankLoanFactory lf2=AbstractBankLoanFactory.getFactory(ch1);
             IPersonalLoan p1=lf2.getPersonalLoan();
             System.out.println(p1.TearmCond());
    }
    
}
