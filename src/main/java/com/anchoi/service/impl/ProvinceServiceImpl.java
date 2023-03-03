package com.anchoi.service.impl;

import com.anchoi.models.Province;
import com.anchoi.repository.ProvinceRepository;
import com.anchoi.request.ProvinceRequest;
import com.anchoi.response.ProvinceResponse;
import com.anchoi.service.ProvinceService;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    final ProvinceRepository provinceRepository;

    private final ObjectMapper mapper = new ObjectMapper().configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);

    public ProvinceServiceImpl(ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }

    @Override
    public ProvinceResponse save(ProvinceRequest request) {
        Province toSave = mapper.convertValue(request, Province.class);
        toSave.setId("");
        Province ent = provinceRepository.save(toSave);
        ProvinceResponse response = mapper.convertValue(ent, ProvinceResponse.class);

        return response;
    }
}
