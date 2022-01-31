package MiniProject;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server = new ServerSocket(1234);
            int id = 0;
            DBManager db = new DBManager();
            while (true){
                Socket socket = server.accept();
                id++;
                db.connect();
                System.out.println("Client #" +id+ " " + "connected");
                ClientHandler ch = new ClientHandler(socket, id, db);
                ch.start();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
