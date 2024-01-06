package org.example.diagnosticomtsco.service;

import org.example.diagnosticomtsco.model.dto.usuarioDto;
import org.example.diagnosticomtsco.model.entity.usuarioBean;

import java.util.List;

public interface usuarioI {
    usuarioBean save(usuarioDto usuarioDto);
    usuarioBean findById(Integer id);
    void delete(usuarioBean usuarioBean);
    List<usuarioBean> showAll();
}
