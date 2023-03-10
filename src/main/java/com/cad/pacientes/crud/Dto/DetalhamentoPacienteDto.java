package com.cad.pacientes.crud.Dto;

import com.cad.pacientes.crud.model.EnderecoModel;
import com.cad.pacientes.crud.model.PacienteModel;

public record DetalhamentoPacienteDto(Long id, String nome, String email, String telefone, String cpf, EnderecoModel endereco) {

	public DetalhamentoPacienteDto(PacienteModel paciente) {
		this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getTelefone(), paciente.getCpf(), paciente.getEndereco());
	}
}
