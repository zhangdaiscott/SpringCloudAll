# SpringCloudAll
Spring Cloud Alibaba 解决方案 —— 学习示例代码

### 技术体系【知识点】


- 1、Nacos 服务注册和发现
- 2、Nacos 统一配置中心
- 3、服务多实例
- 4、服务监控 sentinel
- 5、feign配合sentinel使用
- 6、SpringCloud Gateway
- 7、服务监控 
- 8、链路跟踪 skywalking
- 9、Spring Boot Admin服务监控
- 10、Spring Security集成
- 11、Spring Security oath2.0集成
- 12、rabitmq的环境搭建和使用
- 13、maven多配置环境

### 常用注解

 注解 | 功能 | 位置 
 -|-|- 
@EnableDiscoveryClient   | 启动nacos注册发现| 启动类 |
@EnableFeignClients   | 启动 Feign| 启动类 |
@FeignClient  | 声明为Feign接口 | 接口类 |
@SentinelRestTemplate|  |


### 环境安装
 软件 | 访问地址 | 其他 
 -|-|- 
[nacos安装](https://nacos.io/zh-cn/docs/quick-start-docker.html)  | http://localhost:8848/nacos| 启动类 |
[sentinel控制台](https://www.cnblogs.com/fx-blog/p/11720220.html)   | http://localhost:8080/#/dashboard |




### 技巧与工具
- [在线工具yml和属性互转](https://www.toyaml.com/index.html)
-  yml文件注意（禁用tab，用俩空格）
- 谷歌JSON插件 JSON-Handle
- gateway 支持服务名方式访问
- sentinel 服务台可以不用
- IDEA如何启动多实例
- idea run dashboard

### 官方文档
- [spring-cloud-alibaba](https://github.com/alibaba/spring-cloud-alibaba/blob/master/README-zh.md)
- [spring-cloud-alibaba > html](https://spring-cloud-alibaba-group.github.io/github-pages/greenwich/spring-cloud-alibaba.html#_introduction_of_sentinel)
- [spring-cloud-gateway](https://cloud.spring.io/spring-cloud-static/spring-cloud-gateway/2.2.2.RELEASE/reference/html/#the-path-route-predicate-factory)
- [spring-security](https://docs.spring.io/spring-security/site/docs/current/reference/html5/#getting)
- [spring-security-oauth](https://projects.spring.io/spring-security-oauth/docs/oauth2.html)


### 参考文献
- [微服务后，Swagger接口统一文档](https://blog.csdn.net/qq_31748587/article/details/102563155)
- 谷歌JSON插件 JSON-Handle
- [Spring Boot Admin服务监控](https://www.jianshu.com/p/1749f04105fb)