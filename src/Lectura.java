import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la pelicula: ");
        String pelicula = teclado.nextLine();
        System.out.println("Ingrese la fecha de Lanzamiento: ");
        int fecha = teclado.nextInt();
        System.out.println("Ingrese el precio de la pelicula: ");
        double precio = teclado.nextDouble();

        System.out.println("La pelicula es: " + pelicula + " fecha: " + fecha + " precio: " + precio);
    }
}
