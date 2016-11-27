package concurso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Candidato> lista = new ArrayList<>();

		lista.add(new Candidato(80, true, 40));
		lista.add(new Candidato(80, false, 30));
		lista.add(new Candidato(80, false, 20));
		lista.add(new Candidato(90, false, 20));

		Collections.sort(lista);

		for (Candidato c : lista) {
			System.out.println(c);
		}

	}

}
