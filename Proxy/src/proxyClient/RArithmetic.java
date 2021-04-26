/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyClient;

/**
 *
 * @author Nandita
 */
public class RArithmetic implements IArithmatic
{

       float ans;
    @Override
    public float doIt(float a, float b) 
    {
        for(int i=0;i<1111100000;i++)
        {
            ans= a*b;
        }
        return ans;
    }
    
}
