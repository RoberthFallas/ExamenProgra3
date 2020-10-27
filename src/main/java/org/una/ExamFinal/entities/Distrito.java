/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.ExamFinal.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author roberth
 */
@Entity
@Table(name = "exa_rob_distrito")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Distrito implements Serializable {

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
    @JoinColumn(name = "exa_rob_canton_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Canton canton;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "distrito")
    private List<Unidad> unidades;
}
