package com.cad.pacientes.crud.Dto;

import jakarta.validation.constraints.NotNull;

public record AtualizarPacienteDto(@NotNull  Long id, String nome, String telefone, EnderecoDto endereco) {

}
