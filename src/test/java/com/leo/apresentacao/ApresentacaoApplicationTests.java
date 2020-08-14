package com.leo.apresentacao;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.leo.apresentacao.domain.Funcionario;
import com.leo.apresentacao.services.FuncionarioService;

@SpringBootTest
class ApresentacaoApplicationTests {

	@Autowired
	private FuncionarioService service;
	
	@Test
	public void test() {
		Funcionario func = service.find(1);
		
		assertThat(func.getNome()).isEqualTo("Leo");
		
		assertThat(func.getStatus()).isEqualTo(true);
		
		assertTrue(func.getStatus());
		assertNotNull(func.getDataCadastro());
	}

}
