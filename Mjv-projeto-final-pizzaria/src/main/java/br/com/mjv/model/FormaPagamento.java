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
public class FormaPagamento {

	@Id
	@SequenceGenerator(name = "pagamento", sequenceName = "SQ_FORMA_PAGAMENTO", allocationSize = 1)
	@GeneratedValue(generator = "pagamento", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	private String nome;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormaPagamento other = (FormaPagamento) obj;
		return codigo == other.codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
}
