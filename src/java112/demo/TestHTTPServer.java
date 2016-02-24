package java112.demo;

import java.io.*;
import java.net.*;

/**
 *  Description of the Class
 *
 *@author    pawaite
 */
public class TestHTTPServer {
    /**
     *  The main program for the TestHTTPServer class
     *
     *@param  args             The command line arguments
     *@exception  IOException  Description of the Exception
     */
    public static void main(String[] args)
            throws IOException {

        ServerSocket    serverSocket  = null;
        try {
            serverSocket = new ServerSocket(4444);
        }
        catch (IOException e) {
            System.err.println("Could not listen on port: 4444.");
        }

        Socket          clientSocket  = null;
        try {
            clientSocket = serverSocket.accept();
        }
        catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }

        PrintWriter     out           = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader  in            = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String          inputLine;
        String          outputLine;

        while (in.ready()) {
            inputLine = in.readLine();
            System.out.println(inputLine);

        }

        out.println("HTTP/1.0 200 OK");
        out.println("Date: Wed, 17 Feb 2016 15:40:45 GMT");
        out.println("Connection: close");
        out.println("Content-Type: text/html");
        out.println();
        out.println("<html><head></head><body><h1>Yo!</h1></body></html>");
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }
}