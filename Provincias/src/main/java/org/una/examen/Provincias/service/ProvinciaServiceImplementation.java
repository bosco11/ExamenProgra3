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
import org.una.examen.Provincias.dto.ProvinciaDTO;
import org.una.examen.Provincias.entities.Provincia;
import org.una.examen.Provincias.repositories.IProvinciaRepository;
import org.una.examen.Provincias.utils.ConversionLista;
import org.una.examen.Provincias.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class ProvinciaServiceImplementation implements IProvinciaService{

    @Autowired
    private IProvinciaRepository IProvinciaRepository;
    
    @Override
    public Optional<List<ProvinciaDTO>> findAll() {
        return (Optional<List<ProvinciaDTO>>) ConversionLista.findList((IProvinciaRepository.findAll()), ProvinciaDTO.class);    }

    @Override
    public Optional<ProvinciaDTO> findById(Long id) {
        return (Optional<ProvinciaDTO>) ConversionLista.oneToDto(IProvinciaRepository.findById(id), ProvinciaDTO.class);
    }

    @Override
    public ProvinciaDTO create(ProvinciaDTO provincia) {
        Provincia pro = MapperUtils.EntityFromDto(provincia, Provincia.class);
        pro = IProvinciaRepository.save(pro);
        return MapperUtils.DtoFromEntity(pro, ProvinciaDTO.class);
    }

    @Override
    public Optional<ProvinciaDTO> update(ProvinciaDTO provincia, Long id) {
        if (IProvinciaRepository.findById(id).isPresent()) {
            Provincia pro = MapperUtils.EntityFromDto(IProvinciaRepository, Provincia.class);
            pro = IProvinciaRepository.save(pro);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(pro, ProvinciaDTO.class));
        } else {
            return null;
        }
    }
    
}