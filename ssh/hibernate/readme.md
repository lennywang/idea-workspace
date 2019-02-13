##问题
###1、Could not locate cfg.xml resource
 问题描述：org.hibernate.internal.util.config.ConfigurationException: Could not locate cfg.xml resource
 解决方案：将hibernate.cfg.xml放入resources 文件夹中
 参考文档：https://blog.csdn.net/u013547551/article/details/54709968/
 
 ###2、Transaction not successfully started
 问题描述：org.hibernate.TransactionException: Transaction not successfully started
 解决方案：加上 session.beginTransaction();
 参考文档：https://blog.csdn.net/lyy98521/article/details/43525113
 
 
 ##笔记
 ###1、hibernate.hbm2ddl.auto配置详解
hibernate.hbm2ddl.auto配置详解
https://www.cnblogs.com/talo/articles/1662244.html
 
 