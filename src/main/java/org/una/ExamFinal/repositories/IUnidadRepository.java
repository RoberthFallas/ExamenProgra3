/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.repositories;

import java.util.List;
import org.una.ExamFinal.entities.Unidad;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author roberth
 */
public interface IUnidadRepository extends JpaRepository<Unidad, Long> {

    public List<Unidad> findByDistritoId(Long id);
}
