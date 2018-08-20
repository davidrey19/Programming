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
public class ingresar_informacion {
    public void log_in(){
    
    Scanner sc = new Scanner(System.in);
    String word;
    int cant;
    String datos[][] = new String[1][19];
    

    
    System.out.println("                Ingrese la informacion" .toUpperCase());
    System.out.println();
    System.out.println("************************************************************");
    System.out.println();
    
    System.out.println("Corrientes");
    System.out.print("--> ");
    word = sc.nextLine(); 
    System.out.print("--> ");
    word = sc.nextLine();
    System.out.println();
    
    System.out.println("Participantes a presidente ");
    System.out.print("--> ");
    word = sc.nextLine();
    System.out.print("--> ");
    word = sc.nextLine();
    System.out.println();
       
    System.out.println("Total Papeletas en Santa Barbara");
    System.out.print("--> ");
    cant = sc.nextInt(); 
    System.out.print("--> ");
    cant = sc.nextInt(); 
    System.out.println();
    
    System.out.println("Total Papeletas en Cortes");
    System.out.print("--> ");
    cant = sc.nextInt();
    System.out.print("--> ");
    cant = sc.nextInt();
    System.out.println();
    
    System.out.println("Total Papeletas en Francisco Morazan");
    System.out.print("--> ");
    cant = sc.nextInt(); 
    System.out.print("--> ");
    cant = sc.nextInt();
    System.out.println();
    
    System.out.println("Total Papeletas en Comayagua");
    System.out.print("--> ");
    cant = sc.nextInt(); 
    System.out.print("--> ");
    cant = sc.nextInt(); 
    System.out.println();
    
    System.out.println("Total Papeletas en Copan");
    System.out.print("--> ");
    cant = sc.nextInt();
    System.out.print("--> ");
    cant = sc.nextInt();
    System.out.println();
    
    System.out.println("Total Papeletas en Atlantida");
    System.out.print("--> ");
    cant = sc.nextInt();
    System.out.print("--> ");
    cant = sc.nextInt();
    System.out.println();
    
    System.out.println("Total Papeletas en los departamentos");
    System.out.print("--> ");
    cant = sc.nextInt(); 
    System.out.println();
    
    sc.nextLine();
    
    System.out.println("Puestos");
    System.out.print("--> ");
    word = sc.nextLine();
    System.out.print("--> ");
    word = sc.nextLine();
    System.out.println();
    
    System.out.println();
    System.out.println("************************************************************");
    System.out.println();
    
    System.out.println("                    Datos guardados" .toUpperCase());
    System.out.println();
    
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                System.out.println("Resultado: " + i  + "-" + j + " : " + datos[i][j]);
            }
            
        }
    
    System.out.println();
    System.out.println("************************************************************");
    System.out.println();
    
    System.out.println("************************************************************");
    System.out.println();
    
        
    Main call = new Main();
    call.menu();
    
    }
    
}
