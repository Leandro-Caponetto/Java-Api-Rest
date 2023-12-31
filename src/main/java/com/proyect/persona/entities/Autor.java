package com.proyect.persona.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
@Schema(name = "Autor", description = "Metodo representa a el autor de los libros")
public class Autor extends Base {

    @Column(name = "nombre")
    @Schema(name = "nombre", required = true,example = "Leandro", description = "En este campo requiere el Nombre Autor del libro")
    private String nombre;

    @Schema(name = "apellido", required = true,example = "Caponetto", description = "En este campo requiere el Apellido Autor del libro")
    @Column(name = "apellido")
    private String apellido;

    @Column(name = "biografia", length = 1500)
    @Schema(name = "biografia", required = true,example = "Sus obras más conocidas incluyen La Metamorfosis.....", description = "En este campo requiere el Apellido Autor del libro")
    private String biografia;
}
