


/**
 * Class CuentaBancaria
 */
public class CuentaBancaria {

    private double saldo;

    public CuentaBancaria(double saldoInicial) {

        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {

        if (monto > 0) {
            saldo += monto;
        } else {
            System.out.println("Monto inválido");
        }
    }

    public void retirar(double monto) {

        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
}
