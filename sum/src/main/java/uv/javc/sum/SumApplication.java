package uv.javc.sum;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SumApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SumApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner in = new Scanner(System.in);

		System.out.print("Ingresa primer número: ");
		int firstNumber = in.nextInt();

		System.out.print("Ingresa el segundo número: ");
		int secondNumber = in.nextInt();

		int result = firstNumber + secondNumber;
		System.out.println("La suma es: " + result);
	}
}
