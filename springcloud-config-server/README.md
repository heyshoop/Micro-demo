springcloud-config-server是用来将远程git仓库的配置文件动态拉下来，这样配置文件就可以动态的维护了。当然也可以选择本地仓库。

验证成功地址：
http://localhost:8888/springcloud-provider-server/test/master  可以看到服务者配置文件
http://localhost:8888/springcloud-zuul/test/master  可以看到zuul配置文件