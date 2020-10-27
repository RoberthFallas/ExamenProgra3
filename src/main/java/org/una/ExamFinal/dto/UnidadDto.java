/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author roberth
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UnidadDto {

    private Long id;
    private String nombre;
    private Integer codigo;
    private Long poblacion;
    private Float areaMetrosCuadrados;
    private TipoUnidadDto tipoUnidad;
    @Setter(AccessLevel.NONE)
    private DistritoDto distrito;

}
