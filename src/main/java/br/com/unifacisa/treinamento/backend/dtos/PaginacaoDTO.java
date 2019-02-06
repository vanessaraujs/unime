package br.com.unifacisa.treinamento.backend.dtos;

import java.util.List;

public class PaginacaoDTO {
	
	private Integer paginaAtual;
	private Integer paginaFinal;
	private Integer proximaPagina;
	private Integer paginaAnterior;
	private Integer quantidadePaginas;
	private List<?> listagem;
	
	public Integer getPaginaAtual() {
		return paginaAtual;
	}
	public void setPaginaAtual(Integer paginaAtual) {
		this.paginaAtual = paginaAtual;
	}
	public Integer getPaginaFinal() {
		return paginaFinal;
	}
	public void setPaginaFinal(Integer paginaFinal) {
		this.paginaFinal = paginaFinal;
	}
	public Integer getProximaPagina() {
		return proximaPagina;
	}
	public void setProximaPagina(Integer proximaPagina) {
		this.proximaPagina = proximaPagina;
	}
	public Integer getPaginaAnterior() {
		return paginaAnterior;
	}
	public void setPaginaAnterior(Integer paginaAnterior) {
		this.paginaAnterior = paginaAnterior;
	}
	public Integer getQuantidadePaginas() {
		return quantidadePaginas;
	}
	public void setQuantidadePaginas(Integer quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	public List<?> getListagem() {
		return listagem;
	}
	public void setListagem(List<?> listagem) {
		this.listagem = listagem;
	}
}
