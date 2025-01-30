package com.example.anujTutorial.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnujTutorialApplication implements CommandLineRunner {

	@Autowired
	DB db;

	public static void main(String[] args) {
		SpringApplication.run(AnujTutorialApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

//		db = new ProdDb();
		System.out.println((db.getData()));
	}
}
