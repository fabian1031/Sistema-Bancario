
public class CuentaAhorros extends CuentaBancaria{
    private double tasaInteresMensual;
    private double saldoMinimo;


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

    //funciones
    @Override
    public String describir() {
       String base = super.describir();
        return base + " Tasa Mensual: " + tasaInteresMensual + "%";

    }

    @Override
    public double calcularComision(){
        if (getSaldo()>= saldoMinimo){
            return 0.0;
        }else {
            return 12000.0;
        }
    }

    }


}
