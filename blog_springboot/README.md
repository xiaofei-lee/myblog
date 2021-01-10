# blog_springboot

# 目录结构

## 根目录：src.main.java

1.工程启动类(BlogApplication.java)：置于com.xxx.project包下

2.实体类(domain)：
(1)置于com.xxx.project.domain(jpa)
(2)置于com.xxx.project.entity(mybatis)

3.数据访问层(Dao)：
(1)置于com.xxx.project.repository(jpa)
(2)置于com.xxx.project.mapper(mybatis)

4.数据服务层(Service)：置于com.xxx.project.service

5.数据服务接口的实现(serviceImpl)：置于com.xxx.project.service.impl

6.前端控制器(Controller)：置于com.xxx.project.controller

7.工具类(utils)：置于com.xxx.project.utils

8.配置信息类(config)：置于com.xxx.project.config

## 资源文件：src.main.resources

1.页面以及js/css/image等置于static文件夹下的各自文件下

2.使用模版相关页面等置于templates文件夹下的各自文件下
