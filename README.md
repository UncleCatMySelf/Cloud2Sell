## Cloud2Sell

基于SpringCloud微服务演化的点餐Demo系统

### doc

相关文档说明，数据库配置

### eureka模块

Eureka服务启动（向Eureka2注册），可直接启动target中的jar包，路径：

> http://localhost:8761

### eureka2模块

Eureka2服务启动（向Eureka注册），可直接启动target中的jar包，路径：

> http://localhost:8762

* @EnableEurekaServer @EnableEurekaClient
* 心跳检测、健康检查、负载均衡等功能
* Eureka的高可用、生产上建议至少两台以上
* 分布式系统中，服务注册中心是最重要的基础部分

### client模块

Eureka客户端模块向两个Eureka注册

### product模块

商品服务功能，注意配置数据库

> swagger地址：http://localhost:9082/swagger-ui.html

### order模块

订单功能

### 下载地址

下载地址：https://github.com/UncleCatMySelf/Cloud2Sell/releases

### 交流与提问

提问与Bug上报：https://github.com/UncleCatMySelf/Cloud2Sell/issues

QQ群：628793702（仅供交流，不提供问题解答）

### 关于作者

个人公众号：UncleCatMySelf

![Image text](https://raw.githubusercontent.com/UncleCatMySelf/img-myself/master/img/%E5%85%AC%E4%BC%97%E5%8F%B7.png)