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
public class Decorator 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Icecream MyIcecream=new Vanilla();
        System.out.println(MyIcecream.Ice_Description());
        Icecream YourIcecream=new Choclate(new Cashewnuts(new Peanuts(new Vanilla())));
        System.out.println(YourIcecream.Ice_Description());
        // TODO code application logic here
    }
    
}
