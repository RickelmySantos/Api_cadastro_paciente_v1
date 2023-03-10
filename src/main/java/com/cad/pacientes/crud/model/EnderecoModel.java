package com.cad.pacientes.crud.model;

import com.cad.pacientes.crud.Dto.EnderecoDto;

import jakarta.persistence.Embeddable;

@Embeddable
public class EnderecoModel {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;

	public EnderecoModel() {
	}

	public EnderecoModel(String logradouro, String numero, String complemento, String bairro, String cidade, String uf,
			String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
	}

	public EnderecoModel(EnderecoDto dados) {
		this.logradouro = dados.logradouro();
		this.numero = dados.numero();
		this.complemento = dados.complemento();
		this.bairro = dados.bairro();
		this.cidade = dados.cidade();
		this.uf = dados.uf();
		this.cep = dados.cep();
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public void atualizarEndereco(EnderecoDto dados) {
		if (dados.logradouro() != null) {
			this.logradouro = dados.logradouro();
		}
		if (dados.numero() != null) {
			this.numero = dados.numero();
		}
		if (dados.complemento() != null) {
			this.complemento = dados.complemento();
		}
		if (dados.bairro() != null) {
			this.bairro = dados.bairro();
		}
		if (dados.cidade() != null) {
			this.cidade = dados.cidade();
		}
		if (dados.uf() != null) {
			this.uf = dados.uf();
		}
		if (dados.cidade() != null) {
			this.cidade = dados.cidade();
		}
	}

}
