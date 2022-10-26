package Execicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaAplicação {
	static List<Double> temperaturas = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("--- Escolha uma opção ---");
		do {
			System.out.println("\n1 - Adicionar Temperatura");
			System.out.println("2 - Ver Temperaturas");
			System.out.println("3 - Ver a média da temperatura");
			System.out.println("4 - Ver Temperaturas acima da media");
			System.out.println("0 - Finalizar ");
			System.out.print("\nOpição: ");
			int escolha = sc.nextInt();
			switch (escolha) {
			case 1:
				adicionarTemperatura();
				break;
			case 2:
				verTemperatuas();
				break;
			case 3:
				calcularMediaTemperatura();
				break;
			case 4:
				TemperaturasAcimaMedia();
				break;
			case 0:
				break;
			default:
				return;
			}
					
			
		}while(true);
		
	}
	public static void adicionarTemperatura() {
		if(temperaturas.size() == 6) {
			System.out.println("Limite alcançado");
			return;
		}
		System.out.println("\nDigite a temperatura");
		double temp = sc.nextDouble();
		temperaturas.add(temp);
		
	}
	public static void verTemperatuas() {
		for(Double temp: temperaturas) {
			System.out.println(temp);
			
		}
		
		
	}
	public static void calcularMediaTemperatura() {
		if(temperaturas.size() < 6) {
			System.out.println("Dados insuficientes");
			return;
		}
		Iterator<Double> iterator = temperaturas.iterator();
		double soma = 0;
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		System.out.printf("Media das teperaturas foram: %.3f", soma/temperaturas.size() );
		
	}
	public static void TemperaturasAcimaMedia() {
		Iterator<Double> iterator = temperaturas.iterator();
		double soma = 0;
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma += next;
		}
		Iterator<Double> iterator2 = temperaturas.iterator();
		double media = soma/temperaturas.size();
		while(iterator2.hasNext()) {
			double next = iterator2.next();
			if(next >media){
				if (next > media) {
					switch (temperaturas.indexOf(next)) {
					case (0):
						System.out.printf("1 - janeiro: %.1f\n ", next);
					break;
					case (1):
						System.out.printf("2 - fevereiro: %.1f\n", next);
					break;
					case (2):
						System.out.printf("3 - março: %.1f\n", next);
					break;
					case (3):
						System.out.printf("4 - abril: %.1f\n", next);
					break;
					case (4):
						System.out.printf("5 - maio: %.1f\n", next);
					break;
					case (5):
						System.out.printf("6 - junho: %.1f\n", next);
					break;
					default:
						System.out.println("Não houve temperatura acima da média.");
					}
				}
				
			}
			
		}
	}
}
