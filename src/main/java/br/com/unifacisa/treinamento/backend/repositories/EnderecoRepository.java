package br.com.unifacisa.treinamento.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacisa.treinamento.backend.domains.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

}
