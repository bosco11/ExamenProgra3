/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.Provincias.service;

import java.util.List;
import java.util.Optional;
import org.una.examen.Provincias.dto.ProvinciaDTO;

/**
 *
 * @author Bosco
 */
public interface IProvinciaService {
    
    public Optional<List<ProvinciaDTO>> findAll();

    public Optional<ProvinciaDTO> findById(Long id);

    public ProvinciaDTO create(ProvinciaDTO provincia);

    public Optional<ProvinciaDTO> update(ProvinciaDTO provincia, Long id);
    
    public Optional<List<ProvinciaDTO>> findByEstado(boolean estado);
}
