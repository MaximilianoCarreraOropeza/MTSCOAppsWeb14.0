package org.example.diagnosticomtsco.service.impl;

import lombok.AllArgsConstructor;
import org.example.diagnosticomtsco.model.dao.usuarioDao;
import org.example.diagnosticomtsco.model.dto.usuarioDto;
import org.example.diagnosticomtsco.model.entity.usuarioBean;
import org.example.diagnosticomtsco.service.usuarioI;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class usuarioImpl implements usuarioI {
    private final usuarioDao dao;
    @Transactional
    @Override
    public usuarioBean save(usuarioDto usuarioDto) {
        usuarioBean usuario = usuarioBean
                .builder()
                .idCliente(usuarioDto.getIdCliente())
                .nombre(usuarioDto.getNombre())
                .apellido1(usuarioDto.getApellido1())
                .apellido2(usuarioDto.getApellido2())
                .curp(usuarioDto.getCurp())
                .fechaNacimiento(usuarioDto.getFechaNacimiento())
                .build();
        return dao.save(usuario);
    }
    @Transactional(readOnly = true)
    @Override
    public usuarioBean findById(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void delete(usuarioBean usuarioBean) {
        dao.delete(usuarioBean);
    }

    @Override
    public List<usuarioBean> showAll() {
        return (List<usuarioBean>) dao.findAll();
    }
}
