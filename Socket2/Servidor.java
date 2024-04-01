package challenge.Socket2;

import challenge.socketP.ClientHandler;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

    private ServerSocket serverSocket;

    public Servidor(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;

    }

    public void start() throws IOException {
        while (!serverSocket.isClosed()) {
            //aqui el servidor estara esperando a que un cliente logre conectarse
            //el accept estara bloqueando hasta la conexion
            System.out.println("Se va a crear el manejo del cliente");
            Socket fuente = serverSocket.accept();

            ClienteManejo clienteManejo = new ClienteManejo(fuente);

            Thread thread = new Thread(clienteManejo);
            thread.start();

        }
    }

    public void CloseConection() {
        try {
            if (serverSocket != null) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }

    public static void main(String[] args) throws IOException {
        ServerSocket fuente = new ServerSocket(1234);
        Servidor h = new Servidor(fuente);
        System.out.println("Se abrio el programa ");
        h.start();
    }

    public static class ClienteManejo implements Runnable {

        private Socket socket;
        private BufferedReader bufferedReader;
        private BufferedWriter bufferedWriter;
        private Operaciones oper;

        public ClienteManejo(Socket socket) throws IOException {
            try {
                this.socket = socket;
                this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                this.oper = new Operaciones();

            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Se esta saliendo por la parte del Manejo del cliente");
            }
        }

        @Override
        public void run() {
            String messageFromClient;
            String aux = "";

            while (socket.isConnected()) {
                try {
                    //aqui mandamos un saludo al cliente ya que la conexion esta establecidda conel cleinte
                    bufferedWriter.write("Hola Ya estas conectado con el servidor");
                    bufferedWriter.newLine();
                    bufferedWriter.flush();

                    //con esto podemos leer la linea que no esta mandando el cleinte
                    //se debe de decirdir que es lo que conteine el sitring para poder hacer la operacion
                    messageFromClient = bufferedReader.readLine();
                    if (messageFromClient.contains("+")) {
                        aux = oper.suma(messageFromClient);
                        EnviarRespuesta(aux);
                    }
                    if (messageFromClient.contains("-")) {
                        aux = oper.resta(messageFromClient);
                        EnviarRespuesta(aux);
                    }
                    if (messageFromClient.contains("*")) {
                        aux = oper.multiplicacion(messageFromClient);
                        EnviarRespuesta(aux);
                    }
                } catch (IOException e) {
                    closeEverything(socket, bufferedReader, bufferedWriter);
                    break;
                }
            }
        }

        public void EnviarRespuesta(String respuesta) {

            try {
                bufferedWriter.write(respuesta);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            } catch (IOException e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
            }

        }

        public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) {

            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static class Operaciones {
        Operaciones() {

        }

        public String suma(String cadena) {
            int a = 0;
            int b = 0;
            String[] hola = cadena.split(" ");
            a = Integer.parseInt(hola[0]);
            b = Integer.parseInt(hola[2]);
            a = a + b;
            return String.valueOf(a);
        }

        public String resta(String cadena) {
            int a = 0;
            int b = 0;
            String[] hola = cadena.split(" ");
            a = Integer.parseInt(hola[0]);
            b = Integer.parseInt(hola[2]);
            a = a - b;
            return String.valueOf(a);
        }

        public String multiplicacion(String cadena) {
            int a = 0;
            int b = 0;
            String[] hola = cadena.split(" ");
            a = Integer.parseInt(hola[0]);
            b = Integer.parseInt(hola[2]);
            a = a * b;
            return String.valueOf(a);
        }

    }

}
