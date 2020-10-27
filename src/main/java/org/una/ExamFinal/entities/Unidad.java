/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author roberth
 */
@Entity
@Table(name = "exa_rob_unidades")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Unidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(length = 30)
    private String nombre;
    @Column
    @Basic(optional = false)
    private Integer codigo;
    @Column
    private Long poblacion;
    @Temporal(TemporalType.DATE)
    private Date fecha_actualizacion;
    @Column(name = "area_metros_cuadr")
    private Float areaMetrosCuadrados;
    @JoinColumn(name = "exa_rob_tipo_unidad_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TipoUnidad tipoUnidad;
    @JoinColumn(name = "exa_rob_distrito_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Distrito distrito;

}
