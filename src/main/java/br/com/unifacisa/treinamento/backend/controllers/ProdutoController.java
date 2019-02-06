package br.com.unifacisa.treinamento.backend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.unifacisa.treinamento.backend.domains.Produto;
import br.com.unifacisa.treinamento.backend.dtos.CadastrarProdutoDTO;
import br.com.unifacisa.treinamento.backend.services.ProdutoService;
import io.swagger.annotations.ApiOperation;

@Controller
@RequestMapping("/produtos")
public class ProdutoController {

	@Autowired
	private ProdutoService produtoService;

	@ApiOperation(value = "Lista Todos os Produtos")
	@GetMapping
	public ResponseEntity<List<Produto>> findAll() {
		return new ResponseEntity<List<Produto>>(produtoService.findAll(), HttpStatus.OK);
	}

	@ApiOperation(value = "Lista Produto Pelo Id")
	@GetMapping(value = "{id}")
	public ResponseEntity<Produto> findById(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<Produto>(produtoService.findById(id), HttpStatus.OK);
	}

	@ApiOperation(value = "Insere um Produto")
	@RequestMapping(value = "novo", method = RequestMethod.POST)
	public ResponseEntity<Produto> createProduto(@Valid @RequestBody CadastrarProdutoDTO produto) throws Exception {
		produtoService.createProduto(produto);
		return new ResponseEntity<Produto>(HttpStatus.CREATED);
	}

	@ApiOperation(value = "Altera um Produto")
	@PutMapping(value = "{id}")
	public ResponseEntity<Produto> updateProduto(@RequestBody Produto produto) {
		produtoService.updateProduto(produto);
		return new ResponseEntity<Produto>(HttpStatus.OK);
	}

	@ApiOperation("Deleta um Produto")
	@DeleteMapping(value = "{id}")
	public ResponseEntity<Produto> deleteProduto(@PathVariable(name = "id") Long id) {
		produtoService.deleteProduto(id);
		return new ResponseEntity<Produto>(HttpStatus.OK);
	}
	
	@ApiOperation(value = "Lista Produto Pelo Nome")
	@GetMapping(value = "buscaNome")
	public ResponseEntity<List<Produto>> findByParam(Produto produto) {
		return new ResponseEntity<List<Produto>>(produtoService.findByParam(produto), HttpStatus.OK);
	}
}
