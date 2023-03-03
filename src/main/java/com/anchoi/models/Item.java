package com.anchoi.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "item", schema = "an_choi_app", catalog = "")
public class Item extends BaseEntity {
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "category_id")
    private String categoryId;
    @Basic
    @Column(name = "province_id")
    private String provinceId;
    @Basic
    @Column(name = "district_id")
    private String districtId;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "latitude")
    private String latitude;
    @Basic
    @Column(name = "longitude")
    private String longitude;

}
