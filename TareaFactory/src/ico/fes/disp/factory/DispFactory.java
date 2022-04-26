/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ico.fes.disp.factory;

import ico.fes.disp.Computadora;
import ico.fes.disp.Smartphone;
import ico.fes.disp.Tablet;

/**
 *
 * @author fabia
 */
public class DispFactory {
    public static Disp createDisp (int tipo){
        switch (tipo) {
            case Disp.COMP:
                return new Computadora("AMD", "Windows",4,9);
            
            case Disp.SMARTPHONE:
                return new Smartphone("Lanix", "Android", true, true);
            
            case Disp.TABLET:
                return new Tablet("Mac", "iOS" ,true ,true);
                
            default:
                throw new AssertionError();
        }
    }
}
