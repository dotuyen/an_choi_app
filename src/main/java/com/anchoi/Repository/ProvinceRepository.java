package com.anchoi.repository;

import com.anchoi.models.ERole;
import com.anchoi.models.Province;
import com.anchoi.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProvinceRepository extends JpaRepository<Province, String> {
  Optional<Role> findByName(ERole name);
}
