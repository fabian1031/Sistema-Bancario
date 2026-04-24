
public class CuentaAhorros extends CuentaBancaria{
    private double tasaInteresMensual;
    private double saldoMinimo;

    // constructor
    public CuentaAhorros(String numeroCuenta, double saldo, String titular, double saldoMinimo, double tasaInteresMensual) {
        super(numeroCuenta, saldo, titular);
        this.saldoMinimo = saldoMinimo;
        this.tasaInteresMensual = tasaInteresMensual;
    }

    //getter
    public double getSaldoMinimo() {return saldoMinimo;}
    public double getTasaInteresMensual() {return tasaInteresMensual;}

    //setter
    public void setSaldoMinimo(double saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    public void setTasaInteresMensual(double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    //CuentaBancaria --> funciones
    @Override
    public String describir() {
        return super.describir() + " Tasa mensual: " + tasaInteresMensual + "%";
    }
    @Override
    public double calcularComision() {
        return getSaldo() >= saldoMinimo ? 0.0 : 12000.0;
    }
    @Override
    public void realizarRetiro(double monto) {
        setSaldo(getSaldo() - monto);
    }
    //sobrecarga
    public void realizarRetiro(double monto, boolean esUrgente) {
        double resultadoSaldo = (getSaldo() - monto);
        if (esUrgente && resultadoSaldo < saldoMinimo) {
            setSaldo(resultadoSaldo - calcularComision());
            System.out.println("Retiro urgente: se cobró comisión de $" + 12000.0);
        }else {
            setSaldo(resultadoSaldo);
        }
    }
    //funcion
    public double calcularInteresDelMes() {
        return getSaldo() * tasaInteresMensual / 100;
    }
}
