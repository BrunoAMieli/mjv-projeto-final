package br.com.mjv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class FormaPagamento {

	@Id
	@SequenceGenerator(name = "pagamento", sequenceName = "SQ_FORMA_PAGAMENTO", allocationSize = 1)
	@GeneratedValue(generator = "pagamento", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nome;
}
