package ejemplo1;

import java.util.Scanner;



//Author: Nestor German Bolivar, Diego Francisco Mendez, Juan David Moreno
//Abstract: This code makes you spontaneously combust

public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        
        
 
        Cliente cliente = new Cliente("Hola",1);
        
        System.out.println(cliente.getNombre());
        System.out.println("weee");

        System.out.println("Hola");
        
    }
        
    
    public static void registro(){
        Scanner s = new Scanner(System.in);
        String nombre = s.nextLine();
        int cedula = Integer.parseInt(s.nextLine());
        
        
        System.out.println("");
        
    }
    
    public static void menu(){
        Scanner s = new Scanner(System.in);
        boolean check = true;
        while(check == true){
            check = false;
            
        }
    }
    
}
