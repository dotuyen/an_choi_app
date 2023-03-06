package com.anchoi.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "role_user", schema = "an_choi_app", catalog = "")
public class RoleUser extends BaseEntity {
    @Basic
    @Column(name = "role_id")
    private String roleId;
    @Basic
    @Column(name = "user_id")
    private String userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        RoleUser roleUser = (RoleUser) o;
        return getId() != null && Objects.equals(getId(), roleUser.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
