# SpringCloudAll
Spring Cloud Alibaba 解决方案 —— 学习示例代码

### 技术体系


- 1、Nacos 服务注册和发现
- 2、Nacos 统一配置中心
- 3、服务多实例
- 4、服务监控 sentinel
- 5、feign配合sentinel使用
- 6、SpringCloud gateway
- 7、服务监控 
- 8、链路跟踪 skywalking
- 9、Spring Boot Admin服务监控
     https://www.jianshu.com/p/1749f04105fb
- 10、spring security集成
- 11、spring security oath2.0集成
- 12、rabitmq的环境搭建和使用


### 常用注解

 注解 | 功能 | 位置 
 -|-|- 
@EnableDiscoveryClient   | 启动nacos注册发现| 启动类 |
@EnableFeignClients   | 启动 Feign| 启动类 |
@SentinelRestTemplate|  |
@FeignClient  | 声明为Feign接口 | 接口类 |


### 技巧与工具
- [在线工具yml和属性互转](https://www.toyaml.com/index.html)
- 谷歌JSON插件 JSON-Handle
- @SentinelRestTemplate
- gateway方式支持服务名方式访问
- sentinel服务台可以不用



### 参考文献
- [微服务后，Swagger接口统一文档](https://blog.csdn.net/qq_31748587/article/details/102563155)
- 谷歌JSON插件 JSON-Handle
- @SentinelRestTemplate
- gateway方式支持服务名方式访问
- sentinel服务台可以不用