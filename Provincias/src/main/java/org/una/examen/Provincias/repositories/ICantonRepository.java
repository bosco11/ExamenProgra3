/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.una.examen.Provincias.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.una.examen.Provincias.entities.Canton;

/**
 *
 * @author Bosco
 */
public interface ICantonRepository extends JpaRepository<Canton, Long>{
    public List<Canton>  findByEstado(boolean estado);
    
    @Query("SELECT u FROM Canton u LEFT JOIN u.provinciaId d WHERE  d.id=:id ORDER BY u.codigo ASC")
    public List<Canton> findProvinciaCantonId(@Param("id") Long id);
}
