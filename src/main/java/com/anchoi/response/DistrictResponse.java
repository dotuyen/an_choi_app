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

    public DistrictResponse() {
    }

    public DistrictResponse(String id, String name, String population, String density, String yearOfDensity, String coastline, String description, String latitude, String longitude, String mapImage, String createdDate, String createdBy, String updatedDate, String updatedBy, String provinceId, String provinceName) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.density = density;
        this.yearOfDensity = yearOfDensity;
        this.coastline = coastline;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mapImage = mapImage;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        this.provinceId = provinceId;
        this.provinceName = provinceName;
    }

    public DistrictResponse(String id, String name, String population, String density, String yearOfDensity, String coastline, String description, String latitude, String longitude, String mapImage, String createdDate, String createdBy, String updatedDate, String updatedBy, String provinceId) {
        this.id = id;
        this.name = name;
        this.population = population;
        this.density = density;
        this.yearOfDensity = yearOfDensity;
        this.coastline = coastline;
        this.description = description;
        this.latitude = latitude;
        this.longitude = longitude;
        this.mapImage = mapImage;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.updatedDate = updatedDate;
        this.updatedBy = updatedBy;
        this.provinceId = provinceId;
    }
}
