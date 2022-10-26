package Atividade1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
	public static void main(String[] args) {
		List<Double> nota = new ArrayList<>(Arrays.asList());
		nota.add(7d);
		nota.add(8.5);
		nota.add(9.3);
		nota.add(5.0);
		nota.add(7.0);
		nota.add(0.0);
		nota.add(3.6);
		System.out.println(nota.toString());
		System.out.println(nota.indexOf(5.0));
		
		nota.add(4, 8d);
		
		System.out.println(nota);
		
		nota.set(nota.indexOf(5d), 6d);
		System.out.println(nota);
		
		System.out.println("Conferir se a nota 5 está na lista: " + nota.contains(5d));
		for(Double notas: nota) System.out.println(notas);
		
		System.out.println("Exibir a nota da posição 3° :" + nota.get(2));
		
		System.out.println("Exibir a menor nota: " + Collections.min(nota));
		System.out.println("Exibir a maior nota: " + Collections.max(nota));
		
		Iterator<Double> iterator = nota.iterator();
		double soma = 0;
		
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma+=next;
		}
		System.out.printf("\nSoma de valores: %f", soma);
		System.out.printf("\nSoma de valores: %.3f", soma/nota.size());
		
		System.out.println("Remover a nota 0");
		nota.remove(0d);
		System.out.println(nota);
		
		System.out.println("Remover as notas menores que 7");
	
		Iterator<Double> iterator1 = nota.iterator();
		
		while(iterator1.hasNext()) {
			double next1 = iterator1.next();
			if(next1 < 7) iterator1.remove();
			
		}
		System.out.println(nota);
		
		System.out.println("Apagar a lista");
		nota.clear();
		System.out.println(nota);
		
	}
	
	
}
