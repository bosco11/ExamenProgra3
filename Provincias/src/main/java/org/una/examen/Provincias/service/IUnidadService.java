/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.Provincias.service;

import java.util.List;
import java.util.Optional;
import org.una.examen.Provincias.dto.UnidadDTO;

/**
 *
 * @author Bosco
 */
public interface IUnidadService {
    
    public Optional<List<UnidadDTO>> findAll();

    public Optional<UnidadDTO> findById(Long id);

    public UnidadDTO create(UnidadDTO doctor);

    public Optional<UnidadDTO> update(UnidadDTO doctor, Long id);
    
    public void delete(Long id);
    
    public Optional<List<UnidadDTO>> findByEstado(boolean estado);
    
    public Optional<List<UnidadDTO>> findDistritoUnidadId(Long id);
}
