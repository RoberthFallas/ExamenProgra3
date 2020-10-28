/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.ExamFinal.dto.ProvinciaDto;
import org.una.ExamFinal.utils.MapperUtils;
import org.una.ExamFinal.entities.Provincia;
import org.una.ExamFinal.repositories.IProvivnciaRepository;

/**
 *
 * @author roberth
 */
@Service
public class ProvinvicaServiceImplementation implements IProvinviaService {

    @Autowired
    private IProvivnciaRepository provRepo;

    @Override
    public ProvinciaDto create(ProvinciaDto provincia) {
        Provincia entityProv = MapperUtils.entityFromDto(provincia, Provincia.class);
        entityProv = provRepo.save(entityProv);
        return MapperUtils.DtoFromEntity(entityProv, ProvinciaDto.class);
    }

    @Override
    public ProvinciaDto update(ProvinciaDto provincia) {
        Optional<Provincia> result = provRepo.findById(provincia.getId());
        if (result.isPresent()) {
            Provincia entity = MapperUtils.entityFromDto(provincia, Provincia.class);
            entity = provRepo.save(entity);
            return MapperUtils.DtoFromEntity(entity, ProvinciaDto.class);
        }
        return null;
    }

    @Override
    public List<ProvinciaDto> findAll() {
        List<Provincia> result = provRepo.findAll();
        if (!result.isEmpty()) {
            return MapperUtils.DtoListFromEntityList(result, ProvinciaDto.class);
        }
        return new ArrayList();
    }

}
