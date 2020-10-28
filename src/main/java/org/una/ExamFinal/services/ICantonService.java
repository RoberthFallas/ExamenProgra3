/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.services;

import org.una.ExamFinal.dto.CantonDto;
import java.util.List;

/**
 *
 * @author roberth
 */
public interface ICantonService {

    public CantonDto create(CantonDto canton);

    public CantonDto update(CantonDto canton);

    public List<CantonDto> findByProvincia(Long ProvinciaId);

}
