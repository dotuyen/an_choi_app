package com.anchoi.Entity;

import com.anchoi.util.SecurityUtil;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "id", nullable = false, length = 36)
    private String id;

//    @Column(name = "status", nullable = false)
//    @Enumerated(EnumType.STRING)
//    private Status status;

    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @Column(name = "created_user", nullable = false)
    private String createdUser;

    @Column(name = "updated_date")
    private Instant updatedDate;

    @Column(name = "updated_user")
    private String updatedUser;

    @PrePersist
    public void prePersist() {
        this.setCreatedDate(Instant.now());
        this.setCreatedUser(SecurityUtil.getCurrentUser());
    }

    @PreUpdate
    public void preUpdate() {
        this.setUpdatedDate(Instant.now());
        this.setUpdatedUser(SecurityUtil.getCurrentUser());
    }

}
