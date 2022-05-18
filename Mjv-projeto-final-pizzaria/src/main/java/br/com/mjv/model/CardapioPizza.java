package br.com.mjv.model;

import java.util.Objects;

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
	private Integer codigo;
	
	private String nome;
	
	private String descricao;
	
	private double valor;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardapioPizza other = (CardapioPizza) obj;
		return codigo == other.codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
}
