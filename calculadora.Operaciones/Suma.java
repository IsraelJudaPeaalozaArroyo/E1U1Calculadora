package calculadora.Operaciones;

public class Suma extends Operacion{
     public Suma(double numero1, double numero2) {
        super(numero1, numero2);
    }
    
    public double getResultado() {
        return super.getNumero1() + super.getNumero2();
    }

    @Override
    public String toString() {
        return super.getNumero1() + " + " + super.getNumero2()
               + " = " + this.getResultado();
    }
}
