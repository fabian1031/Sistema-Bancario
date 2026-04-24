public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;

    //constructor vacio

    public CuentaBancaria() {
    }

    // constructor lleno
    public CuentaBancaria(String numeroCuenta, double saldo, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    // Getter

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    //setter

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo() {
        this.saldo = saldo;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    //funciones

    public String describir() {
        return "cuenta" + numeroCuenta + "Titular" + titular + "saldo $ " + saldo;
    }

    public double calcularComision() {
        return 0.0;
    }

    public double realizarRetiro(double monto) {
        if (monto <= saldo) {
            this.saldo -= monto;
        } else {
            return monto;
        }
    }
}
