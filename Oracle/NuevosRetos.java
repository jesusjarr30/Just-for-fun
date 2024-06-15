package challenge.Oracle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NuevosRetos {

    public static void main(String[] args) {
        System.out.println("Aqui va el menu de los problemas que tengo  que resolver ");
        int opc = 0;
        Scanner sc = new Scanner(System.in);

        //hacer el ciclo necesario parta repetie el menu que se quiera
        do {
            System.out.println("1. Hacer el reto de miguel");
            System.out.println("2. Hacer el reto del primer manager0");
            System.out.println("3. Realizar el ultimo code challenges que se me presento");
            System.out.println("4. Salir de la aplicacion");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:
                    Miguel();
                    break;
                case 2:
                    Managewr();
                    break;
                case 3:
                    Binario();
                    break;
            }
        } while (opc != 4);


    }

    public static void Miguel() {
        /*
         * Las indicaciones es tenemos una ArrayList y tenemos que elminar los anamagraas repetidos y regresar una lista con los anagramas
         * */
        ArrayList<String> lista = new ArrayList();
        lista.add("roma");
        lista.add("amor");
        lista.add("mora");
        lista.add("abc");
        lista.add("bca");
        lista.add("cab");
        lista.add("foca");
        //hasta aqui se deja las decclaraciones de pruebas empiza el codigo

        ArrayList<String> nuevalista = new ArrayList<>();
        HashSet<String> tabla = new HashSet<>();

        for (String elemento : lista) {
            char[] elementos = elemento.toCharArray();
            Arrays.sort(elementos);

            if (!tabla.contains(new String(elementos))) {
                nuevalista.add(elemento);
                tabla.add(new String(elementos));
            }
        }
        //con esto se termina el filtro que se desea y solo es custion de imprimir la lista faltante

        System.out.println(" Resultados del reto de miguel");
        for (String palabra : nuevalista) {
            System.out.println("Palabra " + palabra);
        }
    }

    public static void Managewr() {
        //Aqui se debe de de contra todas las coincidencias del anagrama que se dio en todo el texto
        String text = " abdc abnghjdc jhgfadsf adshgjkjterw gfdjhgs fsdafasdf fdsfasf dsafdsf sdafdsafds gfdshgj";
        String word = "ghj";
        //terminado la declaracion que se necesitaba ahora es necesario poder pasar a el area de programacion

        //necesitamos tener un array de chars de el la primera palabra
        char[] metodBusqueda = word.toCharArray();
        Arrays.sort(metodBusqueda);
        int cont = 0;

        for (int i = 0; i < text.length() - word.length() + 1; i++) {
            //hacemos el ciclo para poder recorrer todo el texto
            if (word.contains(String.valueOf(text.charAt(i)))) {
                //obtener sun subString de la misma cadena
                String aux = text.substring(i, i + word.length());
                //creo que con esto ya tenemos nuestro subString bueno
                System.out.println("Las palabras a evaluar son las sigueintes " + aux);
                char[] arrayAux = aux.toCharArray();
                Arrays.sort(arrayAux);
                if (Arrays.equals(arrayAux, metodBusqueda)) {
                    cont++;
                }

            }
        }
        System.out.println("Apariciones del texto son las sigueintes " + cont);

    }

    public static void Binario() {
        /*
         * Aqui lo que se tiene que hacer es reghresar todas las posibles convinacviones posibles de texto binario
         * */
        String binario = "00110";
        /*
         * Las reglas que debo de seguir son las siguientes
         * que los numeros este distribuidos de manera pareja en cada lado ya sea ceros o sea unos
         * que tenga la misma cantidad de caracteres cada uno
         * regresar la lista de las subcadenas validas de las enteriores instrucciones
         *
         * */
        ArrayList<String> cumplieron = new ArrayList<>();

        for (int i = 0; i < binario.length(); i++) {
            //tenemos que hacer todas las posibles convinaciones existentes de la subcadena y poder imprimirlas

            for (int x = i + 2; x <= binario.length(); x++) {
                //se hace3 mas dos ya que el sub String por si solo no es inclusivo del todo
                String subString = binario.substring(i, x);
                //System.out.println("convinacion: " + subString + " Los inidices x " + x);
                int cont0 = 0;
                int cont1 = 0;
                //una vez cxon el strig separado procederemos a evfaluar la cantidad de unois y certos en cada String
                for (int r = 0; r < subString.length(); r++) {
                    //aqui van las cosas que se debe de hacer
                    if (subString.charAt(r) == '0') {
                        cont0++;
                    } else {
                        cont1++;
                    }
                }
                //apegado a la idea principal que se tiene de los sigueinte
                String cad1 = subString.substring(0, subString.length() / 2);
                String cad2 = subString.substring((subString.length() / 2), subString.length());
                int contA = 0;
                int contB = 0;
                //priomero corroborar las dos mitades que este de manera correcta
                //System.out.println("La cadena es la sigueinte " + cad1 + " Aqui va la siguiente " + cad2);
                if (cad1.contains("1"))
                    contA++;
                if (cad1.contains("0"))
                    contA++;

                if (cad2.contains("1"))
                    contB++;
                if (cad2.contains("0"))
                    contB++;
                if (contA == 1 && contB == 1 && cont0 == cont1) {
                    //quiere decir que es una cadena valida para poder trabajar
                    cumplieron.add(subString);
                }
            }
        }
        //aqui se temina slos dos ciclos que se necesita
        //ahora se debe de hacer que las cosas se tenga
        for (int i = 0; i < cumplieron.size(); i++) {
            System.out.println("Las palabras que cumplieron con lo anterior son las siguientes " + cumplieron.get(i));

        }

    }
}
