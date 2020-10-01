/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmeticfunction;

import jrac.core.function.AF;

/**
 *
 * @author jruiz
 */
public class AritmeticFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double localVar1 = Double.valueOf(args[1]);
        double localVar2 = Double.valueOf(args[2]);
        AF af = new AF();
        
        switch(args[0]){
            
            case "Plus":
               System.out.println(af.Plus(localVar1, localVar2));
                
            break;
            case "Menus":
                System.out.println(af.Menus(localVar1, localVar2));
            break;    
            
        }
            
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    
}
