package bol9_04;

public class Bol9_04 {
    public static void main(String[] args) {
        int num = 1;
        Metodos obx = new Metodos();
            do {
                num = obx.pedirDatos();
                if(num == 0) System.out.println("\nFIN");
                else {
                    System.out.println("");
                    for(int i = 1; i <= 10; i++) {
                        System.out.println(num+" * "+i+" = "+(num*i));
                    }
                }
            }while(num != 0);
    }
}