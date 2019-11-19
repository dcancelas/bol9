package bol9_04;
import java.util.Scanner;

public class Metodos {
    
    private int num;
    Scanner sc = new Scanner(System.in);
    
    public int pedirDatos() {
        System.out.print("\nIntroduce un número: ");
                this.num = sc.nextInt();
        return num;
    }
}