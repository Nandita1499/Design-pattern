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
public abstract class AbstractBillFactory 
{
        public abstract IWaterBill getWaterBill();
        public abstract IElectricBill getElectricBill();
  
         public static AbstractBillFactory getFactory(int i)
        {
            if(i==1)
            {
                return new AhemedabadBillFactory();
            }
            else if(i==2)
            {
                return new RajkotBillFactory();
            }
            else if(i==3)
            {
                return new SuratBillFactory();
            }
            else
            {
                return null;
            }
        }
}
