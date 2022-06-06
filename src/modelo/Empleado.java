package modelo;

public class Empleado implements ITrabajador {
    private String cargo;

    public Empleado() {
        this("Coordinador");
    }

    public Empleado(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public double cSalario() {
       double salario=0;
       
       if(this.cargo.equalsIgnoreCase("Coordinador"))
           salario=5000;
       else if(this.cargo.equalsIgnoreCase("Asistente"))
           salario=4000;
       else if(this.cargo.equalsIgnoreCase("Secretaria"))
           salario=3000;
       
       return salario;
        
    }

    @Override
    public double cBonificacion() {
        return this.cSalario() * 1;
    }
    
    
    
}
