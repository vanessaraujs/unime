package br.com.unifacisa.treinamento.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacisa.treinamento.backend.domains.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
