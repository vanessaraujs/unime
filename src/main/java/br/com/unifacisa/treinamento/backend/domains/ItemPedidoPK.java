package br.com.unifacisa.treinamento.backend.domains;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemPedidoPK implements Serializable{

	private static final long serialVersionUID = 8866190305826105387L;

	@ManyToOne
	private Pedido pedido;
	
	@ManyToOne
	private Produto protudo;
	
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProtudo() {
		return protudo;
	}
	public void setProtudo(Produto protudo) {
		this.protudo = protudo;
	}
}
