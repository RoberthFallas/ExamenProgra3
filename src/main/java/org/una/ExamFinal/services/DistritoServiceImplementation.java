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
import org.una.ExamFinal.dto.DistritoDto;
import org.una.ExamFinal.dto.UnidadDto;
import org.una.ExamFinal.entities.Distrito;
import org.una.ExamFinal.repositories.IDistritoRepository;
import org.una.ExamFinal.utils.MapperUtils;

/**
 *
 * @author rober
 */
@Service
public class DistritoServiceImplementation implements IDistritoService {

    @Autowired
    private IDistritoRepository distritRepo;

    @Override
    public DistritoDto create(DistritoDto distrito) {
        Distrito entityUnid = MapperUtils.entityFromDto(distrito, Distrito.class);
        entityUnid = distritRepo.save(entityUnid);
        return MapperUtils.DtoFromEntity(entityUnid, DistritoDto.class);
    }

    @Override
    public DistritoDto update(DistritoDto distrito) {
        Optional<Distrito> result = distritRepo.findById(distrito.getId());
        if (result.isPresent()) {
            Distrito entity = MapperUtils.entityFromDto(distrito, Distrito.class);
            entity = distritRepo.save(entity);
            return MapperUtils.DtoFromEntity(entity, DistritoDto.class);
        }
        return null;
    }

    @Override
    public List<DistritoDto> findByCanton(Long cantonId) {
        List<Distrito> result = distritRepo.findByCantonId(cantonId);
        if (!result.isEmpty()) {
            return MapperUtils.DtoListFromEntityList(result, DistritoDto.class);
        }
        return new ArrayList();
    }

}
