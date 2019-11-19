package com.altafjava;

import com.altafjava.repository.primary.PrimaryModel;
import com.altafjava.repository.primary.PrimaryRepository;
import com.altafjava.secondary.SecondaryModel;
import com.altafjava.secondary.SecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private PrimaryRepository primaryRepository;

	@Autowired
	private SecondaryRepository secondaryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("************************************************************");
		System.out.println("Start printing mongo objects");
		System.out.println("************************************************************");
		this.primaryRepository.save(new PrimaryModel(null, "Primary database plain object"));

		this.secondaryRepository.save(new SecondaryModel(null, "Secondary database plain object"));

		List<PrimaryModel> primaries = this.primaryRepository.findAll();
		for (PrimaryModel primary : primaries) {
			System.out.println(primary.toString());
		}

		List<SecondaryModel> secondaries = this.secondaryRepository.findAll();

		for (SecondaryModel secondary : secondaries) {
			System.out.println(secondary.toString());
		}

		System.out.println("************************************************************");
		System.out.println("Ended printing mongo objects");
		System.out.println("************************************************************");

	}
}
