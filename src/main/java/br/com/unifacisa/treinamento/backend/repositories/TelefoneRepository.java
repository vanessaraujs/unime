package br.com.unifacisa.treinamento.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unifacisa.treinamento.backend.domains.Telefone;

public interface TelefoneRepository extends JpaRepository<Telefone, Long> {

}
