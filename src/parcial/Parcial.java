/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.*;

/**
 *
 * @author Estudiantes
 */
public class Parcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculador miCalculador = new Calculador();
        Scanner miScan = new Scanner(System.in);
        
        System.out.println("X1");
        int entrada = miScan.nextInt();
        miCalculador.puntoUno.setX(entrada);
        
        System.out.println("Y1");
        entrada = miScan.nextInt();
        miCalculador.puntoUno.setY(entrada);
        
        System.out.println("X2");
        entrada = miScan.nextInt();
        miCalculador.puntoDos.setX(entrada);
        
        System.out.println("Y2");
                
        entrada = miScan.nextInt();
        miCalculador.puntoDos.setY(entrada);
        
        System.out.println(miCalculador.calcularArea());
        System.out.println(miCalculador.calcularDistancia());
        System.out.println(miCalculador.calcularPendiente());
        
        
        
        
    }
    
}
