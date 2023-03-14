package servicos;

import java.util.Comparator;

import entidade.Alugar;

/* esta classe implementa a interface Comparator e permite
	ordenar a lista <Alugar> pelo número do quarto */ 

public class ComparadorDeQuartos implements Comparator<Alugar>{
	public int compare(Alugar o1, Alugar o2) {
        if (o1.quarto < o2.quarto) {
        	return -1;
        }
        else {
        	if (o1.quarto > o2.quarto) {
        		return +1;
        	}
            else return 0;
        }	
    }
}
