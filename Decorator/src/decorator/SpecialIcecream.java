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
public abstract class SpecialIcecream  implements Icecream
{

    protected  Icecream SpIeCream;
   // @Override
    public SpecialIcecream(Icecream bIcecream)
    {
        this.SpIeCream=bIcecream;
    }
   /* public String Ice_Description() 
    {
                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
}
