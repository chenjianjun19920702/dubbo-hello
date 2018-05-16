package org.dubbo.hello.provider;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class DemoProvider {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:META-INF/spring/*.xml");
        context.start();
        System.out.println("服务已经启动...");
        try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
        context.close();
    }
}
