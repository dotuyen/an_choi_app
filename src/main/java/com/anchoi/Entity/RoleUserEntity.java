package com.anchoi.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "role_user", schema = "an_choi_app", catalog = "")
public class RoleUserEntity extends BaseEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;
    @Basic
    @Column(name = "role_id")
    private String roleId;
    @Basic
    @Column(name = "user_id")
    private String userId;
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
