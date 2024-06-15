package challenge.Oracle;

public class ListaDoble {

    public static void main(String[] args) {
        System.out.println("Hacer el menu de la lista doblemente ligada para practicar el ejercicio en caso de ser necesario ");


    }

    public static class lista2 {
        private Nodo2 referencia;

        public lista2() {
        }

    }


    public static class Nodo2 {

        private Nodo2 before;
        private Nodo2 next;
        private int number;

        public Nodo2(Nodo2 before, Nodo2 next, int number) {

            this.before = before;
            this.next = next;
            this.number = number;
        }

        public Nodo2 getBefore() {
            return before;
        }

        public Nodo2 getNext() {
            return next;
        }

        public int getNumber() {

            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public void setBefore(Nodo2 before) {
            this.before = before;
        }

        public void setNext(Nodo2 next) {
            this.next = next;
        }

    }
}
