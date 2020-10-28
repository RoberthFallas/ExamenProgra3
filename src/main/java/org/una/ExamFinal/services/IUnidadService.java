/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.services;

import org.una.ExamFinal.dto.UnidadDto;
import java.util.List;

/**
 *
 * @author roberth
 */
public interface IUnidadService {

    public UnidadDto create(UnidadDto unidad);

    public UnidadDto update(UnidadDto unidad);

    public List<UnidadDto> findByDistrito(Long distritoId);

}
