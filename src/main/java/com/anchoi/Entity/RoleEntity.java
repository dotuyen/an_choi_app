package com.anchoi.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "role", schema = "an_choi_app", catalog = "")
public class RoleEntity extends BaseEntity {
    @Basic
    @Column(name = "name")
    @Enumerated(EnumType.STRING)
    private ERole name;
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

}
