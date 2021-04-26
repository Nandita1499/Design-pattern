/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediatorclient;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Nandita
 */
public class ChattingMediatorImpl  implements IChattingMediator
{
    private List<User>  userList;
    
    public ChattingMediatorImpl()
    {
        userList=new ArrayList<User>();
    }
    @Override
    public void sendMessage(String message, User user) 
    {
        for(User u:userList)
        {
                if(!u.getUserName().equalsIgnoreCase(user.getUserName()))
                {
                    u.receiveMessage(message);
                }
         }
    }
    @Override
    public void addUser(User user) 
    {
        userList.add(user);
    }
}
