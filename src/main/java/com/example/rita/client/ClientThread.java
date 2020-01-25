package com.example.rita.client;

import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

class ClientThread implements Runnable {
    Socket socket;
    private static final int SERVERPORT = 4444;
    private static final String SERVER_IP = "192.168.0.106";//10.191.99.72, 5.15.42.72
    private  String info;
   private Helper helper = new Helper();

    ClientThread(String info)
    {
    this.info = info;
    }

    private void startSocket() {
        try {
            Log.e("st", "starting connection");
            InetAddress serverAddr = InetAddress.getByName(SERVER_IP);
            socket = new Socket(serverAddr, SERVERPORT);
            Log.d("sk","Socket ready : " +  socket.isConnected());
            BufferedReader bfr = helper.getReader(socket);
           PrintWriter pr = helper.getWriter(socket);
            pr.println(info);
            Log.e("Msg", "Message send");
            final String result = bfr.readLine();
            Log.e("rcv","Message received");


         /*atch (IOException ex) {
            Log.e(Constants.TAG, ex.getMessage());
            if (Constants.DEBUG)
            {
                ex.printStackTrace();
            }
        }*/
    } catch (IOException ex) {
        Log.e("exception",ex.toString());
    }

        catch (Exception ex) {
            Log.e("exception",ex.toString());

        }
    }

    @Override

    public void run() {

        startSocket();

        //  Log.d("socket",String.valueOf(socket.isConnected()));
        temp.socket = socket;

    }


}