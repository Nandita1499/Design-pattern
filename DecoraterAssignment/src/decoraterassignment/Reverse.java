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
public class Reverse extends SpecialMessage
{

    public Reverse(Message bMessage)
    {
        super(bMessage);
    }

    @Override
    public String get_message() 
    {
            String lstr = SpMessage.get_message();
            StringBuffer sbr = new StringBuffer(lstr);
            return "String Convert in Reverse:-"+ sbr.reverse();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
