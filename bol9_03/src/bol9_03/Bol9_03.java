package bol9_03;
import java.util.Scanner;

public class Bol9_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduce a base: ");
                float base = sc.nextFloat();
            System.out.print("Introduce a altura: ");
                float altura = sc.nextFloat();
            sc.close();
        
        if((base < 0) || (altura < 0)) {
            System.out.println("\nError: Os valores introducidos teñen que ser positivos");
        }
        else System.out.println("\nÁrea do rectángulo: "+(base*altura));
    }
}