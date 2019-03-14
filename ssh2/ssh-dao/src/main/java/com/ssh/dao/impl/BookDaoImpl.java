package com.ssh.dao.impl;

import com.ssh.dao.BookDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.HibernateTemplate;
import ssh.entity.BooksEntity;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

public class BookDaoImpl extends HibernateDaoSupport implements BookDao {

    /*
    查询单列
     */
    public List<String> getBookNames() {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<String> list = hibernateTemplate.execute(new HibernateCallback<List<String>>() {
            public List<String> doInHibernate(Session session) throws HibernateException {
                List<String> list = session.createQuery("select name from BooksEntity").list();
                return list;
            }
        });
        return list;
    }

    /*
    查询多列1
     */
    public List<Object[]> getBookNameAndAuthor() {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<Object[]> list = hibernateTemplate.execute(new HibernateCallback<List<Object[]>>() {
            public List<Object[]> doInHibernate(Session session) throws HibernateException {
                List<Object[]> list = session.createQuery("select name,author from BooksEntity").list();
                return list;
            }
        });
        return list;
    };

    /*
    查询多列2
     */
    public List<BooksEntity> getBookList() {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<BooksEntity> list = hibernateTemplate.execute(new HibernateCallback<List<BooksEntity>>() {
            public List<BooksEntity> doInHibernate(Session session) throws HibernateException {
                List<BooksEntity> list = session.createQuery("select new BooksEntity(author,name) from BooksEntity").list();
                return list;
            }
        });
        return list;
    }

    /*
    通过ID查询
     */
    public List<BooksEntity> getBookListById() {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<BooksEntity> list = hibernateTemplate.execute(new HibernateCallback<List<BooksEntity>>() {
            public List<BooksEntity> doInHibernate(Session session) throws HibernateException {
                List<BooksEntity> list = session.createQuery("from BooksEntity where id > ? and id < ?").setParameter(0, new Short("2")).setParameter(1, new Short("5")).list();
                return list;
            }
        });
        return list;
    }

    //    public List<BooksEntity> getBookListByCategory(){
    //        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
    //        List<BooksEntity> list = hibernateTemplate.execute(new HibernateCallback<List<BooksEntity>>() {
    //            public List<BooksEntity> doInHibernate(Session session) throws HibernateException {
    //                //TODO : name
    //                List<CategoryEntity> list = session.createQuery("from CategoryEntity where name = :name").setParameter("name","").list();
    //                Set<BooksEntity> books = list.get(0).getBooks();
    //                return list;
    //            }
    //        });
    //        return list;
    //    }

    /*
    分页查询
     */
    public List<BooksEntity> getBooksByPage()
    {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<BooksEntity> list = hibernateTemplate.execute(new HibernateCallback<List<BooksEntity>>() {
            public List<BooksEntity> doInHibernate(Session session) throws HibernateException {
                List<BooksEntity> list = session.createQuery("from BooksEntity").setFirstResult(0).setMaxResults(3).list();
                return list;
            }
        });
        return list;
    }

    /*
     查询数量
     */
    public Number getBookCount(){
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        Number number = hibernateTemplate.execute(new HibernateCallback<Number>() {
            public Number doInHibernate(Session session) throws HibernateException {
               Number number = (Number) session.createQuery("select count(1) from BooksEntity").uniqueResult();
               return number;
            }
        });
        return number;
    }

    public List<Object[]> getBookCountperCategoryList()
    {
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<Object[]> list = hibernateTemplate.execute(new HibernateCallback<List<Object[]>>() {
            public List<Object[]> doInHibernate(Session session) throws HibernateException {
                List<Object[]> list = session.createQuery("select b.categoryEntity.name,count(b.id)  from BooksEntity b group by b.categoryEntity.name").list();
                return list;
            }
        });
        return list;
    }

    public List<BooksEntity> getBookListByCategoryName(){
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<BooksEntity> list = hibernateTemplate.execute(new HibernateCallback<List<BooksEntity>>() {
            public List<BooksEntity> doInHibernate(Session session) throws HibernateException {
                List<BooksEntity> list = session.createQuery("from BooksEntity b where b.CategoryEntity.name=:name").setParameter("name","小说").list();
                return list;
            }
        });
        return list;
    }

    public  List<Object[]> getBookCategory(){
        HibernateTemplate hibernateTemplate = this.getHibernateTemplate();
        List<Object[]> list = hibernateTemplate.execute(new HibernateCallback<List<Object[]>>() {
            public List<Object[]> doInHibernate(Session session) throws HibernateException {
                List<Object[]> list = session.createQuery("select c.name,b.name from CategoryEntity c left outer join c.booksEntitySet b").list();
                return list;
            }
        });
        return list;
    }


}
