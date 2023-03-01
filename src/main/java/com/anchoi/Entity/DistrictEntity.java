package com.anchoi.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "district", schema = "an_choi_app", catalog = "")
public class DistrictEntity extends BaseEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "population")
    private String population;
    @Basic
    @Column(name = "density")
    private String density;
    @Basic
    @Column(name = "year_of_density")
    private String yearOfDensity;
    @Basic
    @Column(name = "coastline")
    private String coastline;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "latitude")
    private String latitude;
    @Basic
    @Column(name = "longitude")
    private String longitude;
    @Basic
    @Column(name = "map_image")
    private String mapImage;
//    @Basic
//    @Column(name = "created_date")
//    private Timestamp createdDate;
//    @Basic
//    @Column(name = "created_by")
//    private String createdBy;
//    @Basic
//    @Column(name = "updated_date")
//    private Timestamp updatedDate;
//    @Basic
//    @Column(name = "updated_by")
//    private String updatedBy;
    @Basic
    @Column(name = "province_id")
    private Integer provinceId;

}
