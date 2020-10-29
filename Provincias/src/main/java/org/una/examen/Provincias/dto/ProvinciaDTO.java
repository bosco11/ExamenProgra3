
package org.una.examen.Provincias.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author Bosco
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProvinciaDTO {
    private Long id;
    private String nombreProvincia;
    private String codigo;
    private boolean estado;
}
