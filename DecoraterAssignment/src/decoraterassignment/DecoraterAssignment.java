/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoraterassignment;
/**
 *
 * @author Nandita
 */
public class DecoraterAssignment 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Message Mymessage=new StringMessage();
        System.out.println(Mymessage.get_message());
        
        Message uppermessage=new Upparcase(Mymessage);
        System.out.println(uppermessage.get_message());
        
        Message lowermessage=new LowerCase(Mymessage);
        System.out.println(lowermessage.get_message());
        
        Message revmessage=new Reverse(Mymessage);
        System.out.println(revmessage.get_message());
        // TODO code application logic here
    }
    
}
