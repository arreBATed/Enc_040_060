
package Entidades;


public class Cuenta {
    
    public int numeroCuenta;
    public long dniCliente;
    public double saldoActual; 
    
    public Cuenta() {
        
    }
    
    public Cuenta(int c, long d, double s) {
        
        numeroCuenta = c;
        dniCliente = d;
        saldoActual = s;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
}
