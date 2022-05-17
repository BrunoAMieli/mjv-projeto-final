package br.com.mjv.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Data
@Entity
public class CardapioPizza {

	@Id
	@SequenceGenerator(name = "cardapio", sequenceName = "SQ_CARDAPIO", allocationSize = 1)
	@GeneratedValue(generator = "cardapio", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nome;
	
	private String descricao;
	
	private double valor;
	
}
