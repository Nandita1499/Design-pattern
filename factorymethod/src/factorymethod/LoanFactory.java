/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorymethod;

/**
 *
 * @author Nandita
 */
public class LoanFactory 
{
        public static LoanAccount getLoanAccount(int actype)
        {
            if(actype==1)
            {
                return new HomeLoanAccount();
            }
            else if (actype==2)
            {
                return new PersonalLoanAccount();
            }
            else if(actype==3)
            {
                return new VehicalLoanAccount();
            }
            else
            {
                return null;
            }
        }
}
