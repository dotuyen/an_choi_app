package com.anchoi.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "category", schema = "an_choi_app", catalog = "")
public class Category extends BaseEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "icon")
    private String icon;
//    @Basic
//    @Column(name = "created_date")
//    private Timestamp createdDate;
//    @Basic
//    @Column(name = "created_by")
//    private String createdBy;
//    @Basic
//    @Column(name = "updated_date")
//    private Integer updatedDate;
//    @Basic
//    @Column(name = "updated_by")
//    private String updatedBy;

}
