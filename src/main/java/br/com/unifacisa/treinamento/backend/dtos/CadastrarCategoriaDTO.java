package br.com.unifacisa.treinamento.backend.dtos;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class CadastrarCategoriaDTO implements Serializable {

	private static final long serialVersionUID = 7911605164677577051L;
	
	@NotEmpty(message = "O nome da categoria é obrigatório")
	@Size(min=4, max=20)
	private String nome;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
}
