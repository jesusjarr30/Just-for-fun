package challenge.Oracle;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class ManagerE {


    /*
     * desciprcion del ejercion
     *
     * se tiene un texto y una plabra la cual tenemos que buscar cuantas veces aparece su anagrama en el texto
     * y regresar la cantiddad de veces que este aparece en la cadena
     *
     * */


    /*
     * El otro ejericio es ver una texto yu contar cuantos anagramas hay yu su frecuencioa y regresar el anagrama con mas frecuencia en la lista
     *
     * */

    /*
     * Falta hacer el conteo de palabra de un texto que fue el reto que me hicieron en el tipo de la india y con el cual podemos retornar
     * la palabra mas repetida de texto
     *
     * */

    public static void main(String[] args) {
        //aqui empiza el ejercicio

        String texto = "abc bca erabca abcabc";
        String cadena = "abc";

        System.out.println("El resultado es el sigueinte  " + evaluacion(texto, cadena));
        //vamos con los ejerciocios de contra anagramas
        System.out.println("--------------");
        System.out.println("Ejercicio de la primera entrevista ");

        texto = "rom amor mor mamor amro";//seria tres la cosas que deberia de regresar
        cadena = "roma";
        System.out.println(contadorAnagramas(texto, cadena));

        System.out.println("--------------");
        System.out.println("Ejercicio contrador de anagaramas dos");
        System.out.println(contadorAnagramas2(texto, cadena));

        cadena = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer ut ultricies ex. Vivamus consequat mi a libero consectetur, id laoreet velit placerat. Phasellus quis viverra nulla. Sed bibendum, sapien nec feugiat fermentum, nisi orci egestas nulla, a dictum dolor odio a est. Mauris lacinia metus at tempor dictum. Nullam euismod odio id risus varius, a consectetur ligula aliquam. at at at at Proin in magna vel orci malesuada vehicula. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nam hendrerit, velit sit amet bibendum aliquam, nisi tortor semper nisi, vel convallis purus leo at justo. Vivamus vulputate dui non dolor condimentum, quis tempor nunc rutrum.";
        System.out.println("--------------");
        System.out.println("El contador de palabras");
        System.out.println(contadorPalabras(cadena));

        /*
        Dada una lista solo con los anagramas que aparecen primero en la lista y dejar los demas para despues
        */
        System.out.println("--------------");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("amor");
        lista.add("roma");
        lista.add("hola");
        lista.add("hello");
        lista.add("olha");

        EliminarRepetidos(lista);
    }

    public static int evaluacion(String cadena, String busqueda) {
        int cont = 0;
        //primero tengo que acomodar por orden alfabetrico el texto de busqueda
        char[] nuevoBusqueda = busqueda.toCharArray();
        Arrays.sort(nuevoBusqueda);
        for (int i = 0; i < cadena.length() - busqueda.length() + 1; i++) {
            //si se encuntra una coincidencia es necesario ir para adelante
            if (busqueda.contains(String.valueOf(cadena.charAt(i)))) {
                //si encontro una coincidencia obtener el nuevo sub String del primer String
                String nuevaCoincidencia = cadena.substring(i, i + busqueda.length());
                //obtenemos la nueva cadena y hacemos la evaluacion de la misma
                char[] coincidencia = nuevaCoincidencia.toCharArray();
                Arrays.sort(coincidencia);
                if (Arrays.equals(coincidencia, nuevoBusqueda)) {
                    cont++;
                    i = i + busqueda.length() - 1;
                }
            }
        }
        return cont;
    }

    public static int contadorAnagramas(String texto, String busqueda) {
        //van a pasar un anagrama el cual debemos de buscar todas sus posibles convinaciones en un
        HashMap<Character, Integer> map1 = new HashMap<>();
        int cont = 0;
        //obtener el mapa de frecuancias de la primera palabra

        for (int i = 0; i < busqueda.length(); i++) {
            map1.put(busqueda.charAt(i), map1.getOrDefault(busqueda.charAt(i), 0) + 1);
        }
        //printMap(map1);
        //con esto podemos tener las cosas de frecunacias
        //hacere lo mismo que se hizo en el ejerecisio anterior de utilizar dos hasmap paqra hacer las comparaciones

        String[] diviciones = texto.split(" ");//con esto dividimos las cosas parea poder tener la separacion pro palabras

        for (int i = 0; i < diviciones.length; i++) {
            HashMap<Character, Integer> map2 = new HashMap<>();
            String aux = diviciones[i];

            for (int y = 0; y < aux.length(); y++) {
                map2.put(aux.charAt(y), map2.getOrDefault(aux.charAt(y), 0) + 1);
            }
            System.out.println("Aqui se van a imprimir las frecuencias del segundoi hash map ");
            //printMap(map2);
            //ya tengo los dos hash map ahora se realiza la comparacion entre los mismos para saber cual es el que contiene las cosas indicadas

            if (map2.size() == map1.size()) {
                boolean band = true;
                //hacer la comparacionm mismo tamano de mapas
                for (Map.Entry<Character, Integer> mapa : map1.entrySet()) {
                    Character caracter = mapa.getKey();
                    int valor = mapa.getValue();

                    if (map2.get(caracter) != valor) {
                        band = false;
                        break;
                    }
                }
                if (band) {
                    cont++;
                }
            }
        }
        return cont;
    }

    //hacer una mmejuor solucion para el mismo problema de la primera entrevista

    public static int contadorAnagramas2(String texto, String busqueda) {

        //utilizar un array bde chyar para la soluciuon del problema y ver que tan rapido es con respecto a la solucion anterior
        char[] busquedaDiv = busqueda.toCharArray();
        Arrays.sort(busquedaDiv);
        int cont = 0;
        String[] nuevoText = texto.split(" ");

        for (int i = 0; i < nuevoText.length; i++) {

            char[] newWord = nuevoText[i].toCharArray();
            Arrays.sort(newWord);

            if (Arrays.equals(newWord, busquedaDiv)) {
                cont++;
            }
        }
        return cont;
    }

    public static void printMap(HashMap<Character, Integer> map) {

        System.out.println("Funcio de impresion del mapa ");

        for (Map.Entry<Character, Integer> mapa : map.entrySet()) {

            System.out.println("La letra es " + mapa.getKey() + " y su frecuencia es " + mapa.getValue());
        }
        System.out.println("------------------");
    }

    public static String contadorPalabras(String cadena) {
        //eliminar los caracteres especiales de las palabras
        cadena.replace(",", "");
        cadena.replace(".", "");
        cadena.toLowerCase();


        HashMap<String, Integer> mapa = new HashMap<>();

        String[] cadena_div = cadena.split(" ");

        //una vez ya tenemos la cadena dividida lop que tenhemos que hacer es contra las recurrencias
        String palabra = "";
        int contador = 0;


        for (int i = 0; i < cadena_div.length; i++) {
            int defaalutV = mapa.getOrDefault(cadena_div[i], 0);
            defaalutV++;
            mapa.put(cadena_div[i], defaalutV);
            if (defaalutV > contador) {
                contador = defaalutV;
                palabra = cadena_div[i];
            }
        }
        System.out.println("La palabra mas repetida es la sigueinte " + palabra + " Con las sigueintes apariciones " + contador);
        return palabra;
    }

    public static void EliminarRepetidos(ArrayList<String> lista) {

        HashSet<String> hashSet = new HashSet<>();
        ArrayList<String> nuevaLista = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {
            char[] cadenaD = lista.get(i).toCharArray();
            Arrays.sort(cadenaD);
            String nuevo = new String(cadenaD);

            if (!hashSet.contains(nuevo)) {
                nuevaLista.add(lista.get(i));
                hashSet.add(nuevo);
            }
        }

        System.out.println("Aqui ya termino el areglo de la lista ");
        
        // imprimir la lista
        for (int y = 0; y < nuevaLista.size(); y++) {
            System.out.println("L a palabra es " + nuevaLista.get(y));
        }

    }
}

