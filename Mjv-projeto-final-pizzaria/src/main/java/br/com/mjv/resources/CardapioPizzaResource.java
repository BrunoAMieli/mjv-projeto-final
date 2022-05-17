package br.com.mjv.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.mjv.model.CardapioPizza;
import br.com.mjv.repository.CardapioPizzaRepository;

@RestController
@RequestMapping("cardapio")
public class CardapioPizzaResource {

	@Autowired
	private CardapioPizzaRepository cardapioRepository;
	
    @GetMapping 
    public List<CardapioPizza> listar() { 
        return cardapioRepository.findAll(); 
    }

    @GetMapping("{codigo}") 
    public CardapioPizza buscar(@PathVariable int codigo) { 
        return cardapioRepository.findById(codigo).get(); 
    }

    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping 
    public CardapioPizza cadastrar(@RequestBody CardapioPizza produto) { 
        return cardapioRepository.save(produto); 
    } 

    @PutMapping("{id}") 
    public CardapioPizza atualizar(@RequestBody CardapioPizza produto, @PathVariable int id) { 
        produto.setCodigo(id); 
        return cardapioRepository.save(produto); 
    } 

    @DeleteMapping("{codigo}") 
    public void remover(@PathVariable int codigo) { 
    	cardapioRepository.deleteById(codigo); 
    }
}
