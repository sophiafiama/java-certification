package tipo;

import java.io.File;

public class TiposWrappers {
    public static void main(String[] args) {
        double number = 123.56;
        int numberInt = (int) number;
        System.out.println("conversao explicita " + numberInt);

        double d = 100.70;
        int i = (int) d;
        System.out.println("conversao implicita " + i);

        Double d2 = 100.20;
        Integer i2 = d2.intValue();
        System.out.println("conversao implicita " + i2);

        String num = "100";
        int i3 = Integer.parseInt(num);
        System.out.println(i3); // 100

        String num2 = "100.50";
        double d3 = Double.parseDouble(num2);
        System.out.println(d3);

        double d4 = 100.50;
        String num3 = String.format("%.2f", d4);
        String num4 = String.valueOf(d4);
        String num5 = Double.toString(d4);
        System.out.println("num3 "+ num3);
        System.out.println("num4 "+ num4);
        System.out.println("num5 "+num5);

        System.out.println(num3.equals(num4));
        System.out.println(num3.equals(num5));
        System.out.println(num4.compareTo(num5)); // ve se é maior ou menor
       //  System.out.println(num4 > num5); // nao compila

        // Tipos Costumizados

        Math math = null;
        File file = null; // Precisa importar

        // Constantes
        final double VALOR_DE_PI = 3.14;
       // VALOR_DE_PI=3.15; //Esta linha vai apresentar erro de compilação!









    }
}
