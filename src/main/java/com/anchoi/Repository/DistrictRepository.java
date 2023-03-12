package com.anchoi.repository;

import com.anchoi.models.District;
import com.anchoi.response.DistrictResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DistrictRepository extends DistrictRepositoryCustomer, JpaRepository<District, String> {

  @Query(value="select * from district d where lower(d.name) = :name", nativeQuery = true)
  List<District> findByName(String name);

  @Query(value="select * from district d where lower(d.name) = :name and d.province_id = :provinceId", nativeQuery = true)
  List<District> findByNameAndProvinceId(String name, String provinceId);

//  @Query(value="select d.id,d.name,d.population,d.density,d.year_of_density as yearOfDensity, d.coastline as coastline, d.description, d.latitude,d.longitude,d.map_image as mapImage, p.name as provinceName from district d " +
//          "left join province p on d.province_id = p.id", nativeQuery = true)
//  List<DistrictResponse> findAllWithProvinceName();
}
