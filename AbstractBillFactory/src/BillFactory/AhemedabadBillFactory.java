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
public class AhemedabadBillFactory extends AbstractBillFactory
{    

    @Override
    public IWaterBill getWaterBill() 
    {
       return new AhemedabadWaterBill();
    }

    @Override
    public IElectricBill getElectricBill() 
    {
        return new AhemedabadElectricBill();
    }
    
}
