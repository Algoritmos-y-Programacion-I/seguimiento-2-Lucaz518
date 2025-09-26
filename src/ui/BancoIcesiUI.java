package ui;

import java.util.Scanner;

public class BancoIcesiUI {

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Agregue los atributos (relaciones) necesarios para conectar esta clase con el modelo.
     */

    private Scanner input;

    public static void main(String[] args) {

        BancoIcesiUI ui = new BancoIcesiUI();
        ui.menu();

    }

    // Constructor
    public BancoIcesiUI() {
        input = new Scanner(System.in);
    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * El siguiente metodo esta incompleto.
     * Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos
     */

    public void menu() {

        System.out.println("Bienvenido a BancoIcesi");

        int option = 0;
        do {
            System.out.println("Menu Principal");
            System.out.println("-".repeat(50));
            System.out.println("Elige una de las Opciones ​");
            System.out.println("1} Cliente nuevo (registro) ​​");
            System.out.println("2} Asignar cuenta bancaria a cliente ​​");
            System.out.println("3} Realizar un deposito​ ⬇​");
            System.out.println("4} Realizar retiros de dinero​ ​⬆​");
            System.out.println("5} Consultar con numero de cedula​");
            System.out.println("6} consultar saldo total todas las cuentas ​");
            System.out.println("0} Salir");
            option = input.nextInt();

            switch (option) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    asignarCuentaBancariaCliente();
                    break;
                case 3:
                    depositarDineroCuenta();
                    break;
                case 4:
                    retirarDineroCuenta();
                    break;
                case 5:
                    consultarCliente();
                    break;
                case 6:
                    consultarSaldoTotal();
                    break;
                case 0:
                    System.out.println("\nGracias por usar nuestros servicios. Adios!​");
                    break;
                default:
                    System.out.println("\nOpcion invalida. Intente nuevamente.​");
                    break;
            }

        } while (option != 0);

    }

    /*
     * ATENCION !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Los siguientes metodos estan incompletos.
     * Agregue la logica necesaria (instrucciones) para satisfacer los requerimientos
     */

    public void registrarCliente() {
        
    }

    public void asignarCuentaBancariaCliente() {

    }

    public void depositarDineroCuenta() {

    }

    public void retirarDineroCuenta() {

    }

    public void consultarCliente() {

    }

    public void consultarSaldoTotal() {

    }

}
