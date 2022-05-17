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

import br.com.mjv.model.Pedido;
import br.com.mjv.repository.PedidoRepository;

@RestController
@RequestMapping("pedido")
public class PedidoResource {

	@Autowired
	private PedidoRepository pedidoRepository;
	
    @GetMapping 
    public List<Pedido> listar() { 
        return pedidoRepository.findAll(); 
    }

    @GetMapping("{codigo}") 
    public Pedido buscar(@PathVariable int codigo) { 
        return pedidoRepository.findById(codigo).get(); 
    }

    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping 
    public Pedido cadastrar(@RequestBody Pedido produto) { 
        return pedidoRepository.save(produto); 
    } 

    @PutMapping("{id}") 
    public Pedido atualizar(@RequestBody Pedido produto, @PathVariable int id) { 
        produto.setCodigo(id); 
        return pedidoRepository.save(produto); 
    } 

    @DeleteMapping("{codigo}") 
    public void remover(@PathVariable int codigo) { 
    	pedidoRepository.deleteById(codigo); 
    }
}
