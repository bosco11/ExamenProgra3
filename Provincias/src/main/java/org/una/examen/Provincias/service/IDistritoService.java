/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.Provincias.service;

import java.util.List;
import java.util.Optional;
import org.una.examen.Provincias.dto.DistritoDTO;

/**
 *
 * @author Bosco
 */
public interface IDistritoService {
    
    public Optional<List<DistritoDTO>> findAll();

    public Optional<DistritoDTO> findById(Long id);

    public DistritoDTO create(DistritoDTO doctor);

    public Optional<DistritoDTO> update(DistritoDTO doctor, Long id);
    
    public void delete(Long id);
}
