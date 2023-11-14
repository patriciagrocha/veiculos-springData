package br.com.patriciarocha.veiculos;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VeiculosApplication {

	private Aplicacao aplicacao;
	public static void main(String[] args) {
		SpringApplication.run(VeiculosApplication.class, args);
	}
	@Bean
	CommandLineRunner run(Aplicacao aplicacao){
		return args -> {
			aplicacao.executar();
		};
	}

}
