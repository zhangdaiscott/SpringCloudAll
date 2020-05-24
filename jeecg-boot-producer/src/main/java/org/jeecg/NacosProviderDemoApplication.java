package org.jeecg;
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderDemoApplication {

    /**
    * 启动端口
    */
    private static String host;

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(NacosProviderDemoApplication.class, args);
//        while(true) {
            String userName = applicationContext.getEnvironment().getProperty("user.name");
            String userAge = applicationContext.getEnvironment().getProperty("user.age");
            host = applicationContext.getEnvironment().getProperty("server.port");
            System.err.println("user name :" +userName+"; age: "+userAge+"; host: "+host);
//        }
    }

    @RestController
    public class EchoController {
        @GetMapping(value = "/echo/{string}")
        @SentinelResource("echo")
        public String echo(@PathVariable String string) {
            return "Hello Nacos Discovery " + string+" ,host:"+host;
        }
    }
}