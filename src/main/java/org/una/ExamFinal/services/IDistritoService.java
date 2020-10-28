/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.services;

import org.una.ExamFinal.dto.DistritoDto;

import java.util.List;

/**
 *
 * @author roberth
 */
public interface IDistritoService {

    public DistritoDto create(DistritoDto distrito);

    public DistritoDto update(DistritoDto distrito);

    public List<DistritoDto> findByCanton(Long cantonId);
}
