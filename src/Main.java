//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaAhorros("AHO-001", 2_000_000, "María Pérez", 500_000, 0.8);
        CuentaBancaria cuenta2 = new CuentaCorriente("CTE-002", 5_000_000, "Empresa Andina S.A.", 15_000, 1_000_000);
        CuentaBancaria cuenta3 = new CuentaInversion("INV-003", 10_000_000, "Carlos Ruiz", 250_000, 12, 12.5);

        // describir
        System.out.println(cuenta1.describir());
        System.out.println(cuenta2.describir());
        System.out.println(cuenta3.describir());

        // calcularComision
        System.out.println("-------------------------");
        System.out.println(cuenta1.calcularComision());
        System.out.println(cuenta2.calcularComision());
        System.out.println(cuenta3.calcularComision());

        // realizarRetiro
        System.out.println("------------------------");
        cuenta1.realizarRetiro(500_000);
        cuenta2.realizarRetiro(500_000);
        cuenta3.realizarRetiro(500_000);

        // Saldo
        System.out.println("-----------------------");
        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuenta3.getSaldo());
    }
}