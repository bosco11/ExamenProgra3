/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.Provincias.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.una.examen.Provincias.dto.UnidadDTO;
import org.una.examen.Provincias.entities.Unidad;
import org.una.examen.Provincias.repositories.IUnidadRepository;
import org.una.examen.Provincias.utils.ConversionLista;
import org.una.examen.Provincias.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class UnidadServiceImplementation implements IUnidadService{

    @Autowired
    private IUnidadRepository IUnidadRepository;
    
    @Override
    public Optional<List<UnidadDTO>> findAll() {
        return (Optional<List<UnidadDTO>>) ConversionLista.findList((IUnidadRepository.findAll()), UnidadDTO.class);    }

    @Override
    public Optional<UnidadDTO> findById(Long id) {
        return (Optional<UnidadDTO>) ConversionLista.oneToDto(IUnidadRepository.findById(id), UnidadDTO.class);
    }

    @Override
    public UnidadDTO create(UnidadDTO UnidadDTO) {
        Unidad uni = MapperUtils.EntityFromDto(UnidadDTO, Unidad.class);
        uni = IUnidadRepository.save(uni);
        return MapperUtils.DtoFromEntity(uni, UnidadDTO.class);
    }

    @Override
    public Optional<UnidadDTO> update(UnidadDTO UnidadDTO, Long id) {
        if (IUnidadRepository.findById(id).isPresent()) {
            Unidad uni = MapperUtils.EntityFromDto(UnidadDTO, Unidad.class);
            uni = IUnidadRepository.save(uni);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(uni, UnidadDTO.class));
        } else {
            return null;
        }
    }
    
}