package bol9_06;

public class Bol9_06 {
    public static void main(String[] args) {
        Metodos obx = new Metodos();
            float soldo = 1;
            float cont = 0;
            float contMil = 0;
            float contPorcent = 0;

            do {
                soldo = obx.pedirDatos();
                cont++;
                if((1000 <= soldo) && (soldo <= 1750)) {
                    contMil++;
                }
                if(soldo < 1000) {
                    contPorcent++;
                }
                System.out.println("Ganan entre 1000 e 1750 euros: "+(int)contMil);
                System.out.println("Ganan menos de 1000 euros: "+((contPorcent*100)/cont)+"%");
            }while(soldo != 0);
            System.out.println("\nFIN");
    }
}