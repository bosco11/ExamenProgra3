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
import org.una.examen.Provincias.dto.DistritoDTO;
import org.una.examen.Provincias.entities.Distrito;
import org.una.examen.Provincias.repositories.IDistritoRepository;
import org.una.examen.Provincias.utils.ConversionLista;
import org.una.examen.Provincias.utils.MapperUtils;

/**
 *
 * @author Bosco
 */
@Service
public class DistritoServiceImplementation implements IDistritoService{

    @Autowired
    private IDistritoRepository IDistritoRepository;
    
    @Override
    public Optional<List<DistritoDTO>> findAll() {
        return (Optional<List<DistritoDTO>>) ConversionLista.findList((IDistritoRepository.findAll()), DistritoDTO.class);    }

    @Override
    public Optional<DistritoDTO> findById(Long id) {
        return (Optional<DistritoDTO>) ConversionLista.oneToDto(IDistritoRepository.findById(id), DistritoDTO.class);
    }

    @Override
    public DistritoDTO create(DistritoDTO DistritoDTO) {
        Distrito dis = MapperUtils.EntityFromDto(DistritoDTO, Distrito.class);
        dis = IDistritoRepository.save(dis);
        return MapperUtils.DtoFromEntity(dis, DistritoDTO.class);
    }

    @Override
    public Optional<DistritoDTO> update(DistritoDTO DistritoDTO, Long id) {
        if (IDistritoRepository.findById(id).isPresent()) {
            Distrito dis = MapperUtils.EntityFromDto(DistritoDTO, Distrito.class);
            dis = IDistritoRepository.save(dis);
            return Optional.ofNullable(MapperUtils.DtoFromEntity(dis, DistritoDTO.class));
        } else {
            return null;
        }
    }
    
    @Override
    @Transactional
    public void delete(Long id) {
        IDistritoRepository.deleteById(id);
    }
    
}
