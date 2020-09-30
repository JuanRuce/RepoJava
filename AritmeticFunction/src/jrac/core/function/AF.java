/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrac.core.function;

/**
 *
 * @author jruiz
 */
public class AF {
    
    public double Plus(double sum1, double sum2){
        return sum1+sum2;
    }
    
    public double Menus(double menus1, double menus2){
     if (menus2 > menus1){
        System.out.println("Debe ser mayor "+menus1+" que "+menus2);
        return 0;
     }       
      return menus1 - menus2;
    }
    
}
