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

import br.com.mjv.model.FormaPagamento;
import br.com.mjv.repository.FormaPagamentoRepository;

@RestController
@RequestMapping("pagamento")
public class FormaPagamentoResource {

	@Autowired
	private FormaPagamentoRepository pagamentoRepository;
	
    @GetMapping 
    public List<FormaPagamento> listar() { 
        return pagamentoRepository.findAll(); 
    }

    @GetMapping("{codigo}") 
    public FormaPagamento buscar(@PathVariable int codigo) { 
        return pagamentoRepository.findById(codigo).get(); 
    }

    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping 
    public FormaPagamento cadastrar(@RequestBody FormaPagamento produto) { 
        return pagamentoRepository.save(produto); 
    } 

    @PutMapping("{id}") 
    public FormaPagamento atualizar(@RequestBody FormaPagamento produto, @PathVariable int id) { 
        produto.setCodigo(id); 
        return pagamentoRepository.save(produto); 
    } 

    @DeleteMapping("{codigo}") 
    public void remover(@PathVariable int codigo) { 
    	pagamentoRepository.deleteById(codigo); 
    }
}
