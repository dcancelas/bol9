package bol9_01;

public class Bol9_01 {

    public static void main(String[] args) {
        int i;
        int num;
        int ceros = 0;
        int positivos = 0;
        int negativos = 0;

        System.out.println("");
        for(i = 1; i <= 10; i++) {
            Metodos obx = new Metodos();
                num = obx.pedirDatos(i);
                if(num == 0) ceros++;
                if(num > 0) positivos++;
                if(num < 0) negativos++;
        }
        System.out.println(
            "\nNúmeros positivos: "+positivos+
            "\nNúmeros negativos: "+negativos+
            "\nCeros: "+ceros);
    }
}
