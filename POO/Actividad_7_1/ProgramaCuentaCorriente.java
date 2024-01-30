package POO.Actividad_7_1;

import java.util.Scanner;

public class ProgramaCuentaCorriente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CuentaCorriente cuenta1 = new CuentaCorriente("A12314D", "Giovanni", 0);

        System.out.println("El titular de la cuenta es: " + cuenta1.getTitular());
        System.out.println("El saldo es de: " + cuenta1.getSaldo());

        int opcion;

        do {
            System.out.println("\nElija una opción:");
            System.out.println("1. Datos de la cuenta.");
            System.out.println("2. Titular.");
            System.out.println("3. Saldo.");
            System.out.println("4. Ingreso.");
            System.out.println("5. Retirada.");
            System.out.println("6. Salir.");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    cuenta1.imprimirDatos();
                    break;
                case 2:
                    System.out.println("Titular de la cuenta: " + cuenta1.getTitular());
                    break;
                case 3:
                    System.out.println("Saldo actual: " + cuenta1.getSaldo());
                    break;
                case 4:
                    System.out.println("Ingrese la cantidad a depositar:");
                    int cantidadIngreso = sc.nextInt();
                    cuenta1.ingresarDinero(cantidadIngreso);
                    break;
                case 5:
                    System.out.println("Ingrese la cantidad a retirar:");
                    int cantidadRetiro = sc.nextInt();
                    cuenta1.sacarDinero(cantidadRetiro);
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }

        } while (opcion != 6);

        sc.close();
    }
}
