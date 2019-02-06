package br.com.unifacisa.treinamento.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.unifacisa.treinamento.backend.domains.Categoria;
import br.com.unifacisa.treinamento.backend.dtos.CadastrarCategoriaDTO;
import br.com.unifacisa.treinamento.backend.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria createCategoria(CadastrarCategoriaDTO cadastrarCategoriaDTO) {
		Categoria categoria = new Categoria();
		categoria.setNome(cadastrarCategoriaDTO.getNome());
		return categoriaRepository.save(categoria);
	}

	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}

	public Categoria findById(Long id) {
		return categoriaRepository.findById(id).get();
	}

	public Categoria findByNome(String nome) {
		Categoria categoria = categoriaRepository.findByNome(nome);
		return categoria;
	}

	public void updateCategoria(Categoria categoria) {
		categoriaRepository.save(categoria);
	}

	public void deleteCategoria(Long id) {
		categoriaRepository.deleteById(id);
	}
}
