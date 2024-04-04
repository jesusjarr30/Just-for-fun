package challenge.SocketT;

import jdk.dynalink.beans.StaticClass;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Serv {
    private ServerSocket serverSocket;
    private ArrayList<Estudiante> lista;

    public Serv(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
        this.lista = new ArrayList<>();
    }

    public void start() throws IOException {
        //mientras el server socket este activo procedemos a hacer lo que tenemos que realizar

        while (!serverSocket.isClosed()) {
            System.out.println("Servidor a la espera de clientes");
            serverSocket.accept();

        }
    }

    public void close() throws IOException {
        if (serverSocket != null) {
            serverSocket.close();
        }

    }

    public static void main(String[] args) throws IOException {
        System.out.println("Aqui empiza la clase servidor");
        ServerSocket fuente = new ServerSocket(1234);
        Serv servidor = new Serv(fuente);
        //ya aqui tenemos el servidor creado y se va a correr en el sigueinte renglones
        servidor.start();
    }

    public static class ServAux {

        private Socket socket;
        private BufferedWriter bufferedWriter;
        private BufferedReader bufferedReader;
        private ArrayList<Estudiante> lista;

        public ServAux(Socket socket, ArrayList<Estudiante> lista) throws IOException {
            try {
                this.socket = socket;
                this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                this.lista = lista;
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Se esta saliendo por la parte del Manejo del cliente");
            }
        }

        public void start() {

        }

        public void closeEverything() throws IOException {
            if (socket != null) {
                socket.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedReader != null) {
                bufferedWriter.close();
            }
        }

    }
}
