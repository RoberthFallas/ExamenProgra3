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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
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
@Table(name = "exa_rob_tareas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Tarea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Temporal(TemporalType.DATE)
    @Column(name = "fecha_finalizacion")
    private Date fechaFinalizacion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "fecha_Ultima_actualizacion")
    private Date fechaUltimaActualizacion;
    @Column
    private Short importancia;
    @Column
    private Short urgencia;
    @Column(name = "porcentaje_avance")
    private Integer porcentageAvance;
    @Column(length = 150)
    private String descripcion;
    @Column(length = 3)
    private String estado;
    @JoinColumn(name = "proyectos_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Proyecto proyecto;

    @PrePersist
    public void prePersist() {
        this.fechaInicio = new Date();
        this.fechaUltimaActualizacion = new Date();
    }

    @PreUpdate
    public void preUpdate() {
        this.fechaUltimaActualizacion = new Date();
    }

}
