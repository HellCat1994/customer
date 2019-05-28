# 修改数据库配置源
打开main->resource->application.yml文件

1.修改：url: jdbc:mysql://**localhost**:3306/**huawei_test**?useSSL=false&useUnicode=true&characterEncoding=UTF-8

其中localhost修改为连接的ip地址,huawei_test即库名，修改为连接的库名。

2.修改：username: **root**

修改root为登陆的用户名

3.修改：password:**yanyuqinghe**

修改yanyuqinghe为登陆的密码

# 注意需要首先启动serviceComb服务才能使用

# 启动成功后，访问RESTful地址为：**localhost:9080/huaweicloud/user**
看页面是否返回插入数据库中的user_name字段信息
    
