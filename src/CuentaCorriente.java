public class CuentaCorriente extends CuentaBancaria{
    private double comisionPorTransaccion;
    private double limiteSOBREGIRO;

    //constructor

    public CuentaCorriente(String numeroCuenta, double saldo, String titular, double comisionPorTransaccion, double limiteSOBREGIRO) {
        super(numeroCuenta, saldo, titular);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSOBREGIRO = limiteSOBREGIRO;
    }
    //getter

    public double getComisionPorTransaccion() {return comisionPorTransaccion;}
    public double getLimiteSOBREGIRO() {return limiteSOBREGIRO;}

    //setter

    public void setComisionPorTransaccion(double comisionPorTransaccion) {
        this.comisionPorTransaccion = comisionPorTransaccion;
    }

    public void setLimiteSOBREGIRO(double limiteSOBREGIRO) {
        this.limiteSOBREGIRO = limiteSOBREGIRO;

        //funciones
    }
}
