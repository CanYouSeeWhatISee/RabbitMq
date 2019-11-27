package com.mmr.rabbitmq.util;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class ConnectionUtils {

    /**
     * 获取Mq的连接
     */
    public static Connection getConnection() throws IOException, TimeoutException {
        //定义一个连接工厂
        ConnectionFactory factory = new ConnectionFactory();

        //设置服务地址
        factory.setHost("127.0.0.1");

        //AMQP
        factory.setPort(5672);

        //vhost
        factory.setVirtualHost("/vhost_mnr");

        //用户名
        factory.setUsername("admin");

        //密码
        factory.setPassword("1234");

        factory.newConnection();

        return factory.newConnection();
    }
}
