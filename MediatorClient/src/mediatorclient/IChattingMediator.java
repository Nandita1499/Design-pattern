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
public interface IChattingMediator 
{
        public abstract void sendMessage(String message,User user);
        public abstract void addUser(User user);
        
}
