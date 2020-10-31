/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.ExamFinal.entities.TipoUnidad;
import org.una.ExamFinal.repositories.ITipoUnidadRepository;
import org.una.ExamFinal.utils.MapperUtils;
import org.una.ExamFinal.dto.TipoUnidadDto;

/**
 *
 * @author roberth
 */
@Service
public class TipoUnidadServiceImplementation implements ITipoUniadadService {

    @Autowired
    ITipoUnidadRepository tipoURepo;

    @Override
    public List<TipoUnidadDto> findAll() {
        List<TipoUnidad> result = tipoURepo.findAll();
        if (!result.isEmpty()) {
            return MapperUtils.DtoListFromEntityList(result, TipoUnidadDto.class);
        }
        return new ArrayList();
    }

}
