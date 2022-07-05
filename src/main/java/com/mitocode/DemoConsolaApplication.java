package com.mitocode;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mitocode.service.IPersonaService;
import com.mitocode.service.IPersonaServiceImpl;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner{
	
	private static Logger LOG = (Logger) LoggerFactory.getLogger(DemoConsolaApplication.class);
	
	@Autowired
	private IPersonaService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola desde consola en spring boot");
		LOG.info("Hola desde un log");
		LOG.warn("Adios desde un log");
	
		service.registrar("MitoCode");
	}

}
