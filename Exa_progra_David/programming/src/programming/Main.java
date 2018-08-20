/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programming;

import java.util.Scanner;

/**
 *
 * @author Hosanna
 */
public class Main {
    public void menu(){
    
    Scanner tec = new Scanner(System.in);
        int opc;
       
       System.out.println("                         menu" .toUpperCase());
       System.out.println();
       System.out.println("************************************************************");
       System.out.println();
       
       System.out.println("Escoja su opcion");
       System.out.println("1. Ingresar Datos");
       System.out.println("2. Mostrar");
       System.out.println("3. Salir");
       System.out.println();
       
       System.out.print("--> ");
       opc = tec.nextInt();
       System.out.println();
       System.out.println("************************************************************");
       System.out.println();
       
        if (opc == 1) {
            ingresar_informacion call = new ingresar_informacion();
            call.log_in(); 
        }else if (opc == 2){
            show call = new show();
            call.mostrar();
        }else if (opc == 3){
            Main call = new Main();
            call.menu();
        }else{
            System.out.println("                     Error de eleccion!" .toUpperCase());
            System.out.println("                    Intentelo de nuevo!" .toUpperCase());
            System.out.println();
            System.out.println("************************************************************");
            System.out.println();
            Main call = new Main();
            call.menu();
        }
    
    
    
    }
    
}
