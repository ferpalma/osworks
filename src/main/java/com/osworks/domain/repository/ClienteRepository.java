package com.osworks.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.osworks.domain.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	
	//Containing funciona como um like, busca por todos que contem algo parecido
	List<Cliente> findByNomeContaining(String nome);
	List<Cliente> findByNome(String nome);
	Cliente findByEmail(String email);
}
