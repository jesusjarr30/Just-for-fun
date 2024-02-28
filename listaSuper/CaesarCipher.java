package challenge.listaSuper;

public class CaesarCipher {
    public static void main(String[] args) {
        String cadena = "The";
        int k=3;
        System.out.println(caesarCipher(cadena,k));

    }
    public static String caesarCipher(String s, int k) {
        StringBuilder nuevo = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);

            if (Character.isLetter(letra)) {
                int inicio = Character.isLowerCase(letra) ? 'a' : 'A';
                int numero = inicio + (letra - inicio + k) % 26;
                nuevo.append((char) numero);
            } else {
                nuevo.append(letra);
            }
        }

        return nuevo.toString();

    }
}
