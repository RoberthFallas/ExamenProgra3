/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.dto;

import java.util.Date;

/**
 *
 * @author roberth
 */
public class TareaDto {

    private Long id;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private Date fechaUltimaActualizacion;
    private Short importancia;
    private Short urgencia;
    private Integer porcentageAvance;
    private String descripcion;
    private String estado;
    private ProyectoDto proyecto;
}
