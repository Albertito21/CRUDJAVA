package com.ESFE.Asistencia.servicios.interfaces;

import com.ESFE.Asistencia.entidades.Grupo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface iGrupoServices {
    Page<Grupo> BuscarTodosPaginados(Pageable pageable);
    List<Grupo> ObtenerTodos();
    Optional<Grupo> BuscarPorId(Integer id);
    Grupo CrearOeditar(Grupo grupo);
    void EliminarPorId(Integer id);

}
