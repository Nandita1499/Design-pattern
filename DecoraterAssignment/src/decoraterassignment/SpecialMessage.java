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
public abstract class SpecialMessage implements Message
{
        protected Message SpMessage;
        
        public SpecialMessage(Message bMessage)
    {
        this.SpMessage=bMessage;
    }
}
