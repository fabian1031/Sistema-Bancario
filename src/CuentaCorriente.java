public class CuentaCorriente extends CuentaBancaria {
    private double comisionPorTransaccion;
    private double limiteSOBREGIRO;

    //constructor

    public CuentaCorriente(String numeroCuenta, double saldo, String titular, double comisionPorTransaccion, double limiteSOBREGIRO) {
        super(numeroCuenta, saldo, titular);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSOBREGIRO = limiteSOBREGIRO;
    }
    //getter

    public double getComisionPorTransaccion() {
        return comisionPorTransaccion;
    }

    public double getLimiteSOBREGIRO() {
        return limiteSOBREGIRO;
    }

    //setter

    public void setComisionPorTransaccion(double comisionPorTransaccion) {
        this.comisionPorTransaccion = comisionPorTransaccion;
    }

    public void setLimiteSOBREGIRO(double limiteSOBREGIRO) {
        this.limiteSOBREGIRO = limiteSOBREGIRO;
    }

    @Override
    public String describir() {
        return super.describir() + " | Comisión por transacción: " + comisionPorTransaccion;
    }

    @Override
    public double calcularComision() {
        return comisionPorTransaccion;
    }

    @Override
    public void realizarRetiro(double monto, boolean comisionPorTransaccion) {
        double resultadoDescuento = (getSaldo() - monto);
        return resultadoDescuento > limiteSOBREGIRO ? "el retiro no es posible" : monto - comisionPorTransaccion;
    }
}


