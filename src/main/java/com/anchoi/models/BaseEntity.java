package com.anchoi.models;

//import com.anchoi.util.SecurityUtil;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

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
    private Date createdDate;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_date")
    private Date updatedDate;

    @Column(name = "updated_by")
    private String updatedBy;

    @PrePersist
    public void prePersist() {
        this.setCreatedDate(new Date());
        this.setCreatedBy("system");
    }

    @PreUpdate
    public void preUpdate() {
        this.setUpdatedDate(new Date());
        this.setUpdatedBy("system");
    }

}
