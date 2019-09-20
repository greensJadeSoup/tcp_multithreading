package com.springboot.tcp_multithreading.service.Impl;

import com.springboot.tcp_multithreading.service.TerminalService;
import org.springframework.stereotype.Service;

@Service
public class TerminalServiceimpl implements TerminalService {
    @Override
    public void analysis(String data){
        System.out.println(data);

    }
    @Override
    public String returnState(){
        return "ok";
    }
}
