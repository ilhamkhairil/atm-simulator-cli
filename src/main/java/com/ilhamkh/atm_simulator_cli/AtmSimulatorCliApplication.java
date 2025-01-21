package com.ilhamkh.atm_simulator_cli;


import com.ilhamkh.atm_simulator_cli.controller.AtmController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class AtmSimulatorCliApplication implements CommandLineRunner {

	@Autowired
	AtmController controller;

	public static void main(String[] args) {
		SpringApplication.run(AtmSimulatorCliApplication.class, args);
	}

	@Override
	public void run(String... args) {
		controller.doProcess(System.in, System.out);
	}
}
