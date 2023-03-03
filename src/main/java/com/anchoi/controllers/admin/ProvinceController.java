package com.anchoi.controllers.admin;

import com.anchoi.request.ProvinceRequest;
import com.anchoi.response.ProvinceResponse;
import com.anchoi.service.ProvinceService;
import com.anchoi.service.impl.ProvinceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin/province")
public class ProvinceController {
  @Autowired
  ProvinceService provinceService;

  @PostMapping("/v1.0/save")
  @PreAuthorize("hasRole('ADMIN')")
  public ResponseEntity<?> saveProvince(@Valid @RequestBody ProvinceRequest request) {
    ProvinceResponse response = provinceService.save(request);
    return ResponseEntity.ok(response);
  }
}
