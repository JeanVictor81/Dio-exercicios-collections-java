package Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Ordenacao {
	public static void main(String[] args) {
		
		Map <String, Livro> livros = new HashMap<>() {{
			put("Machado de Assis", new Livro("memorias prostumas", 115));
			put("Stephen Halking", new Livro("Breves respostas", 256));
			put("Stephen halking", new Livro("Buracos negros", 65));
		}};
		
		for(Map.Entry<String, Livro> livrinho: livros.entrySet()) System.out.println(livrinho);;
		
		System.out.println("ordem de inseção");
		Map<String, Livro> livros1 = new LinkedHashMap<>() {{
			put("Machado de Assis", new Livro("memorias prostumas", 115));
			put("Stephen Halking", new Livro("Breves respostas", 256));
			put("Stephen halking", new Livro("Buracos negros", 65));
		}};
		for(Map.Entry<String, Livro> livrinho: livros1.entrySet()) System.out.println(livrinho);;
		
		System.out.println("Ordem alfabetica");
		Map<String, Livro> livros2 = new TreeMap<>(livros1);
		for(Map.Entry<String, Livro> livrinho: livros2.entrySet()) System.out.println(livrinho);;
		
		System.out.println("Ordem Alfabetica");
		Set<Map.Entry<String, Livro>> livros3 = new TreeSet(new ComapreNome());
		livros3.addAll(livros.entrySet());
		for(Map.Entry<String, Livro> livrinho: livros3) System.out.println(livrinho);;

		
	}
}	


class Livro{
	private String nome;
	private Integer paginas;
	
	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	@Override
	public String toString() {
		return "[nome=" + nome + ", paginas=" + paginas + "]";
	}
	
	
}



class ComapreNome implements Comparator<Map.Entry<String, Livro>>{

	@Override
	public int compare(Entry<String, Livro> l1, Entry<String, Livro> l2) {
		
		return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
	}
	
	
	
	
	
}