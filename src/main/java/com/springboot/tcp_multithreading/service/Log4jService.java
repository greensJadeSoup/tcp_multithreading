package com.springboot.tcp_multithreading.service;

import java.net.Socket;

public interface Log4jService {
    String analysis(Socket socket,String data);
    void analysis2();
}
