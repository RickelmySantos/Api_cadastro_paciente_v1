package com.cad.pacientes.crud.Dto;

public record PacienteDto(
		String nome,
		String email,
		String telefone,
		String cpf,
		EnderecoDto endereco) {

}
