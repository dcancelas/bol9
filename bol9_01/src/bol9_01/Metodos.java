package bol9_01;
import java.util.Scanner;

public class Metodos {

    private int numero;
    Scanner sc = new Scanner(System.in);

    public int pedirDatos(int i) {
        System.out.print("Introduce un número ("+i+"/10): ");
            numero = sc.nextInt();
        return numero;
    }
}
