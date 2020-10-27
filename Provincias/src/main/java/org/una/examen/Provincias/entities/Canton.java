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
@Table(name = "exa_bjc_cantones")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Canton implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_canton", length = 45)
    private String nombreCanton;

    @Column(length = 25, unique = true)
    private String codigo;
    
    @ManyToOne
    @JoinColumn(name = "provincia_id")
    private Provincia provinciaId;

    @Column
    private boolean estado;


    private static final long serialVersionUID = 1L;

    @PrePersist
    public void prePersist() {
        estado = true;
    }

}
