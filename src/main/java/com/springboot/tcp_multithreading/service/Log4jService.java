package com.springboot.tcp_multithreading.service;

import java.net.Socket;

public interface Log4jService {
    void analysis(Socket socket,String data);
}
