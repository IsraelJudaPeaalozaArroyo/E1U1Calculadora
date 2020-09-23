package calculadora.Operaciones;

public abstract class Operacion {
    private double numero1;
    private double numero2;

    public Operacion() {
        this.numero1 = this.numero2 = 1;
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    
    
    @Override
    public String toString() {
        return "Operaciones Básicas{" + "operando1 = " + numero1
                + ", operando2 = " + numero2 + '}';
    }

   
}
