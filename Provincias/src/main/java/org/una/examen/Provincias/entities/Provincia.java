/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.Provincias.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "exa_bjc_provincias")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Provincia implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_provincia", length = 45)
    private String nombreProvincia;

    @Column(length = 25, unique = true)
    private String codigo;
    
    @Column
    private boolean estado;
    
    private static final long serialVersionUID = 1L;

    @PrePersist
    public void prePersist() {
        estado = true;
    }
}
