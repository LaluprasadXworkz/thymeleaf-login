package com.xworkz.mobile.repository.impl;

import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.repository.MobileRepository;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;

public class MobileRepositoryImpl implements MobileRepository {

    EntityManagerFactory emf= Persistence.createEntityManagerFactory("fertilizer");
    @Override
    public void save(MobileEntity mobile) {
        EntityManager em= this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try{
            et.begin();
            em.persist(mobile);
            System.out.println("Data inserted "+mobile.getMobileName());
            et.commit();
        }catch (PersistenceException e){
            e.printStackTrace();
            et.rollback();
        }finally {
            em.close();
        }
    }

    @Override
    public List<MobileEntity> getAllMobile() {
        EntityManager em=this.emf.createEntityManager();
        try{
            Query query= em.createNamedQuery("getAllMobile");
            List<MobileEntity> list=query.getResultList();
            System.out.println(list);
            return list;
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            em.close();
        }
        return Collections.emptyList();
    }

    @Override
    public MobileEntity getMobileById(int id) {
        EntityManager em=this.emf.createEntityManager();
        try{
            MobileEntity mobile=em.find(MobileEntity.class,id);
            System.out.println("getMobileById"+mobile.getMobileName());
            return mobile;
        }catch (PersistenceException e){
            e.printStackTrace();
        }finally {
            em.close();
        }
        return null;
    }

    @Override
    public boolean updateMobileDetails(String mName,Long pNum,int price,String showroom,int id) {
        EntityManager em= this.emf.createEntityManager();
        EntityTransaction et =em.getTransaction();
        try{
            et.begin();
           Query query= em.createNamedQuery("updateMobileDetails");
            query.setParameter("mobileName",mName);
            query.setParameter("pNumber",pNum);
            query.setParameter("price",price);
            query.setParameter("showRoomName",showroom);
            query.setParameter("id",id);
            int update=query.executeUpdate();
            if (update == 1) {
                System.out.println("Data updated");
                et.commit();
                return true;
            }else {
                System.out.println("not updated");
            }

        }catch (PersistenceException e){
            e.printStackTrace();
            et.rollback();
        }finally {
            em.close();
        }
        return false;
    }

    @Override
    public boolean deleteMobileById(int mid) {
        EntityManager em=this.emf.createEntityManager();
        EntityTransaction et=em.getTransaction();
        try{
            et.begin();
            Query query=em.createNamedQuery("deleteMobileById");
            query.setParameter("id",mid);
            int updated=query.executeUpdate();
            if(updated==1){
                et.commit();
                return true;
            }else {
                System.out.println("not deleted");
            }

        }catch (PersistenceException e){
            e.printStackTrace();
            et.rollback();
        }finally {
            em.close();
        }
        return false;
    }
}
