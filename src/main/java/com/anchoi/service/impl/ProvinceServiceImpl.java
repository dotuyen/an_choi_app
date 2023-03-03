package com.anchoi.service.impl;

import com.anchoi.models.Province;
import com.anchoi.repository.ProvinceRepository;
import com.anchoi.request.ProvinceRequest;
import com.anchoi.response.ProvinceResponse;
import com.anchoi.service.ProvinceService;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    final ProvinceRepository provinceRepository;

    private final ObjectMapper mapper = new ObjectMapper().configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true).registerModule(new JavaTimeModule()); ;

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

    @Override
    public void delete(String id) throws Exception {
        Optional<Province> entOpt = Optional.ofNullable(provinceRepository.findById(id)
                .orElseThrow(() -> new Exception("Not found record")));

        entOpt.ifPresent(provinceRepository::delete);
    }

    @Override
    public ProvinceResponse findById(String id) throws Exception {
        Province entity;
        ProvinceResponse response = null;
        Optional<Province> entOpt = Optional.ofNullable(provinceRepository.findById(id)
                .orElseThrow(() -> new Exception("Not found record")));
        if (entOpt.isPresent()) {
            entity = entOpt.get();
            response = mapper.convertValue(entity, ProvinceResponse.class);
        }

        return response;
    }

    @Override
    public List<Province> findAll() {
        return provinceRepository.findAll(Sort.by(Sort.Direction.ASC, "name"));
    }

    @Override
    public ProvinceResponse update(ProvinceRequest request) throws Exception {
        ProvinceResponse response = null;
        Optional<Province> entOpt = Optional.ofNullable(provinceRepository.findById(request.getId())
                .orElseThrow(() -> new Exception("Not found record")));
        if (entOpt.isPresent()) {
            Province toUpdate = mapper.convertValue(request, Province.class);

            Province updatedEnt = provinceRepository.save(toUpdate);
            response = mapper.convertValue(updatedEnt, ProvinceResponse.class);
        }

        return response;
    }
}
