package challenge.SocketT;

import java.util.*;

public class TestHas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = 0;

        System.out.println(" Aqui van a ir los problemas que se tiene que resolver");
        System.out.println("1. Contador de palabras ");
        System.out.println("2. Contador de letras");
        System.out.println("3. Reto de IBM de las cadenas y el Stack ");
        System.out.println("4. Reto Quirino");

        opc = Integer.parseInt(sc.nextLine());
        switch (opc) {
            case 1:
                ContadorPalabras();
                break;
            case 2:
                ContadorLetras();
            case 3:
                IBM();
            case 4:
                quirino();
                break;
        }
    }


    public static void ContadorPalabras() {
        String cadena = "Hola mundo mundo mundo Hola Hola mundo";
        HashMap<String, Integer> mapa = new HashMap<>();
        cadena = cadena.strip();

        String[] aux = cadena.split(" ");

        for (int i = 0; i < aux.length; i++) {
            mapa.put(aux[i], mapa.getOrDefault(aux[i], 0) + 1);
        }
        for (Map.Entry<String, Integer> a : mapa.entrySet()) {
            System.out.println("La palabra " + a.getKey() + " Esta repetida " + a.getValue());
        }

    }

    public static void ContadorLetras() {
        System.out.println("Se seleciono el contador de letras");
        String cadena2 = "Hola mundo mundo mundo Hola Hola mundo";
        String cadena = cadena2.strip();
        System.out.println("El metodos " + cadena);

        HashMap<Character, Integer> mapa = new HashMap<>();


        //conttar los digitos de los sigueinte cosas
        for (int i = 0; i < cadena.length(); i++) {
            mapa.put(cadena.charAt(i), mapa.getOrDefault(cadena.charAt(i), 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> a : mapa.entrySet()) {
            System.out.println("La letra " + a.getKey() + " se repite: " + a.getValue());
        }
    }

    public static void IBM() {
        String cadena = "([{}])";
        boolean band = true;
        System.out.println("Aqui va el reto del IBM");
        Stack<Character> pila = new Stack<>();
        if (cadena.length() == 0) {
            System.out.println("La cadena esta vacia y no hay nada que resolver");
        }
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '{' || cadena.charAt(i) == '[') {
                //si es de entrada hacemos el guardado del problema
                pila.push(cadena.charAt(i));

            } else {
                //verificar que la pila no este vacia
                if (pila.isEmpty()) {
                    System.out.println("Las cadenas no son pares");
                    break;
                }

                Character letra = cadena.charAt(i);
                Character letraE = pila.pop();
                switch (letra) {
                    case ')':
                        if (letraE != '(') {
                            band = false;
                        }
                        break;
                    case ']':
                        if (letraE != '[') {
                            band = false;
                        }

                        break;
                    case '}':
                        if (letraE != '{') {
                            band = false;
                        }
                        break;
                }
                if (!band) {
                    break;
                }
            }
            //revisar que sea una cadena de enytrada lo que se quiere hacer

        }

        if (band && pila.isEmpty()) {
            System.out.println("Las operaciones son pares");
        } else {
            System.out.println("Las operaciones no son pares");
        }
    }

    public static void quirino() {
        int[] numeros = {1, 2, 3, 4, 5, 7, 8, 9, 10, 14, 12, 16, 5, 6};
        HashSet<Integer> hashSet = new HashSet<>();
        boolean band = true;
        int tarjet = 10;

        for (int i = 0; i < numeros.length; i++) {
            int resta = tarjet - numeros[i];
            if (hashSet.contains(resta)) {
                System.out.println("Los numeros que pueden hacer pares son " + resta + " + " + numeros[i]);
            } else {
                hashSet.add(numeros[i]);
            }
        }
        System.out.println("Ya se termino la ejecucion");
    }
}
