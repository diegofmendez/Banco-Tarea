package ejemplo1;
// Describiendo un sistema bancario
//Metodos son: consignar, retirar, tranferencia
// Clase cliente y clase cuenta

public class Cuenta {
    
    private String titular;
    private double Saldo;

    public Cuenta(Cliente cliente) {
        titular = cliente.getNombre();
    }


    boolean consignacion(double x){
        
        boolean peticion = true;
        
        if(peticion == true){
                Saldo = Saldo + x;
                return true;
        }else{
            return false;
        }  
    }
    
    boolean retiro(double x){
        
        boolean peticion = true;
        
        if(peticion == true){
                Saldo = Saldo - x;
                return true;
        }else{
            return false;
        }  
    }

    double getSaldo() {
        
        return this.Saldo;
    }
}
