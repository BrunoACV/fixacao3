package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();

		System.out.print("informe o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Informe a primeira nota do aluno: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota do aluno: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Informe a terceira nota do aluno: ");
		aluno.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", aluno.soma());
		if (aluno.soma() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", aluno.verificar());
		} else {
			System.out.println("PASS");

			sc.close();
		}
	}

}
