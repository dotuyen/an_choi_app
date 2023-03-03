package com.anchoi.service;

import com.anchoi.request.ProvinceRequest;
import com.anchoi.response.ProvinceResponse;
import org.springframework.stereotype.Service;

public interface ProvinceService {

  ProvinceResponse save(ProvinceRequest request);
}
