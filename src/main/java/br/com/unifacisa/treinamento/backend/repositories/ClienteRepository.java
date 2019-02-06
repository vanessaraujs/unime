package br.com.unifacisa.treinamento.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacisa.treinamento.backend.domains.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
