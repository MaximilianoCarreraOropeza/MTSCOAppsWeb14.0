package org.example.diagnosticomtsco.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@ToString
@Table(name="cliente")
public class usuarioBean {
    @Id
    @Column(name="id_cliente", nullable = false,  unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    @Column(name="nombre" , nullable = false)
    private String nombre;
    @Column(name="apellido1", nullable = false)
    private String apellido1;
    @Column(name="apellido2", nullable = false)
    private String apellido2;
    @Column(name="curp", nullable = false, unique = true)
    private String curp;
    @Column(name="fecha_nacimiento", nullable = false)
    private String fechaNacimiento;
}
