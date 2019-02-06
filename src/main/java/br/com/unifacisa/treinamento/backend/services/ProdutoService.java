package br.com.unifacisa.treinamento.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import br.com.unifacisa.treinamento.backend.domains.Produto;
import br.com.unifacisa.treinamento.backend.dtos.CadastrarProdutoDTO;
import br.com.unifacisa.treinamento.backend.repositories.ProdutoRespository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRespository produtoRepository;

	public Produto createProduto(CadastrarProdutoDTO cadastrarProdutoDTO) throws Exception {
		Produto produto = new Produto();
		produto.setNome(cadastrarProdutoDTO.getNome());
		produto.setDescricao(cadastrarProdutoDTO.getDescricao());
		produto.setValor(cadastrarProdutoDTO.getValor());
		produto.setCategoria(cadastrarProdutoDTO.getCategoria());
		return produtoRepository.save(produto);
	}

	public List<Produto> findAll() {
		return produtoRepository.findAll();
	}

	public Produto findById(Long id) {
		return produtoRepository.findById(id).get();
	}

	public void updateProduto(Produto produto) {
		produtoRepository.save(produto);
	}

	public void deleteProduto(Long id) {
		produtoRepository.deleteById(id);
	}

	public List<Produto> findByParam(Produto produto) {
		ExampleMatcher matcher = ExampleMatcher.matchingAll()
				.withMatcher("nome", match -> match.contains())
				.withIgnoreCase().withIgnoreNullValues();
		return produtoRepository.findAll(Example.of(produto, matcher));
	}
}
