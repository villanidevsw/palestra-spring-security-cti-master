package com.algaworks.gp.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

//@Configuration
public class InMemorySecurityConfig {
	//cria e configura um usuario em memória para
	//acessar a aplicacao
	//o usuario tem as credenciais de acesso
	// mas para acessar as funcionalidades precisa
	// dos roles
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
			.withUser("carlos").password("123").roles("PG_PROJETOS", "PG_REL_CUSTOS", "PG_REL_EQUIPE")
			.and()
			.withUser("flavio").password("123").roles("PG_PROJETOS", "PG_REL_EQUIPE");
	}

}
