package iterator;

import java.util.ArrayList;

public class PizzasSalgadas implements AgPizzas {
	
protected ArrayList<Pizza> cardapio;
	
	public PizzasSalgadas() {
		cardapio = new ArrayList<Pizza>();
		cardapio.add(new Pizza("Portuguesa"));
		cardapio.add(new Pizza("Frango com catupiry"));
		cardapio.add(new Pizza("Quatro Queijos"));
		
	}
	
	@Override
	public ItPizzas criarIterator() {
		return new ItPizzas(cardapio);
	}
	

}
