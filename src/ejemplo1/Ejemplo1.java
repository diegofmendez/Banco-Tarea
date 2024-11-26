package ejemplo1;

import java.util.Scanner;



//Author: Nestor German Bolivar, Diego Francisco Mendez, Juan David Moreno
//Abstract: This code makes you spontaneously combust

public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        
        Ejemplo1.menu();
 
        Cliente cliente = new Cliente("Hola",1);
        
        System.out.println(cliente.getNombre());
        System.out.println("weee");

        System.out.println("Hola");
        
    }
        
    
    public static void registro(){
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = s.nextLine();
        System.out.println("Ingrese su núero de cedula");
        int cedula = Integer.parseInt(s.nextLine());
        
        
        System.out.println("");
        
    }
    
    public static void menu(){
        Scanner s = new Scanner(System.in);
        boolean check = true;
        while(check == true){
            System.out.println("Elige una opción: ");
            System.out.println("1: Consignar");
            System.out.println("2: Extraer");
            int option= s.nextInt();
            if (option==1) {
                System.out.println("Suicidate");
            } else if (option == 2){
                System.out.println("Oh chet");
            }else{
                System.out.println("Fin");
                check = false;
            }
        }
    }
    
}
