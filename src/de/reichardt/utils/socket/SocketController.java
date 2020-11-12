package de.reichardt.utils.socket;

import java.io.*;
import java.net.Socket;

public class SocketController {
    private final Socket socket;
    private final PrintWriter printWriter;
    private final BufferedReader bufferedReader;
    private final char[] buffer;

    public SocketController(String server, int port) throws IOException {
        this.socket = new Socket(server, port);
        this.printWriter = new PrintWriter(
                new OutputStreamWriter(socket.getOutputStream()
                ));
        this.bufferedReader = new BufferedReader(new InputStreamReader(
                socket.getInputStream()
        ));
        this.buffer = new char[1024];
    }

    public void sendMessage(String message) {
        this.printWriter.print(message + "\r\n");
        this.printWriter.flush();
    }

    public String getMessage() throws IOException {
        int c = this.bufferedReader.read(buffer, 0, 1024);
        return new String(buffer, 0, c);
    }

    public void terminate() throws IOException {
        this.socket.close();
    }
}
