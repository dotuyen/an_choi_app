package com.anchoi.Repository;

import java.util.Optional;

import com.anchoi.Entity.ERole;
import com.anchoi.Entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, String> {
  Optional<RoleEntity> findByName(ERole name);
}
