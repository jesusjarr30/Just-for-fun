package challenge;

import java.math.BigInteger;

public class SuperDigit {
    public static void main(String[] args) {
        System.out.println("Aqui empiza todo el Show que se debe de realizar");
        String numero = "9875";
        System.out.println(superDigit(numero, 4));
    }


    // Write your code here
    public static int superDigit(String n, int k) {
        String cadena = "";
        for (int i = 0; i < k; i++) {
            cadena += n;
        }

        BigInteger numero = new BigInteger(cadena);
        BigInteger suma = new BigInteger("10");

        while (suma.compareTo(new BigInteger("9")) > 0) {
            suma = new BigInteger("0");
            BigInteger tempNumero = numero; // Copia del numero original para mantener su valor
            while (tempNumero.compareTo(BigInteger.ZERO) != 0) {
                suma = suma.add(tempNumero.mod(new BigInteger("10")));
                tempNumero = tempNumero.divide(new BigInteger("10"));
            }
            numero = suma;
        }

        return Integer.parseInt(String.valueOf(numero));


    }
}
