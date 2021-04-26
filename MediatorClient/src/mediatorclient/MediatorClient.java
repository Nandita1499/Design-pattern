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
public class MediatorClient 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        IChattingMediator chattingMediator=new ChattingMediatorImpl();
        
        User u1=new UserImpl(chattingMediator,"KK");
        User u2=new UserImpl(chattingMediator,"MK");
        User u3=new UserImpl(chattingMediator,"HK");
        User u4=new UserImpl(chattingMediator,"SK");
        User u5=new UserImpl(chattingMediator,"VK");
        
        chattingMediator.addUser(u1);
        chattingMediator.addUser(u2);
        chattingMediator.addUser(u3);
        chattingMediator.addUser(u4);
        chattingMediator.addUser(u5);
        
        u2.sendMessage("Hello How Are You");
    }
    
}
