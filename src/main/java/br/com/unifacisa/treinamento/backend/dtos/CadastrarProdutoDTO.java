package br.com.unifacisa.treinamento.backend.dtos;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import br.com.unifacisa.treinamento.backend.domains.Categoria;

public class CadastrarProdutoDTO implements Serializable {

	private static final long serialVersionUID = 9109101543763981430L;

//	@NotEmpty(message = "Nome Obrigatório")
//	@Size(min=5, max=40)
	@NotNull
	private String nome;

//	@NotEmpty(message = "Descrição Obrigatória")
//	@Size(min=5, max=150)
	@NotNull
	private String descricao;

	@NotNull
	private BigDecimal valor;
	
	@NotNull
	private Categoria categoria;

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
}
