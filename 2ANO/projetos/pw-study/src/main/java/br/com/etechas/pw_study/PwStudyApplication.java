package br.com.etechas.pw_study;
// Matheus Bernardino
// João Pedro Correia
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class PwStudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(PwStudyApplication.class, args);
	}

}
