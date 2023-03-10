package com.cad.pacientes.crud.Dto;

import jakarta.validation.constraints.NotBlank;

public record EnderecoDto(
		@NotBlank
		String logradouro,
		String numero,
		String complemento,
		@NotBlank
		String bairro,
		@NotBlank
		String cidade,
		@NotBlank
		String uf,
		@NotBlank
		String cep) {

}
