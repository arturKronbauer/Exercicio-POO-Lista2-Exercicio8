package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import entidade.Alugar;
import servicos.ComparadorDeQuartos;

public class Programa {

	private static final int T = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List <Alugar> lista = new ArrayList<>();
		System.out.print("Quantos quartos serão alugados? ");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Aluguel #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			lista.add(new Alugar(nome, email, quarto));
		}
		
		/* O método sort permite ordenar a lista de acordo
		com algum critério definido na classe que irá implementar
		a interface Comparetor */
		
		Collections.sort(lista, new ComparadorDeQuartos());
		
		System.out.println();
		System.out.println("Quartos ocupados:");
		for (Alugar x: lista) {
			System.out.println(x);
		}
		sc.close();
	}
}
