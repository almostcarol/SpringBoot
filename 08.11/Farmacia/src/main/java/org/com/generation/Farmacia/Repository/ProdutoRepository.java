package org.com.generation.Farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import org.com.generation.Farmacia.Model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List <Produto> findAllByNomeContainingIgnoreCase(String nome);
	 
	public List <Produto> findByNomeAndLaboratorio(String nome, String laboratorio);
	
	public List <Produto> findByNomeOrLaboratorio(String nome, String laboratorio);

}