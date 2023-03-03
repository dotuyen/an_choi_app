package com.anchoi.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "role_user", schema = "an_choi_app", catalog = "")
public class RoleUser extends BaseEntity {
    @Basic
    @Column(name = "role_id")
    private String roleId;
    @Basic
    @Column(name = "user_id")
    private String userId;

}
