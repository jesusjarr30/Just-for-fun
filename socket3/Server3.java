package challenge.socket3;

import challenge.socketP.ClientHandler;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server3 {
    private ServerSocket server;

    public Server3(ServerSocket server) {
        this.server = server;

    }

    public static void main(String[] args) throws IOException {

        System.out.println("Inicio del Servidor");
        ServerSocket sc = new ServerSocket(1234);
        Server3 server = new Server3(sc);
        server.start();

    }

    public void start() {
        //En Estemetodo se debe de poder correr el server de manera completa
        try {
            while (!server.isClosed()) {
                Socket a = server.accept();//acceptamos las coneciones del cliente
                System.out.println("Aqui empieza la conexion de un nuevo cliente");

                cliente3Handler cliendHandler = new cliente3Handler(a);//aqui es enviar el socket que es necesario
                Thread thread = new Thread(cliendHandler);
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public class cliente3Handler implements Runnable {
        private Socket socket;
        private BufferedReader bufferedReader;
        private BufferedWriter bufferedWriter;
        private int port = 1234;
        private String clienUserName;
        private ArrayList<cliente3Handler> lista;

        public cliente3Handler(Socket socket) throws IOException {
            try {
                this.socket = socket;
                this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                this.clienUserName = bufferedReader.readLine();
                EnviarRespuesta("Servert " + clienUserName + " Has enter the chat!");

            } catch (IOException e) {
                closeEverything(socket, bufferedReader, bufferedWriter);
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
                    EnviarRespuesta("Si se recivio tu mensajes xd");
                } catch (IOException e) {
                    closeEverything(socket, bufferedReader, bufferedWriter);
                    break;
                }
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

}
