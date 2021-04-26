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
public abstract class User 
{
    private IChattingMediator chattingMediator;
    private String userName;

       public User(IChattingMediator chattimgMediator,String userName)
       {
           super();
           this.chattingMediator=chattimgMediator;
           this.userName=userName;
       }
       public IChattingMediator getChattingMediator()
       {
            return chattingMediator;
       }
       public String getUserName()
       {
           return userName;
       }
       public abstract void sendMessage(String message);
       public abstract void receiveMessage(String message);
}
