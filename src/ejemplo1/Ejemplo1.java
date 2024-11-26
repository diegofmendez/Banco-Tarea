package ejemplo1;

import java.util.Scanner;

//Author: Nestor German Bolivar, Diego Francisco Mendez
//Abstract: This code makes you spontaneously combust
 
public class Ejemplo1 {
    
    public static void main(String[] args) {
        
        Ejemplo1.registro();
        System.out.println("weee");
        
        Ejemplo1.menu();
        
    }   
    public static void registro(){
        Scanner s = new Scanner(System.in);
        System.out.println("Creación de cuenta nueva:");
        System.out.println("Ingresa tu nombre completo");
        String nombre = s.nextLine();
        System.out.println("Ingresa tu numero de cedula");
        int cedula = Integer.parseInt(s.nextLine());
        Cliente cliente = new Cliente(nombre,cedula);
        Cuenta cuenta = new Cuenta(cliente);
        
        }
    public static void menu(){
        boolean check = true;
        System.out.println("Bienvenido");
        while (check == true) {                
            System.out.println("Elije una opción");
            System.out.println(" ");
            check=false;
        }
    }
}
