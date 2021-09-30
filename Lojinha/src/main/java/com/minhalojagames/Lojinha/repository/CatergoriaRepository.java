package com.minhalojagames.Lojinha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.minhalojagames.Lojinha.model.Categoria;

@Repository
public interface CatergoriaRepository extends JpaRepository<Categoria, Long>{
	
	public List <Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
