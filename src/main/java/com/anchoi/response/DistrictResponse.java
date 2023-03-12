package com.anchoi.response;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class DistrictResponse {
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
    private String createdDate;
    private String createdBy;
    private String updatedDate;
    private String updatedBy;
    private String provinceId;
    private String provinceName;


}
