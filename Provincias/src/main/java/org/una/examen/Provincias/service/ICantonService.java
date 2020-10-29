/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.Provincias.service;

import java.util.List;
import java.util.Optional;
import org.una.examen.Provincias.dto.CantonDTO;

/**
 *
 * @author Bosco
 */
public interface ICantonService {
    
    public Optional<List<CantonDTO>> findAll();

    public Optional<CantonDTO> findById(Long id);

    public CantonDTO create(CantonDTO doctor);

    public Optional<CantonDTO> update(CantonDTO doctor, Long id);
    
    public void delete(Long id);
    
    public Optional<List<CantonDTO>> findByEstado(boolean estado);
}
