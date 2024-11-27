
# Dormitory management system
基于vue+Element+servlet+mybatis的宿舍管理系统
许多内容还未实现，后续还会更改，仅供学习使用
## 数据库连接
``` 
<environments default="development">  
  <environment id="development">  
  <transactionManager type="JDBC"/>  
 <dataSource type="POOLED">  
  <property name="driver" value="com.mysql.cj.jdbc.Driver"/>  
 <property name="url" value="jdbc:mysql:///自己的数据库名?useSSL=false&amp;useServerPrepStmts=true&amp;allowPublicKeyRetrieval=true"/>  
 <property name="username" value="？？？"/>  
 <property name="password" value="？？？"/>  
  </dataSource>  
  </environment>  
</environments>
