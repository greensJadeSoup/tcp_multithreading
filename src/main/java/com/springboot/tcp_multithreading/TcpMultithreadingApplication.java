package com.springboot.tcp_multithreading;

import com.springboot.tcp_multithreading.servers.TcpServer;
import com.springboot.tcp_multithreading.utils.log4j.DynamicBuildFolder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import java.io.IOException;

@SpringBootApplication
public class TcpMultithreadingApplication extends SpringBootServletInitializer {
    public static  void main(String[] args) throws IOException {
        SpringApplication.run(TcpMultithreadingApplication.class, args);

        DynamicBuildFolder dynamicBuildFolder = new DynamicBuildFolder();
        DynamicBuildFolder.storage();

        TcpServer tcpService = new TcpServer();
        tcpService.getServerDemo();//调用开启服务器
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }
}
