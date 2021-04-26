/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Nandita
 */
public class Peanuts extends SpecialIcecream
{
    
    public Peanuts(Icecream bIcecream) 
    {
        super(bIcecream);
    }

    @Override
    public String Ice_Description() 
    {
        return  SpIeCream.Ice_Description()+" with Peanuts ";
       /* throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    }
    
}
