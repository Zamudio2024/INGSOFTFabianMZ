/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareafactory;

import ico.fes.disp.factory.Disp;
import ico.fes.disp.factory.DispFactory;
import java.util.Scanner;

/**
 *
 * @author fabia
 */
public class TareaFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 1;
        
        System.out.println("¿Qué dispositivo buscas?");
        System.out.println(Disp.COMP+") Computadora");
        System.out.println(Disp.SMARTPHONE+") SmartPhone");
        System.out.println(Disp.TABLET+") Tablet");
        
        try {
            System.out.print("Elige el numero: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste un numero");
        }
        
        Disp dispositivo = DispFactory.createDisp(eleccion);
        System.out.println(dispositivo.toString());
    }
    
}
