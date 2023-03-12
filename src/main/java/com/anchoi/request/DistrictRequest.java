package com.anchoi.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class DistrictRequest {
    private String id;
    private String name;
    private String population;
    private String density;
    private String yearOfDensity;
    private String coastline;
    private String description;
    private String latitude;
    private String longitude;
    private String mapImage;
    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private Date createdDate;
    private String createdBy;
    @JsonFormat(pattern="dd/MM/yyyy HH:mm:ss")
    private Date updatedDate;
    private String updatedBy;
    @NotBlank(message = "provinceId not null")
    private String provinceId;

}
