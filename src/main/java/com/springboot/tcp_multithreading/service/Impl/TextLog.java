package com.springboot.tcp_multithreading.service.Impl;

import com.springboot.tcp_multithreading.utils.log4j.DynamicBuildFolder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class TextLog {
    public static void main(String[] args) {
        /*Log4jServiceImpl log4jService = new Log4jServiceImpl();
        log4jService.analysis2();*/
        DynamicBuildFolder dynamicBuildFolder = new DynamicBuildFolder();
        DynamicBuildFolder.storage();
        Log log = LogFactory.getLog(TextLog.class);
        for(int i=0;i<=500;i++){
            System.out.println("循环"+"--"+i);
            try{
                System.out.println(1%0);
            }catch(Exception e){
                log.info("测试日志"+"--"+"异常信息"+i+"："+e);
            }
        }
    }
}