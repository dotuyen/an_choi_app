package com.anchoi.models;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "role_user", schema = "an_choi_app", catalog = "")
public class RoleUser {
    @Id
    @Column(name = "id", nullable = true)
    private UUID id;

    @Basic
    @Column(name = "role_id")
    private String roleId;
    @Basic
    @Column(name = "user_id")
    private String userId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleUser roleUser = (RoleUser) o;
        return Objects.equals(roleId, roleUser.roleId) && Objects.equals(userId, roleUser.userId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
