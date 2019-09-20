package com.springboot.tcp_multithreading.service;


public interface TerminalService {
    //解析数据
    void analysis(String data);
    //返回状态
    String returnState();
}
