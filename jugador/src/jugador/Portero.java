/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

public class Portero  extends Jugador{
  static short mediaGoles;
   short golesTemporada;
   boolean extranjero;
   static int sumaGoles;
    static int numPorteros;
   public Portero( short golesTemporada,boolean extranjeros) {
    
       this.golesTemporada = golesTemporada;
       this.extranjero = extranjero;
      sumaGoles= sumaGoles + golesTemporada;
    numPorteros ++;
    mediaGoles = (short)(sumaGoles / numPorteros);
    }
   
   public void mostrarP(){
       
       mostrar();
         System.out.println("media" + mediaGoles);  
    System.out.println("extranjero" + extranjero);
    
   } 
    
    
}
