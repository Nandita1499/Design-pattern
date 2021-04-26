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
class createElectricBill 
{
        public static void main(String s[])
        {
            double units;
            double pay=0;
            
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Number of units:-");
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
        }
}
