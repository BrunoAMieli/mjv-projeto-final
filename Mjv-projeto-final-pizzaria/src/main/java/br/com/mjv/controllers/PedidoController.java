package br.com.mjv.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.mjv.model.Pedido;
import br.com.mjv.repository.CardapioPizzaRepository;
import br.com.mjv.repository.FormaPagamentoRepository;
import br.com.mjv.repository.PedidoRepository;

@Controller
@RequestMapping("pedido")
public class PedidoController {

	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private CardapioPizzaRepository cardapioRepository;
	
	@Autowired
	private FormaPagamentoRepository pagamentoRepository;
	
	@GetMapping("home")
	public String paginaInicial() {
		return "pedido/home";
	}
	
    @GetMapping("cadastrar") 
    public String abrirFormulario(Pedido pedido, Model model){ 
        model.addAttribute("cardapios", cardapioRepository.findAll());
        model.addAttribute("pagamentos", pagamentoRepository.findAll());
        return "pedido/cadastrarPedido"; 
    }
    
    @PostMapping("cadastrar") 
    public String cadastrarPedido(@Valid Pedido pedido, BindingResult result, RedirectAttributes redirectAttributes){ 
        if(result.hasErrors()) { 
            return "pedido/cadastrarPedido"; 
        } 

        redirectAttributes.addFlashAttribute("msg", "Pedido realizado! Previsão de entrega é de 25 a 40 minutos."); 
        pedidoRepository.save(pedido); 
        return "redirect:listar"; 
    }
    
    @GetMapping("listar") 
    public String listarPedidos(Model model){ 
        model.addAttribute("pedidos", pedidoRepository.findAll()); 
        return "pedido/listarPedido"; 
    }
    
    @GetMapping("cardapio") 
    public String listarCardapio(Model model){ 
        model.addAttribute("cardapio", cardapioRepository.findAll()); 
        return "cardapio/listarCardapio"; 
    } 

    @GetMapping("editar/{id}") 
    public String editar(@PathVariable("id") int codigo, Model model){ 
        model.addAttribute("pedido",pedidoRepository.findById(codigo)); 
        return "pedido/cadastrarPedido"; 
    } 
    
    @PostMapping("excluir") 
    public String remover(int codigo, RedirectAttributes redirectAttributes) { 
        redirectAttributes.addFlashAttribute("err", "Pedido cancelado!"); 
        pedidoRepository.deleteById(codigo); 
        return "redirect:listar"; 
    } 
}
