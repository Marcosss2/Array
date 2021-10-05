/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import java.util.Scanner;



public class delantero  extends Jugador{
 static short totalGoles;
  boolean español;
  float peso;
Scanner entrada = new Scanner(System.in);
    public delantero() {
   
    
    }

    public delantero( short totalGoles,boolean español) {
        this.totalGoles = totalGoles;
        this.español = español;
        
         System.out.println("introduce el peso");
        peso = entrada.nextFloat();
    }
    
    
    
   public void mostrard(){
       
       mostrar();
       
     System.out.println("etotalGoles" + totalGoles);  
    System.out.println("español" + español);
    System.out.println("peso" + peso);
   
   
   } 
    
    
    
}
