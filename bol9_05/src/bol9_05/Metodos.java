package bol9_05;

public class Metodos {

    public void serieA(int numElem) {
        int num = 2;
        if(numElem <= 0) System.out.print("\na)");
        if(numElem == 1) System.out.print("\na) "+num);
        if(numElem > 1) {
            System.out.print("\na) "+num);
            for (int i = 2; i <= numElem; i++) {
                System.out.print(" + "+(num+2));
                num = (num+2);
            }
        }
    }
    public void serieB(int numElem) {
        System.out.print("\nb)");
        for (int i = 1; i <= numElem; i++) {
            if((i % 2) != 0) System.out.print(" - "+i);
            if((i % 2) == 0) System.out.print(" + "+i);
        }
    }
    public void serieC(int numElem) {
        int num1 = 0;
        int num2 = 1;
        System.out.print("\nc) ");
        for (int i = 1; i <= numElem; i++) {
            if(i == numElem) System.out.print(num1);
            else System.out.print(num1+", ");
            int suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }

}