/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BillFactory;

import java.util.Scanner;
/**
 *
 * @author Nandita
 */
public class SuratWaterBill implements IWaterBill
{
     @Override
    public String createBill() 
    {
        
         double units,days;
        double pay=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of units for Water  Bill:-");
        units=sc.nextDouble();
        System.out.println("Enter Number of days for Water  Bill:-");
        days=sc.nextDouble();
        
        pay=(units/days)*days;
        System.out.println("Bill pay:-"+pay);
        return "Create SuratWater Bill is Successfully";
    }

    @Override
    public String TermCond() 
    {
        return "Surat Watter Bill payment in 1 Month";
    }
}
