package challenge.Arreglos;

import java.util.*;

public class main {
    public static void main(String[] args){
        int opc=0;

        Scanner sc = new Scanner(System.in);
        int[] ar = {1,2,3,3,3,5,6,7,8,9,10};
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(3,3,3,6,4));
        do{
            System.out.println("1. Encontrar el maximo y el minimo");
            System.out.println("2. Suma de elementods");
            System.out.println("3. Promedio");
            System.out.println("4. Eliminar duplicados");
            System.out.println("5. Encuntra la primera letra repetida de la palabra");
            System.out.println("Ingrese una opcion");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    maximoMinimo(a,ar);
                    break;
                case 2:
                    suma(a,ar);
                    break;
                case 3:
                    promedio(a,ar);
                    break;
                case 4:
                    eliminarDuplicados(a,ar);
                    break;
                case 5:
                    PrimerRepetido();
                    break;
                case 6:
                    encontrarSuma();
                    break;
            }

        }while(opc!=10);
    }

    private static void encontrarSuma() {
        int[] arreglo = {1,4,8,6,5,7,5,2,4,8,5,2,74,5};
        int tarject=10;
        int a=0;
        int b=tarject;
        Arrays.sort(arreglo);
        int indice=0;
        int indice2=0;
        for(int i= 0;i<tarject;i++){
            indice= Arrays.bi
        }
    }

    private static void PrimerRepetido() {
        String palabra="sfjdfhOHJIOJK";
        HashSet<Character> ch= new HashSet<>();
        palabra=palabra.toUpperCase();
        System.out.println("La palabra ya maximisada es la siguiente "+palabra);
        for (int i=0;i<palabra.length();i++){
            if(!ch.add(palabra.charAt(i))){
                System.out.println("La primera letra repetida es la siguiente "+palabra.charAt(i));
                i=palabra.length();
            }
        }
        ch.clear();
    }

    public static void maximoMinimo(ArrayList<Integer> lista, int[] arreglo){
        System.out.println("Encontrar el macimo y el minimo");
        int min=lista.get(0);
        int max=lista.get(0);

        for(int i=1;i<lista.size();i++){
            if(min>lista.get(i)){
                //entonces va a ser el nuevo minimo
                min = lista.get(i);
            }else{
                if(max<lista.get(i)){
                    max=lista.get(i);
                }
            }
        }
        System.out.println("El reslutado de la lista es el siguiente");
        System.out.println("El minimoe es "+min);
        System.out.println("El maximo de la lista es "+max);
        //ahora se debe de ejecutar lo mismo pero para el arreglo
        min=0;
        max=0;
        //Empezar la parte del array para la busqueda
        min=arreglo[0];
        max=arreglo[0];

        for(int i=1;i<arreglo.length;i++){
            if(min>arreglo[i]){
                min=arreglo[i];
            }else{
                if(max<arreglo[i]){
                    max=arreglo[i];
                }
            }
        }
        System.out.println("Maximo 2 "+max);
        System.out.println("Minimo 2 "+min);
        System.out.println("Se termino la operacion");
    }
    public static void suma(ArrayList<Integer> lista, int[] arreglo){
        System.out.println("Encontrar el macimo y el minimo");
    }
    public static void promedio(ArrayList<Integer> lista, int[] arreglo){
        System.out.println("La operacion de promedio");
        int aux=0;
        for(Integer elemento: lista){
            aux+=elemento;
        }
        aux=aux/lista.size();
        System.out.println("Promedio por arrayList "+aux);

        aux=0;
        for(Integer elemento: arreglo){
            aux+=elemento+aux;
        }
        aux=aux/arreglo.length;
        System.out.println("Promedio por arreglo "+aux);
    }
    public static void eliminarDuplicados(ArrayList<Integer> lista, int[] arreglo){

        System.out.println("Eliminar de un arreglo los duplicados");

        int cont= lista.size();
        for (int i=0;i<cont;i++){
            if(lista.subList(i+1,cont).contains(lista.get(i))){
                lista.remove(lista.get(i));
                cont--;
                i--;
            }
        }
        System.out.println("El resultado de la lista es elsiguiente");

        for(Integer element : lista){
            System.out.println(element);
        }
        System.out.println("Los elemontos de la lista despues de la ejecucion son los siguiente");

        //usign a hasMap
        System.out.println("El HasSet es el siguiente");
        ArrayList<Integer> cp = new ArrayList<Integer>();
        HashSet<Integer> rel = new HashSet<>();

        for (Integer elemento : arreglo ){
            if(rel.add(elemento)){
                cp.add(elemento);
            }
        }
        for( Integer individual: cp){
            System.out.println(individual);
        }
    }

}
