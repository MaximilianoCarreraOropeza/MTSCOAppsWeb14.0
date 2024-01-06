package org.example.diagnosticomtsco.controller;

import lombok.AllArgsConstructor;
import org.example.diagnosticomtsco.model.dto.usuarioDto;
import org.example.diagnosticomtsco.model.entity.usuarioBean;
import org.example.diagnosticomtsco.service.usuarioI;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("/cliente")
public class usuarioController {
    private final usuarioI service;
    @PostMapping("/create")
    public usuarioDto create(@RequestBody usuarioDto usuariDto){
        usuarioBean cliente = service.save(usuariDto);
        return usuarioDto.builder().
                idCliente(cliente.getIdCliente()).
                nombre(cliente.getNombre()).
                apellido1(cliente.getApellido1()).
                apellido2(cliente.getApellido2()).
                fechaNacimiento(cliente.getFechaNacimiento()).
                curp(cliente.getCurp()).build();
    }
    @PutMapping("/update")
    public usuarioDto update(@RequestBody usuarioDto usuariDto){
        usuarioBean cliente = service.save(usuariDto);
        return usuarioDto.builder().
                idCliente(cliente.getIdCliente()).
                nombre(cliente.getNombre()).
                apellido1(cliente.getApellido1()).
                apellido2(cliente.getApellido2()).
                fechaNacimiento(cliente.getFechaNacimiento()).
                curp(cliente.getCurp()).build();
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        Map<String, Object> response = new HashMap<>();
        try{
            usuarioBean cliente = service.findById(id);
            service.delete(cliente);
            return new ResponseEntity<>(cliente, HttpStatus.OK);
        }catch(DataAccessException D){
            response.put("msj",D.getMessage());
            response.put("cliente: ",null);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getAll")
    public List<usuarioBean> findAll(){
        return service.showAll();
    }

}
