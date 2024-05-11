//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome a Darwin Store!");

        int fechaDeLanzamiento = 2000;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println("Media: " + media);

        System.out.println("Mis películas " + fechaDeLanzamiento );

        String sinopsis = "Esta es la sinopsis de una pelicula";

        String text = """
                La burbuja es una perra muy buena
                La lulu es unica
                """;
        System.out.println(text);


        String nombre = "Maria";
        int edad = 30;
        double valor = 55.9999;
        System.out.println(String.format("Mi nombre es %s, tengo %d años y hoy gasté %.2f dolares", nombre, edad, valor));

        // CASTING
        int clase = (int) notaDeLaPelicula;
        System.out.println(clase);

        double temperaturaCelsius = 28.5;
        double temperaturaFahrenheit = (temperaturaCelsius*1.8)+32;

        System.out.println(String.format("El valor %2f grados Celsius es igual a %2f grados Fahrenheit",temperaturaCelsius,temperaturaFahrenheit));

        int enteroTemperaturaFahrenheit = (int) temperaturaFahrenheit;
        System.out.println("El valor entero de los grados Fahrenheit es: " + enteroTemperaturaFahrenheit);

    }

}
