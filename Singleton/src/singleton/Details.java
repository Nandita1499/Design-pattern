/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;
/**
 *
 * @author Nandita
 */
public class Details 
{
        String name;
        int age;
        public static int objCount=0;
        public static Details dt;
        private Details(String name)
        {
            this.name=name;
        }
        public int getAge()
        {
            return age;
        }
        public void setAge(int age)
        {
            this.age=age;
        }
        public String getDT()
        {
            return name + " She is "  + age +  " years old";
        }
        public static Details getInstance(String name)
        {
                   dt=new Details(name);
                  return dt;
                 /* if(dt == null)
                 {
                    dt=new Details(name);
                 }   
                  return dt;    */
        }
}
