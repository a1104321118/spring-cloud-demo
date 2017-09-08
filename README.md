#spring-cloud-demo

```
spring-cloud-demo

1.spring-cloud-discovery-eureka   eureka注册中心
2.spring-cloud-provider-user      用户微服务
3.spring-cloud-consumer           消费方微服务
4.spring-cloud-zipkin-server      集成zipkin，监控【2】【3】两个微服务调用链路（要求jdk8）
5.spring-cloud-config-server      分布式配置中心
6.spring-cloud-config-client      从配置中心拉取配置的客户端
7.spring-cloud-server-encrypt     加密的分布式配置中心（有待了解）
8.spring-cloud-feign              feign分布式调用组件
9.spring-cloud-hystrix            hystrix断路器（一段时间内调用其它微服务总是失败，断路器打开，直接进入fallback）
10.spring-cloud-hystrix-dashboard hystrix仪表盘（启动后输入路径 http://localhost:7780/hystrix.stream）
11.spring-cloud-hystrix-turbine   turbine(http://192.168.3.57:7781/turbine.stream?cluster=FEIGN-HYSTRIX)
12.spring-cloud-sidecar           sidecar 调用别的语言的服务（参考node-service服务）
13.spring-cloud-zuul              zuul网关服务




```