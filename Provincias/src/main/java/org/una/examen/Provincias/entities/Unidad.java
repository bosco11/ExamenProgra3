/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.Provincias.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Bosco
 */
@Entity
@Table(name = "exa_bjc_unidades")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Unidad implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_unidad", length = 45)
    private String nombreUnidad;

    @Column(length = 25, unique = true)
    private String codigo;
    
    @Column(name = "tipo", length = 45)
    private String tipo;
    
    @ManyToOne
    @JoinColumn(name = "distrito_id")
    private Distrito distritoId;

    @Column
    private Long poblacion;
    
    @Column
    private Double areaCuadrada;
    
    @Column
    private boolean estado;


    private static final long serialVersionUID = 1L;

    @PrePersist
    public void prePersist() {
        estado = true;
    }
    
}
