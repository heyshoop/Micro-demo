这些微服务都是隐藏在后端的，用户是看不到，或者不是直接接触，可以用nginx或者zuul进行路由转发和负载均衡，zuul负载均衡默认用的是ribbon。

验证地址：  
正常服务地址为http://localhost:8400/springcloud-consumer-server/user/list  
但是有些人就会说，这样以后用户请求会不会太长，比较反感，所以可以通过配置进行修改访问地址。

zuul:  
  routes:  
    springcloud-consumer-server: /consumer/**  
    springcloud-provider-server: /provider/**  
在application.yml中加入这样一段配置，其实就是nginx中的反向代理，使用一下简短的可以代理这个微服务。  
这个时候我们就可以这样去访问了http://localhost:8400/consumer/user/list，是不是简短了很多