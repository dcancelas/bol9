package bol9_02;

public class Bol9_02 {
    public static void main(String[] args) {
        int i;
        int num = 0;
        int suma = 0;
        
        for(i = 1; i<90; i++) {
            num++;
            if((num >= 10) && (num <= 90)) suma = (suma + num);
        }
        System.out.println("\nResultado da suma dos números comprendidos entre 10 e 90: "+suma);
    }
}