
#### 技术选型

1.mysql
2.mybatis plus
3.ELK(日志收集)


#### 1 集成logstash

##### 1.1运行logstash
   在bin目录下，启动命令
   ```cmd
   logstash -f logstash.conf
   ```

#### 2 分页

##### 2.1 总结web中各种分页思路/方法

* **不借助工具：分别计算当前页数据集、总数**
* **使用github分页工具**
* **Mybatis内置分页**
* **Mybatis plus分页**
* **Spring Data分页**
* **Mybatis数据量大时，拦截器分页**