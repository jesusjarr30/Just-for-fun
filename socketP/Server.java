package challenge.socketP;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketImpl;

public class Server {

    //parece que esto sera para nuesta conexion
    private ServerSocket ServerSocket;


    public Server(ServerSocket ServerSocket) {
        this.ServerSocket = ServerSocket;
    }

    public void startServer() {
        try {
            while (!ServerSocket.isClosed()) {
                //el accept es un metodo en el que el socke queda esperando a que un cliente se conecte
                Socket socket = ServerSocket.accept();
                System.out.println("New client has connected");
                ClientHandler cliendHandler = new ClientHandler(socket);
                Thread thread = new Thread(cliendHandler);
                thread.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeServerSocket() {

        try {
            if (ServerSocket != null) {
                ServerSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Server server = new Server(serverSocket);
        server.startServer();
    }
}
