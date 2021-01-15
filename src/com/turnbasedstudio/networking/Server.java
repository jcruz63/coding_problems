package com.turnbasedstudio.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server{

    private Socket socket;

    public Server(){
        try ( ServerSocket serverSocket=new ServerSocket(5000)){
            socket= serverSocket.accept();
            System.out.println("Connection created");
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            PrintWriter output = new PrintWriter(socket.getOutputStream(),true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
