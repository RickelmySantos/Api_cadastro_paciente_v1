package com.cad.pacientes.crud.Dto;

import com.cad.pacientes.crud.model.PacienteModel;

public record PacienteDadosDto(Long id, String nome, String email, String cpf) {
	
	public 	PacienteDadosDto(PacienteModel paciente) {
		this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf());
	}

}
