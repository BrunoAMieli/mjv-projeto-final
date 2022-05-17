package br.com.mjv.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mjv.model.Pedido;


public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

	List<Pedido> findByNomeCompleto(String ped);
	
}
