package POO.Actividad_7_1;

public class CuentaCorriente {

    private String DNI;

    public void setDNI(String dNI) {
        DNI = dNI;
    }

    public String getDNI() {
        return DNI;
    }

    private String titular;

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    private int saldo = 0;

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void ingresarDinero(int cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se ingresaron " + cantidad + " pesos. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad ingresada no es válida.");
        }
    }

    public void sacarDinero(int cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se retiraron " + cantidad + " pesos. Nuevo saldo: " + saldo);
        } else {
            System.out.println("La cantidad a retirar no es válida o excede el saldo actual.");
        }
    }

    CuentaCorriente(String DNI, String titular, int saldo) {
        this.DNI = DNI;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void imprimir() {
        imprimirDatos();
    }

    public void imprimirDatos() {
        System.out.println("DNI: " + getDNI() + " titular: " + getTitular() + " saldo: " + getSaldo());
    }

}
