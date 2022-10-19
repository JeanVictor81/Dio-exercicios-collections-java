package Atividade2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenaçãoList {
	public static void main(String[] args) {
		List<Gato> gatos = new ArrayList<>() {{
			add(new Gato("Jon", 18, "Preto"));
			add(new Gato("Simba", 6, "Tigrado"));
			add(new Gato("Jon", 12, "Amarelo"));
		}};
		
		System.out.println("--- Ordem de inserção ---");
		for(Gato gato: gatos) System.out.println(gato);
		
		System.out.println("--- Ordem Aleatoria ---");
		Collections.shuffle(gatos);
		System.out.println(gatos);
		
		
		System.out.println("--- Ordem natural ---");
		Collections.sort(gatos);
		System.out.println(gatos);
		
		System.out.println("--- Ordenar por Idade ---");
		gatos.sort(new ComparatorIdade());
		System.out.println(gatos);
		
		System.out.println("--- Ordenar por comer ---");
		gatos.sort(new ComparatorCor());
		System.out.println(gatos);
		
		System.out.println("--- Ordenar por Nome/Cor/Idade ---");
		gatos.sort(new ComparatorNomeCorIdade());
		System.out.println(gatos);
		
	}
}
