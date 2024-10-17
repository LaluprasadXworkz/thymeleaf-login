package com.xworkz.mobile.repository;

import com.xworkz.mobile.entity.MobileEntity;

import java.util.List;

public interface MobileRepository {

    public void  save(MobileEntity mobile);
    public List<MobileEntity> getAllMobile();
    public MobileEntity getMobileById(int id);

    public  boolean updateMobileDetails(String mName,Long pNum,int price,String showroom,int id);
    public boolean deleteMobileById(int mid);
}
