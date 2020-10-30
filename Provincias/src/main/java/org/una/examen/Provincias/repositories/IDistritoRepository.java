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
import org.una.examen.Provincias.entities.Distrito;

/**
 *
 * @author Bosco
 */
public interface IDistritoRepository extends JpaRepository<Distrito, Long>{
    public List<Distrito>  findByEstado(boolean estado);
    
    @Query("SELECT u FROM Distrito u LEFT JOIN u.cantonId d WHERE  d.id=:id ORDER BY u.codigo ASC")
    public List<Distrito> findCantonDistritoId(@Param("id") Long id);
}
