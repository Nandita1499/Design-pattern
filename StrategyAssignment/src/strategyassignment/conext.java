/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategyassignment;

/**
 *
 * @author Nandita
 */
public class conext 
{
        private IProperty propertyStrategy;
        
        public conext(IProperty propertyStrategy)
        {
                this.propertyStrategy=propertyStrategy;
        }
        
        public double countTax(double income)
        {
                return propertyStrategy.getPropertyTex(income);
        }
}
