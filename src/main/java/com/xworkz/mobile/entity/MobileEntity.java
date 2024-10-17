package com.xworkz.mobile.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "mobile_info")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString

@NamedQuery(name = "getAllMobile" ,query = "select a from  MobileEntity a")
@NamedQuery(name = "updateMobileDetails" ,
query ="update MobileEntity mobile set mobile.mobileName=:mobileName,mobile.pNumber=:pNumber,mobile.price=:price," +
        "mobile.showRoomName=:showRoomName where mobile.id=:id ")
@NamedQuery(name="deleteMobileById",query = "delete from MobileEntity mobile where mobile.id=:id")
public class MobileEntity {
//    mid, M_name, pnumber, price, showRoomName

    @Id
    @Column(name = "mid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    @Column(name = "M_name")
    @NonNull
    private  String mobileName;

    @Column(name = "pnumber")
    @NonNull
    private Long pNumber;

    @Column(name = "price")
    @NonNull
    private int price;

    @Column(name = "showRoomName")
    @NonNull
    private String showRoomName;

}
