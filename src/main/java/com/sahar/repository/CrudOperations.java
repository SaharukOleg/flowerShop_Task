package com.sahar.repository;

import com.sahar.entity.goods.Tulip;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class CrudOperations<T> extends EntityRepository {

    private final Class<T> persistentClass; // це тип мого класу

    public CrudOperations(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

//        public int insertObjectInDataBase(Tulip tulip) { //
//        Session session = factory.openSession();
//        Transaction tx = null;
//        Integer userIdSaved = null;
//        try {
//            tx = session.beginTransaction();
//
//            userIdSaved = (Integer) session.saveObject(tulip);
//            tx.commit();
//        } catch (HibernateException ex) {
//            if (tx != null)
//                tx.rollback();
//            ex.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return userIdSaved;
//    }


    public <S extends T> S saveObject(T entity) { // і якщо сюда передати Object object
        Session session = factory.openSession();
        Transaction tx = null;
        S userIdSaved = null;
        try {
            tx = session.beginTransaction();

            userIdSaved = (S) session.save(entity);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null)
                tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return userIdSaved;

    }


    public <S extends T> S getObject(int id) {
        Session session = factory.openSession();
        Transaction tx = null;
        S entity = null;
        try {
            tx = session.beginTransaction();

            entity = (S) session.get(persistentClass, id);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null)
                tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return entity;
    }

//    public <S extends T> S updateTulip(S entity) {
//        Session session = factory.openSession();
//        Transaction tx = null;
//        S entity = null;
//        try {
//            tx = session.beginTransaction();
//
//            entity = (S) session.get(persistentClass, entity);
//            entity.setName("СУПЕР ПІОНОВИДНИЙ ");
//            session.update(tulip2);
//
//            tx.commit();
//        } catch (HibernateException ex) {
//            if (tx != null)
//                tx.rollback();
//            ex.printStackTrace();
//        } finally {
//            session.close();
//        }
//        return tulip2;
//    }

    public <S extends T> S deleteObject(int id) throws IllegalArgumentException {
        Session session = factory.openSession();
        Transaction tx = null;
        S entity = null;
        try {
            tx = session.beginTransaction();
            entity = (S) session.get(persistentClass, id);
            session.delete(entity);
            tx.commit();
        } catch (HibernateException ex) {
            if (tx != null)
                tx.rollback();
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return entity;
    }


}
