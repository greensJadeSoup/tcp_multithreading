package com.springboot.tcp_multithreading.service.Impl;
//输入三位值，处理后返回要存在日志的字符串

import com.springboot.tcp_multithreading.servers.TcpServer;
import com.springboot.tcp_multithreading.service.Log4jService;
import org.springframework.stereotype.Service;

import com.springboot.tcp_multithreading.utils.log4j.DynamicBuildFolder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.Socket;

@Service
public class Log4jServiceImpl implements Log4jService {
    public String analysis(Socket socket,String data){

        DynamicBuildFolder dynamicBuildFolder = new DynamicBuildFolder();
        DynamicBuildFolder.storage();

        String information = String.valueOf(socket);
        String informationIP = information.substring(information.indexOf("/")+1,information.indexOf(",p"));

        /*log.info("ip:"+informationIP+",data:"+data);*/
        return "ip:"+informationIP+",data:"+data;
    }

    public void analysis2(){

        DynamicBuildFolder dynamicBuildFolder = new DynamicBuildFolder();
        DynamicBuildFolder.storage();
        Log log = LogFactory.getLog(TcpServer.class);

        for(int i=0;i<=500;i++){
            System.out.println("循环"+"--"+i);
            try{
                System.out.println(1%0);
            }catch(Exception e){
                log.info("测试日志"+"--"+"异常信息"+i+"："+e);
            }
        }
        /*log.info("ip:"+informationIP+",data:"+data);*/
    }
}
