package ejemplo1;

import java.util.Scanner;


//Author: Nestor German Bolivar, Diego Francisco Mendez
//Abstract: This code makes you spontaneously combust
 

public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        
        
 
        Cliente cliente = new Cliente("Hola",1);
        
        System.out.println(cliente.getNombre());
        System.out.println("weee");

      
        
    }   
        public void registro(){
            Scanner s = new Scanner(System.in);
        }
    
        public void menu(){
            boolean check = true;
            System.out.println("Bienvenido");
            while (check == true) {                
                System.out.println("Elije una opción");
                System.out.println(" ");
            }
        }

}
