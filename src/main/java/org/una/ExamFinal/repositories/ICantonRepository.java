/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.una.ExamFinal.entities.Canton;
/**
 *
 * @author roberth
 */
public interface ICantonRepository extends JpaRepository<Canton, Long>{
    
}
