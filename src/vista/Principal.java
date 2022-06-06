package vista;

import modelo.*;

public class Principal {
    public static void main(String[] args) {
        
        ITrabajador juan = new Empleado();
        imprimirBonificacion(juan);
        
        ITrabajador pedro = new Docente(100);
        imprimirBonificacion(pedro);
        
        Empleado pepe = new Empleado("Secretaria");
        imprimirBonificacion(pepe);

        
        
    }
    
    public static void imprimirBonificacion(ITrabajador t){
        System.out.println("Salario: " + t.cSalario());
        System.out.println("Bonificacion: " + t.cBonificacion());
        System.out.println("----------------------------\n");
    }
}
