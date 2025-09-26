package model;

/**
 * La clase Cuenta representa una cuenta bancaria asociada a un cliente.
 */
public class Cuenta {

    // Atributos
    private String nombreBanco;
    private TipoCuenta tipoCuenta; // Uso del ENUM
    private double saldoActual;

    // Constructor
    /**
     * constructor de cuenta.
     * @param nombreBanco nombre del banco.
     * @param tipoCuenta el tipo de cuenta que puede ser ahorros o corriente.
     * @param saldoActual saldo de la cuenta.
     */
    public Cuenta(String nombreBanco, TipoCuenta tipoCuenta, double saldoActual) {
        this.nombreBanco = nombreBanco;
        this.tipoCuenta = tipoCuenta;
        this.saldoActual = saldoActual;
    }

    // analizadores y modificadores
    /**
     * devuelve el nombre del banco.
     * @return El nombre del banco.
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * Devuelve el tipo de cuenta.
     * @return tipo de cuenta.
     */
    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     * @return El saldo actual.
     */
    public double getSaldoActual() {
        return saldoActual;
    }

    /**
     * pone un nuevo saldo a la cuenta.
     * @param saldoActual Saldo nuevo.
     */
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    // Métodos Funcionales
    /**
     * Depositar en la cueta.
     * @param cantidad La cantidad de dinero a depositar debe ser >0.
     */
    public void depositarDinero(double cantidad) {
        this.saldoActual += cantidad;
    }

    /**
     * Retirar dinero de la cuenta
     * @param cantidad La cantidad de dinero a retirar (debe ser > 0).
     * @return true si el retiro fue exitoso (saldo no negativo), false de lo contrario.
     */
    public boolean retirarDinero(double cantidad) {
        if (this.saldoActual - cantidad >= 0) {
            this.saldoActual -= cantidad;
            return true;
        }
        return false; // Saldo insuficiente.
    }

    /**
     * devuelve la info mas imporatante de la cuenta con detallers.
     * usao para la consulta del cliente.
     * @return La información detallada de la cuenta.
     */
    public String toString() {
        return "  Banco: " + nombreBanco +
               ", Tipo: " + tipoCuenta +
               ", Saldo: $" + String.format("%,.2f", saldoActual);
    }
}