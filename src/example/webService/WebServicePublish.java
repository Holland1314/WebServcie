package example.webService;

import javax.xml.ws.Endpoint;

/**
 * Created by shileichao on 2018/4/3.
 */
public class WebServicePublish {
    public static void main(String[] args) {
        String address = "http://localhost:8989/WS_Server/WebService";
        Endpoint.publish(address,new WebServiceImpl());
        System.out.println("发布WebService成功了！");
    }
}
