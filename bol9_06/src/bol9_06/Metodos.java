package bol9_06;
import java.util.Scanner;

public class Metodos {
    private float soldo;
    Scanner sc = new Scanner(System.in);

    public float pedirDatos() {
        System.out.print("\nIntroduce o soldo: ");
            this.soldo = sc.nextFloat();
        return soldo;
    }

}