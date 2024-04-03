package uv.javc.introduction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Excelent! you are the best!!!");
		
	}
}
