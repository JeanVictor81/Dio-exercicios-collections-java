package Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ExemplosMap {
	public static void main(String[] args) {
		
		Map <String, Double> carrosPopladores = new HashMap<>() {{
			put("Gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}}; 
		System.out.println(carrosPopladores.toString());
		
		carrosPopladores.put("Gol", 15.1);
		System.out.println(carrosPopladores.toString());
		
		System.out.println("Verificar se a Tucson está no map: " + carrosPopladores.containsKey("Tucson"));
		
		System.out.println("Confira o consumo do uno: " + carrosPopladores.get("uno"));
		
		System.out.println("Exiba os modelos: " );
		Set<String> modelos = carrosPopladores.keySet();
		System.out.println(modelos.toString());
		
		System.out.println("Exiba o consumo dos caros: ");
		Collection<Double> conumo = carrosPopladores.values();
		System.out.println(conumo.toString());
		
		System.out.println("Exiba o carro mais economico: ");
		double consumoEconomico = Collections.max(carrosPopladores.values());
		Set<Map.Entry<String, Double>> entries = carrosPopladores.entrySet();
		String modeloEficiente = "";
		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(consumoEconomico)) {
				modeloEficiente = entry.getKey();
				System.out.println("Modelo mais economico: " + modeloEficiente);
			}
		}
		
		System.out.println("Exiba o carro menos economico");
		double menosEconomico = Collections.min(carrosPopladores.values());
		Set<Map.Entry<String, Double>> entries2 = carrosPopladores.entrySet();
		String modeloMenosEficiente = "";
		for(Map.Entry<String, Double> entry: entries2) {
			if(entry.getValue().equals(menosEconomico)) {
				modeloMenosEficiente = entry.getKey();
				System.out.printf("O carro(s) menos eficiente é: %s / %.2f", modeloMenosEficiente, menosEconomico );
			}
			
		}
		
		
		System.out.println("\nMostre a soma dos consumos: ");
		Iterator<Double> iterator = carrosPopladores.values().iterator();
		double soma = 0;
		while(iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		
		System.out.printf("Exiba a media: %.2f", soma/carrosPopladores.size());
		
		System.out.println("Remova os modelos com consumo igual de 15,6 km/l");
		Iterator<Double> iterator1 = carrosPopladores.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next().equals(15.6) ) {
				iterator1.remove();
				
			}
		
		}
		System.out.println(carrosPopladores);
		
		System.out.println("Exiba os carros na ordem que foram informados");
		Map<String, Double> ordemImplementada = new LinkedHashMap<>() {{
			put("Gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
			
		}};
		System.out.println(ordemImplementada);
		
		
		System.out.println("Exiba pelo modelo dos carros");
		Map<String, Double> ordemModelo = new TreeMap<>() {{
			put("Gol", 14.4);
			put("uno", 15.6);
			put("mobi", 16.1);
			put("hb20", 14.5);
			put("kwid", 15.6);
		}};
		System.out.println(ordemModelo);
		
		System.out.println("Apague o dicionario de carro");
		carrosPopladores.clear();
		
		System.out.println("Mostrar se está vazio");
		System.out.println(carrosPopladores.isEmpty());
		
	}
}
