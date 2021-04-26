/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillFactory;
/**
 *
 * @author Nandita
 */
import java.util.*;
public class AbstractBillFactoryClient 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        AbstractBillFactory b1;
        int ch;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("1.Ahemedabad Bill");
        System.out.println("2.Rajkot Bill");
        System.out.println("3.Surat Bill");
        System.out.println("Choice Your City:-");
        ch=sc.nextInt();
        
        AbstractBillFactory b2=AbstractBillFactory.getFactory(ch);
        IWaterBill w1=b2.getWaterBill();
        System.out.println(w1.createBill());
        System.out.println(w1.TermCond());
        
        AbstractBillFactory b3=AbstractBillFactory.getFactory(ch);
        IElectricBill e1=b3.getElectricBill();
        System.out.println(e1.createBill());
        System.out.println(e1.TermCond());
    }
    
}
