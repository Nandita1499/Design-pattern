/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author Nandita
 */
public interface IHomeLoan 
{
        public double getLoan();
        public double getInterest();
        public void setRateofInt(double r);
        public void setLoanAccount(double lamt);
        public void setNoofYear(int noy);
        public String TearmCond();
}
