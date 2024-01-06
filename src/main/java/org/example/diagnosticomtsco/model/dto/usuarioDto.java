package org.example.diagnosticomtsco.model.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class usuarioDto {
    private Integer idCliente;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String curp;
    private String fechaNacimiento;
}
