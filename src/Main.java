//Felipe Navarro Jamaica
//Programa de apuestas
//22/08/2024
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner scanner = new Scanner(System.in);
        int resultado;
        double dinero;
        boolean seguir = true;
        System.out.println("Ingrese el dinero que va a apostar: ");
        dinero = scanner.nextDouble();
        while (seguir) {
            resultado = aleatorio.nextInt(1,4);
            System.out.println("El número que salió es.... " + resultado);
            if (resultado == 1) {
                System.out.println("Felicidades, duplicaste tu dinero");
                dinero *= 2;
                System.out.println("Tu dinero es: $" + dinero);
            } else
                if (resultado == 2) {
                System.out.println("Perdiste la mitad de tu dinero");
                dinero /= 2;
                System.out.println("Tu dinero es: $" + dinero);
            } else
                if (resultado == 3) {
                System.out.println("Lo sentimos, perdiste todo tu dinero");
                dinero = 0;
            }
            if (dinero > 0) {
                System.out.println("¿Deseas continuar? Si=1 No=2");
                int continuar = scanner.nextInt();
                if (continuar == 2) {
                    seguir= false;
                    System.out.println("Te retiras con: "+dinero);
                    System.out.println("Saliendo del juego...");
                }
            } else {
                seguir= false;
                System.out.println("Saliendo del juego...");
            }
        }
    }
}
