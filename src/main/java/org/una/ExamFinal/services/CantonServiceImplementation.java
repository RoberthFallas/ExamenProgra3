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
import org.una.ExamFinal.dto.CantonDto;
import org.una.ExamFinal.entities.Canton;
import org.una.ExamFinal.repositories.ICantonRepository;
import org.una.ExamFinal.utils.MapperUtils;

/**
 *
 * @author roberth
 */
@Service
public class CantonServiceImplementation implements ICantonService {

    @Autowired
    private ICantonRepository cantonRepo;

    @Override
    public CantonDto create(CantonDto canton) {
        Canton entityUnid = MapperUtils.entityFromDto(canton, Canton.class);
        entityUnid = cantonRepo.save(entityUnid);
        return MapperUtils.DtoFromEntity(entityUnid, CantonDto.class);
    }

    @Override
    public CantonDto update(CantonDto canton) {
        Optional<Canton> result = cantonRepo.findById(canton.getId());
        if (result.isPresent()) {
            Canton entity = MapperUtils.entityFromDto(canton, Canton.class);
            entity = cantonRepo.save(entity);
            return MapperUtils.DtoFromEntity(entity, CantonDto.class);
        }
        return null;
    }

    @Override
    public List<CantonDto> findByProvincia(Long ProvinciaId) {
        List<Canton> result = cantonRepo.findByProvinciaId(ProvinciaId);
        if (!result.isEmpty()) {
            return MapperUtils.DtoListFromEntityList(result, CantonDto.class);
        }
        return new ArrayList();
    }

}
