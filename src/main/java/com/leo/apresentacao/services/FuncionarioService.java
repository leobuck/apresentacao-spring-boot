package com.leo.apresentacao.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leo.apresentacao.domain.Funcionario;
import com.leo.apresentacao.repositories.FuncionarioRepository;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository repo;
	
	public Funcionario find(Integer id) {
		Optional<Funcionario> obj = repo.findById(id);
		
		return obj.orElse(null);
	}
	
	public List<Funcionario> findAll() {
		return repo.findAll();
	}
	
	public void insert(Funcionario obj) {
		obj.setId(null);
		repo.save(obj);
	}
	
	public Funcionario update(Funcionario obj) {
		return repo.save(obj);
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
