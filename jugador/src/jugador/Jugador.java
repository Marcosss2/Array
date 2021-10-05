/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author Marco
 */
public class Jugador {
String nombreEquipo;
short numJugador;
short anio;

    public Jugador() {
     nombreEquipo = "cdhorche";
     numJugador = (short)(Math.random()* (24-1)+2);
      anio = (short)(Math.random()* (2000-1975)+1976);
    }
    
  public void mostrar()
  {
      
    System.out.println("equipo" + nombreEquipo);  
    System.out.println("equipo" + numJugador);
    System.out.println("equipo" + anio);
  
  }


    public static void main(String[] args) {
        
    delantero D1 = new delantero((short) 1, true);
D1.mostrard();
delantero D2 = new delantero((short) 27,false);
D2.mostrard();
Portero P1 = new Portero((short) 25, true);
P1.mostrarP();

    
    
    }
    
}
