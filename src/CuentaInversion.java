public class CuentaInversion extends  CuentaBancaria{
    private double tasaAnual;
    private int plazoMeses;
    double penalizacionRetiroAnticipado;

    public CuentaInversion(String numeroCuenta, double saldo, String titular, double penalizacionRetiroAnticipado, int plazoMeses, double tasaAnual) {
        super(numeroCuenta, saldo, titular);
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
        this.plazoMeses = plazoMeses;
        this.tasaAnual = tasaAnual;
    }
    //getter
    public double getPenalizacionRetiroAnticipado() {return penalizacionRetiroAnticipado;}
    public int getPlazoMeses() {return plazoMeses;}
    public double getTasaAnual() {return tasaAnual;}

    //setter
    public void setPenalizacionRetiroAnticipado(double penalizacionRetiroAnticipado) {
        this.penalizacionRetiroAnticipado = penalizacionRetiroAnticipado;
    }
    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }
    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    //funciones
    @Override
    public String describir() {
        return super.describir() + "plazo meses" + plazoMeses + "tasa Anual " + tasaAnual +"%";
    }

    @Override
    public double calcularComision() {
        return penalizacionRetiroAnticipado;
    }

    @Override
    public void realizarRetiro(double monto) {
        setSaldo(getSaldo() - (monto + penalizacionRetiroAnticipado));
    }
    public double calcularComision(int mesesTranscurridos) {
        return mesesTranscurridos >= plazoMeses ? 0.0 : penalizacionRetiroAnticipado;
    }


}
