package com.anchoi.models;

//import com.anchoi.util.SecurityUtil;
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

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Instant updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @PrePersist
    public void prePersist() {
        this.setCreatedDate(Instant.now());
        this.setCreatedBy("system");
    }

    @PreUpdate
    public void preUpdate() {
        this.setUpdatedDate(Instant.now());
        this.setUpdatedBy("system");
    }

}
