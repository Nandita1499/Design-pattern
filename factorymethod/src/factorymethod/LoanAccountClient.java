/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Nandita
 */
import java.util.*;
public class LoanAccountClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        LoanAccount lac;
        LoanFactory lf;
        int ch;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1] Home Loan Account");
        System.out.println("2] Personal Loan Account");
        System.out.println("3] Vehical Loan Account"); 
        System.out.println("Enter your choice:-");
        ch=sc.nextInt();
        lac=LoanFactory.getLoanAccount(ch);
        System.out.println(lac.TearmCond());
    }
    
}
