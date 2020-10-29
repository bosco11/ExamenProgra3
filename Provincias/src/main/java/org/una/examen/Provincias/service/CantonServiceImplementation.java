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
import org.springframework.transaction.annotation.Transactional;
import org.una.examen.Provincias.dto.CantonDTO;
import org.una.examen.Provincias.entities.Canton;
import org.una.examen.Provincias.repositories.ICantonRepository;
import org.una.examen.Provincias.utils.ConversionLista;
import org.una.examen.Provincias.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class CantonServiceImplementation implements ICantonService{

    @Autowired
    private ICantonRepository ICantonRepository;
    
    @Override
    public Optional<List<CantonDTO>> findAll() {
        return (Optional<List<CantonDTO>>) ConversionLista.findList((ICantonRepository.findAll()), CantonDTO.class);    }

    @Override
    public Optional<CantonDTO> findById(Long id) {
        return (Optional<CantonDTO>) ConversionLista.oneToDto(ICantonRepository.findById(id), CantonDTO.class);
    }

    @Override
    public CantonDTO create(CantonDTO CantonDTO) {
        Canton can = MapperUtils.EntityFromDto(CantonDTO, Canton.class);
        can = ICantonRepository.save(can);
        return MapperUtils.DtoFromEntity(can, CantonDTO.class);
    }

    @Override
    public Optional<CantonDTO> update(CantonDTO CantonDTO, Long id) {
        if (ICantonRepository.findById(id).isPresent()) {
            Canton can = MapperUtils.EntityFromDto(CantonDTO, Canton.class);
            can = ICantonRepository.save(can);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(can, CantonDTO.class));
        } else {
            return null;
        }
    }
    
    @Override
    @Transactional
    public void delete(Long id) {
        ICantonRepository.deleteById(id);
    }
    
}
