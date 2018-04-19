消费者要访问服务提供者的服务，这里用的是通过RestTemplate请求resetful接口，使用feign做客户端负载均衡，hystrix做错误处理，swagger生成接口文档。feign和ribbon二选一，也可以都用。


验证地址：  
 http://localhost:8201/user/list  可以直接访问服务者提供的服务