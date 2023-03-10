package com.cad.pacientes.crud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cad.pacientes.crud.model.PacienteModel;

public interface PacienteRepository extends JpaRepository<PacienteModel, Long>{

}
