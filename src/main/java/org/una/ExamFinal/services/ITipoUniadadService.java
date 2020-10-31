/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.services;

import java.util.List;
import org.una.ExamFinal.dto.TipoUnidadDto;

/**
 *
 * @author roberth
 */
public interface ITipoUniadadService {

    public List<TipoUnidadDto> findAll();
}
