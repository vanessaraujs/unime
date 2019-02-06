package br.com.unifacisa.treinamento.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacisa.treinamento.backend.domains.Produto;

public interface ProdutoRespository extends JpaRepository<Produto, Long>{
	
}
