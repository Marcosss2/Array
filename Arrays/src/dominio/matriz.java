
package dominio;


public class matriz {
  
    
     public static void main(String[] args) {
         
       int edades [][] = new int[5][2];
       edades[0][0] = 5;
       edades[0][1] = 10;
       edades[1][0] = 15;
       edades[1][1] = 7;
       imprimir(edades);
       
       
     }
       public static void imprimir(int matriz[][]) {
       for (int i= 0; i < matriz.length; i++){
           for (int j= 0; j < matriz[i].length; j++){
           
              System.out.println("edades" + i + "g" + j + "re"  + matriz[i][j]);
           }
           }
       }
       
         
     
     
    
    
}
