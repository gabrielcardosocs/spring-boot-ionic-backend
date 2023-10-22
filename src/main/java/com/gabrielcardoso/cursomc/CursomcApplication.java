package com.gabrielcardoso.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

import com.gabrielcardoso.cursomc.domain.Categoria;
import com.gabrielcardoso.cursomc.repositories.CategoriaRepository;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class CursomcApplication implements CommandLineRunner{

	@Autowired
	private  CategoriaRepository categoriaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		categoriaRepository.save(Arrays.asList(cat1,cat2));
		
	}

}