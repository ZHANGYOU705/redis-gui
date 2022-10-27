package cn.zhangyou705.redis.gui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author ZhangYou
 * @description
 * @date 2022/10/27
 */
@SpringBootApplication
public class RedisServerApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(RedisServerApplication.class, args);
        ConfigurableEnvironment environment = ctx.getEnvironment();
        String port = environment.getProperty("server.port");

        String url = String.format("启动成功：http://localhost:%s/dist/index.html", port);
        System.out.println(url);

    }
}
