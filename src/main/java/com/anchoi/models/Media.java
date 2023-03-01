package com.anchoi.models;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
@Table(name = "media", schema = "an_choi_app", catalog = "")
public class Media extends BaseEntity {
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Id
//    @Column(name = "id")
//    private int id;
    @Basic
    @Column(name = "url")
    private String url;
    @Basic
    @Column(name = "type_media")
    private String typeMedia;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "id_refer")
    private Integer idRefer;
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
