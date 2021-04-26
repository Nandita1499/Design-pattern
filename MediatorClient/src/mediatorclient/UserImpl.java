/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorclient;
/**
 *
 * @author Nandita
 */
public class UserImpl  extends User
{
    private IChattingMediator chattingMediator;
    private String userName;
    
    public UserImpl(IChattingMediator chattimgMediator, String userName) 
    {
        super(chattimgMediator, userName);
        this.chattingMediator=chattimgMediator;
        this.userName=userName;
    }

    @Override
    public void sendMessage(String message) 
    {
            System.out.println(userName+ " Sending Message = "+message);
            chattingMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) 
    {
            System.out.println(userName+" Receive Message="+message);
    }
    
}
