package bol9_05;
import java.util.Scanner;

public class Bol9_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("\nIntroduzca el número de elementos: ");
                int numElem = sc.nextInt();
            sc.close();
            
        Metodos obx = new Metodos();
            obx.serieA(numElem);
            obx.serieB(numElem);
            obx.serieC(numElem);
            System.out.println("");
    }
}