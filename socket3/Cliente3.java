package challenge.socket3;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Cliente3 {

    private Socket socket;
    private BufferedReader bufferedReader;
    private BufferedWriter bufferedWriter;
    private String userName;

    public Cliente3(Socket socket, String userName) throws IOException {

        try {
            this.socket = socket;
            this.userName = userName;
            this.bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Se empieza el cliente");
        Socket s = new Socket("localhost", 1234);
        Cliente3 cliente = new Cliente3(s, "Jesus");
        cliente.sendMessage();
        cliente.getMessage();
    }

    public void sendMessage() throws IOException {
        try {
            bufferedWriter.write(userName);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            Scanner sc = new Scanner(System.in);
            while (socket.isConnected()) {
                String messageToSend = sc.nextLine();
                bufferedWriter.write(messageToSend);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                //Esto se va a ejecutar Simpre y cuando exista un servidor para que puedan enviar la señal
            }
        } catch (IOException e) {
            closeEverything(socket, bufferedReader, bufferedWriter);
        }
    }

    public void getMessage() {
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        String message;
                        while (socket.isConnected()) {
                            try {
                                message = bufferedReader.readLine();
                                System.out.println(message);

                            } catch (IOException e) {
                                try {
                                    closeEverything(socket, bufferedReader, bufferedWriter);
                                } catch (IOException ex) {
                                    throw new RuntimeException(ex);
                                }
                            }

                        }
                    }
                }
        ).start();
    }

    public void closeEverything(Socket socket, BufferedReader bufferedReader, BufferedWriter bufferedWriter) throws IOException {
        if (socket != null) {
            socket.close();
        }
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        if (bufferedReader != null) {
            bufferedReader.close();
        }
    }
}