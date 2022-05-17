package br.com.mjv.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mjv.model.CardapioPizza;

public interface CardapioPizzaRepository extends JpaRepository<CardapioPizza, Integer>{

	List<CardapioPizza> findByNome(String card);
}
