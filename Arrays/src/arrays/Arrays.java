
package arrays;

import dominio.*;
import java.util.Scanner;



public class Arrays {

   
    public static void main(String[] args) {
     
        Scanner lectura = new Scanner(System.in);
        
        Persona personas[] = new Persona[3];
         
        //Persona personas[] = {new Persona("Santi"),new Persona("iker"),new Persona("maria")};

        //personas[0] = new Persona("Marcos");
       //personas[1] = new Persona("raul");
        //personas[2] = new Persona("juan");
        
        for (int i= 0; i < personas.length; i++){
            
            personas[i] = new Persona();
            
            
            System.out.println("introduce nombre");
            personas[i].setNombre(lectura.nextLine());
        
            System.out.println("personas [" + i + " ] ->" 
                + personas[i].getNombre());
       
        
        }
        
        
    }
    
}
