#结构
##eureka 服务注册中心,集群，修改文件
127.0.0.1 server1
127.0.0.1 server2
##servicea，servicea2 都是servicea的服务
##serviceb feign调用servicea，负载均衡，断熔
##servicec robbon调用servicea，负载均衡