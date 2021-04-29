package br.edu.univas.main;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class StartApp {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		String senha = null;
		
		System.out.println("Digite o tamanho mínimo da senha");
		int minLengthPassword = scanner.nextInt();
		
		System.out.println("Digite o tamanho máximo da senha");
		int maxLengthPassword = scanner.nextInt();
		
		System.out.println("Insira números, ex: 680649");
		String numbers = scanner.nextLine();
		
		System.out.println("Insira letras minusculas, ex: ausisklu");
		String lowerCaseLetters = scanner.nextLine();
		
		System.out.println("Insira letras maiusculas, ex: AHOSUSGH");
		String upperCaseLetters = scanner.nextLine();	
		
		System.out.println("Insira caracteres especiais, ex: !@#$%&*");
		String specialCharacter  = scanner.nextLine();
		
		senha = numbers + lowerCaseLetters + upperCaseLetters + specialCharacter;
				
		
		if(senha.length() >= minLengthPassword && senha.length() <= maxLengthPassword) {
			System.out.println("Digite o endereço para salvar a senha");
			String addressPassword  = scanner.nextLine();
			
			FileWriter arq = new FileWriter(addressPassword);
		    PrintWriter gravarArq = new PrintWriter(arq);

		    gravarArq.printf(senha);

		    arq.close();
		    System.out.printf("Senha gravada em", addressPassword);
		}else {
			System.out.println("Senha não contém tamanho válido.");
		}
		 
	}
}
