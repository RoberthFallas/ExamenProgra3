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
import org.springframework.transaction.annotation.Transactional;
import org.una.ExamFinal.dto.UnidadDto;
import org.una.ExamFinal.entities.Unidad;
import org.una.ExamFinal.repositories.IUnidadRepository;
import org.una.ExamFinal.utils.MapperUtils;

/**
 *
 * @author roberth
 */
@Service
public class UnidadServiceImplementation implements IUnidadService {

    @Autowired
    private IUnidadRepository unidadRepo;

    @Override
    @Transactional
    public UnidadDto create(UnidadDto unidad) {
        Unidad entityUnid = MapperUtils.entityFromDto(unidad, Unidad.class);
        entityUnid = unidadRepo.save(entityUnid);
        return MapperUtils.DtoFromEntity(entityUnid, UnidadDto.class);
    }

    @Override
    @Transactional
    public UnidadDto update(UnidadDto unidad) {
        Optional<Unidad> result = unidadRepo.findById(unidad.getId());
        if (result.isPresent()) {
            Unidad entity = MapperUtils.entityFromDto(unidad, Unidad.class);
            entity = unidadRepo.save(entity);
            return MapperUtils.DtoFromEntity(entity, UnidadDto.class);
        }
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<UnidadDto> findByDistrito(Long distritoId) {
        List<Unidad> result = unidadRepo.findByDistritoId(distritoId);
        if (!result.isEmpty()) {
            return MapperUtils.DtoListFromEntityList(result, UnidadDto.class);
        }
        return new ArrayList();
    }

}
