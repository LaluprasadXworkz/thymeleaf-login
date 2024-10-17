package com.xworkz.mobile.service.impl;

import com.xworkz.mobile.entity.MobileEntity;
import com.xworkz.mobile.repository.MobileRepository;
import com.xworkz.mobile.repository.impl.MobileRepositoryImpl;
import com.xworkz.mobile.service.MobileService;

import java.util.List;

public class MobileServiceImpl implements MobileService {

    MobileRepository repository=new MobileRepositoryImpl();
    @Override
    public void ValidateSave(MobileEntity mobile) {
        repository.save(mobile);
        System.out.println(mobile.getMobileName());
    }

    @Override
    public List<MobileEntity> ValidateGetAllMobile() {
        return repository.getAllMobile();
    }

    @Override
    public MobileEntity ValidateGetMobileById(int id) {
        return repository.getMobileById(id);
    }

    @Override
    public boolean ValidateUpdateMobileDetails(String mName, Long pNum, int price, String showroom, int id) {
        return repository.updateMobileDetails(mName,pNum,price,showroom,id);
    }

    @Override
    public boolean ValidateDeleteMobileById(int mid) {
        return repository.deleteMobileById(mid);
    }
}
