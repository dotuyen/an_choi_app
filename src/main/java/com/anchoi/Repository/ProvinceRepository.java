package com.anchoi.repository;

import com.anchoi.models.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, String> {

  @Query(value="select * from province p where lower(p.name) = :name", nativeQuery = true)
  List<Province> findByName(String name);
}
