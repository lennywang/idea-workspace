import com.ifox.OrdersEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestOrders {
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init(){
        Configuration configuration = new Configuration().configure();//创建配置对象
        sessionFactory = configuration.buildSessionFactory();//创建会话工厂
        session = sessionFactory.openSession();//开启会话
        transaction = session.getTransaction();//开启事务
        session.beginTransaction();
    }

    @After
    public void destory() {
        transaction.commit();//事务提交
        session.close();//关闭会话
        sessionFactory.close();//关闭会话工厂
    }

    @Test
    public void  testUser(){
        //Integer f1=100,f2=100,f3=150,f4=150;

        //        Date currentTime = new Date();
        //        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //        String stime = formatter.format(currentTime);
        //
        //        //int id, String number, Timestamp createtime, String note
        //        OrdersEntity userEntity = new OrdersEntity(2,"1",stime,"comment");
        //        session.save(userEntity);//保存对象进数据库
    }

    //查询
    @Test
    public void  testUser2(){
        //        String sql="select new OrdersEntity(id,number,createtime,note) from OrdersEntity where id=1";
        //        OrdersEntity entity= (OrdersEntity) session.createQuery(sql).uniqueResult();
        //        System.out.println(entity);
    }
    //修改

    //删除



}
