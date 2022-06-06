package modelo;

public class Docente implements ITrabajador {
    private int nHoras;

    public Docente() {
    }

    public Docente(int nHoras) {
        this.nHoras = nHoras;
    }

    /**
     * @return the nHoras
     */
    public int getnHoras() {
        return nHoras;
    }

    /**
     * @param nHoras the nHoras to set
     */
    public void setnHoras(int nHoras) {
        this.nHoras = nHoras;
    }

    @Override
    public double cSalario() {
        return this.nHoras*120;
    }

    @Override
    public double cBonificacion() {
        return this.cSalario()*0.7;
    }
    
    
    
    
}
