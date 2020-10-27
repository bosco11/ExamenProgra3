/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.Provincias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Bosco
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UnidadDTO {
    private Long id;
    private String nombreUnidad;
    private String codigo;
    private String tipo;
    private DistritoDTO distritoId;
    private Long poblacion;
    private Double areaCuadrada;
    private boolean estado;
}
