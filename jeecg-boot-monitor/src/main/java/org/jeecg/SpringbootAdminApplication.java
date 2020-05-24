package org.jeecg;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年05月17日 18:25
 */
@SpringBootApplication
@EnableAdminServer
public class SpringbootAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootAdminApplication.class);
    }
}
