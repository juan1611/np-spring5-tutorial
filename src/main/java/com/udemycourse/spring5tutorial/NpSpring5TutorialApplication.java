package com.udemycourse.spring5tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {NpSpring5TutorialApplication.class//,
	/*OtraClase.class*/	})

public class NpSpring5TutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(NpSpring5TutorialApplication.class, args);
	}
}
