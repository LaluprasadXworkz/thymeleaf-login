package com.xworkz.mobile.service;

import com.xworkz.mobile.entity.MobileEntity;

import java.util.List;

public interface MobileService {

    public void  ValidateSave(MobileEntity mobile);
    public List<MobileEntity> ValidateGetAllMobile();
    public MobileEntity ValidateGetMobileById(int id);

    public  boolean ValidateUpdateMobileDetails(String mName,Long pNum,int price,String showroom,int id);
    public boolean ValidateDeleteMobileById(int mid);
}
