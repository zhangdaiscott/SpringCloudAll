package org.jeecg.cloud.control;

import org.jeecg.cloud.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/cust")
public class NacosController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private EchoService ecService;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/echo/restTemplate")
    public String echoAppName() {
        //Access through the combination of LoadBalanceClient and RestTemplate
        ServiceInstance serviceInstance = loadBalancerClient.choose("nacos-provider");
        String path = String.format("http://%s:%s/echo/%s", serviceInstance.getHost(), serviceInstance.getPort(), appName);
        System.out.println("request path:" + path);
        return restTemplate.getForObject(path, String.class);
    }

    @GetMapping("/echo/feign")
    public String echoAppName2() {
        return ecService.echo("appName2");
    }


}