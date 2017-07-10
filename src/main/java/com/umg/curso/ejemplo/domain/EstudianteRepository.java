package com.umg.curso.ejemplo.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ore on 10/07/17.
 */
public interface EstudianteRepository extends JpaRepository<Estudiante,Long> {
}
