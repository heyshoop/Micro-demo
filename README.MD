##基于SpringCloud的微服务框架Demo
• 服务发现——Netflix Eureka  
• 客服端负载均衡——Netflix Ribbon  
• 断路器——Netflix Hystrix  
• 服务网关——Netflix Zuul  
• 分布式配置——Spring Cloud Config


##各模块作用
•springcloud-eureka-server注册中心服务eureka-server   
•springcloud-config-server远程配置中心config-server   
•springcloud-provider-server服务提供者，demo内置两个接口   
•springcloud-consumer-ribbon-config-swagger基于ribbon的消费者   
•springcloud-consumer-feign-config-swagger基于feign的消费者 
•springcloud-zuul路由注册与负载均衡   
•springcloud-hystrix-tribine-dashboard集群监控   
•springcloud-zipkin-server 链路追踪服务    