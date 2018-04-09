package br.com.app.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.app.domain.Categoria;

@RestController
@RequestMapping(value="categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listarProdutos() {
		Categoria cat1 = new Categoria(1, "Informática"); 
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}