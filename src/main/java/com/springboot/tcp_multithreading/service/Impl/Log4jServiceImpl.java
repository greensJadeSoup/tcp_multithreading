package com.springboot.tcp_multithreading.service.Impl;
//tcp Socket数据处理
import com.springboot.tcp_multithreading.service.Log4jService;
import org.springframework.stereotype.Service;

import com.springboot.tcp_multithreading.utils.log4j.DynamicBuildFolder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.net.Socket;

@Service
public class Log4jServiceImpl implements Log4jService {
    public void analysis(Socket socket,String data){

        DynamicBuildFolder dynamicBuildFolder = new DynamicBuildFolder();
        DynamicBuildFolder.storage();
        Log log = LogFactory.getLog(Log4jService.class);

        String information = String.valueOf(socket);
        String informationIP = information.substring(information.indexOf("/")+1,information.indexOf(",p"));
        System.out.println("ip:"+informationIP+",data:"+data);

        /*log.info("ip:"+informationIP+",data:"+data);*/
    }
}
