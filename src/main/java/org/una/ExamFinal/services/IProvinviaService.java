/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.services;

import java.util.List;
import org.una.ExamFinal.dto.ProvinciaDto;

/**
 *
 * @author roberth
 */
public interface IProvinviaService {

    public ProvinciaDto create(ProvinciaDto provincia);

    public ProvinciaDto update(ProvinciaDto provincia);
    
    public List<ProvinciaDto> findAll();

}
