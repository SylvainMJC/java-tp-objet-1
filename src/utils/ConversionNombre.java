package utils;

public class ConversionNombre {

    public static void main(String[] args) {
        String string = "5";

        int test_convert = Integer.parseInt(string);
        System.out.println("Conversion de la chaine de caractère en entier : " + test_convert);

        int a = 5;
        int b = 6;

        int max = Integer.max(a, b);
        System.out.println("Le plus grand nombre est : " + max);
    }

}
