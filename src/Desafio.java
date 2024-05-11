import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String nombre = "Darwin";
        String tipoCuenta = "Corrriente";
        double saldo = 2000.00;
        int opcion = 0;

        System.out.println("************************");
        System.out.println("\nNombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo cuenta: S/." + saldo + "\n");
        System.out.println("************************");

        String menu = """
                ** Escriba el número de la opción deseada **
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    4 - Salir
                """;

        while( opcion != 4){
            System.out.println(menu);

            Scanner teclado = new Scanner(System.in);
            System.out.print("Digite la opcion: ");
            opcion = teclado.nextInt();

            // Este es un comentario nuevo

            switch (opcion) {
                case 1:
                    // CONSULTAR SALDO
                    System.out.println("Su saldo es: S/. " + saldo);
                    break;

                case 2:
                    // RETIRAR DINERO
                    System.out.println("Ingrese el monto a retirar: ");
                    double retiro = teclado.nextDouble();

                    if(saldo > retiro){
                        saldo -= retiro;
                        System.out.println("Esta retirando: " + retiro);
                        System.out.println("Su nuevo saldo es: " + saldo);
                    }else{
                        System.out.println("Saldo insuficiente");
                    }
                    break;

                case 3:
                    // DEPOSITAR DINERO
                    System.out.println("Ingrese el monto a depositar: ");
                    double deposito = teclado.nextDouble();

                    saldo += deposito;
                    System.out.println("Esta depositando: " + deposito);
                    System.out.println("Su nuevo saldo es: " + saldo);

                    break;

                case 4:
                    // SALIR
                    System.out.println("Esta saliendo de la aplicación");
                    break;

                default:
                    System.out.println("Opción incorrecta");
                    opcion = 4;
                    break;
            }
        }

    }
}

