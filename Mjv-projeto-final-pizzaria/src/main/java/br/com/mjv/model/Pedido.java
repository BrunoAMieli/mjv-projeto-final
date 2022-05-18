package br.com.mjv.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.Data;

@Data
@Entity
@SequenceGenerator(name = "pedido", sequenceName = "SQ_PEDIDO", allocationSize = 1)
public class Pedido {

	@Id
	@GeneratedValue(generator = "pedido", strategy = GenerationType.SEQUENCE)
	private int codigo;
	
	@NotBlank(message = "Nome obrigatório.")
	@Size(max = 200)
	@NotNull
	private String nomeCompleto;
	
	@NotBlank(message = "Digite o número de telefone.")
	@NotNull
	private String telefone;
	
	@NotBlank(message = "Por favor, digite o nome da rua.")
	@NotNull
	private String rua;
	
	@NotBlank(message = "Campo número deve ser preenchido.")
	@NotNull
	private String numero;
	
	private String complemento;
	
	@NotNull
	@Pattern(regexp = "\\d{5}-\\d{3}", message = "Formato inválido para o CEP.")
	private String cep;
	
	@NotNull
	@ManyToOne
	private CardapioPizza cardapio;
	
	@NotNull
	@ManyToOne
	private FormaPagamento pagamento;
	
	@Size(max = 300)
	private String observacao;
	
	@JsonIgnore
	private LocalDate timeDate = LocalDate.now();
	
	@JsonIgnore
	private LocalTime time = LocalTime.now();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return codigo == other.codigo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}
	
}
