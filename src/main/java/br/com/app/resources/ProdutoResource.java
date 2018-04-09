package br.com.app.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="produtos")
public class ProdutoResource {

	@RequestMapping(method=RequestMethod.GET)
	public String listarProdutos() {
		return "produtos";
	}
}
