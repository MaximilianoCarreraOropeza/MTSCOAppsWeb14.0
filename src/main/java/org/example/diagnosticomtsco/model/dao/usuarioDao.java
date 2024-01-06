package org.example.diagnosticomtsco.model.dao;

import org.example.diagnosticomtsco.model.entity.usuarioBean;
import org.springframework.data.repository.CrudRepository;

public interface usuarioDao extends CrudRepository<usuarioBean, Integer> {
}
