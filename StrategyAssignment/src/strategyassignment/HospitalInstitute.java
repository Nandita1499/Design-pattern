/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyassignment;

/**
 *
 * @author Nandita
 */
public class HospitalInstitute implements IProperty
{

    @Override
    public double getPropertyTex(double amount) 
    {
            return (amount*5)/100;
    }
    
}
