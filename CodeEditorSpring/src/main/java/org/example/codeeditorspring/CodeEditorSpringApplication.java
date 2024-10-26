package org.example.codeeditorspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetSocketAddress;

@SpringBootApplication
public class CodeEditorSpringApplication {
    public static void main(String[] args) {
        InetSocketAddress address = new InetSocketAddress("localhost", 8080);
        MyWebSocketServer server = new MyWebSocketServer(address);
        server.start();


        System.out.println("Server started on port 8080");

        SpringApplication.run(CodeEditorSpringApplication.class, args);
    }
}
