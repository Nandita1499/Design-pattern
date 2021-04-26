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
public class SuratElectricBill implements IElectricBill
{
    @Override
    public String createBill() 
    {
        double units;
         double pay=0;
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number of units for Electric Bill:-");
            units=sc.nextDouble();
            
            if(units<100)
            {
                pay=units*1.20;
            }
            else if(units<300)
            {
                pay=100*1.20+(units-100)*2;
            }
            else if(units>300)
            {
                pay=100*1.20+200*2+(units-300)*3;
            }
            System.out.println("Bill pay:-"+pay);
        return "Surat Electric Bill Create Successfully";
    }

    @Override
    public String TermCond() 
    {
        return "Surat Electric Bill payment in 1 Month";
    }
}
