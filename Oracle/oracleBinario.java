package challenge.Oracle;

import java.util.ArrayList;

public class oracleBinario {

    public static void main(String[] args) {
        String cadena = "00110";
        /*
        Realizar el trabvajo de las cosas

        Las reglas que se debe de seguir para el fin del siguiente proyectro es que

        se tenga la misma cantidad de unos uy de ceros y que este a cada l;ado de el suString que se va a hacer vasliudo en las
         */
        validacioCadenas(cadena);


    }

    public static ArrayList<String> validacioCadenas(String cadena) {
        int largo = cadena.length();
        ArrayList<String> listaCombinaciones = new ArrayList<>();


        for (int i = 0; i < largo; i++) {

            for (int x = i + 2; x < largo; x++) {
                //hacer las pruebas de las combinaciones que esta nos esta dando
                String nuevoS = cadena.substring(i, x);
                printF(nuevoS);

                int cont0 = 0;
                int cont1 = 0;

                //hacer las validaciones del nuevo String
                for (int t = 0; t < nuevoS.length(); t++) {

                    //revisar si es valido la cadena con los parametros anterirmente mencionados en la vizualizacion del proyecto
                    if (nuevoS.charAt(i) == '0') {
                        cont0++;
                    }

                    if (nuevoS.charAt(i) == '1') {
                        cont1++;
                    }

                    
                }
            }
        }

        return null;
    }


    public static void printF(String a) {
        System.out.println("Lo que se esta impri9miendo es " + a);
    }


}
