package iterator;

import java.util.ArrayList;

public class PizzasDoce implements AgPizzas {

	protected ArrayList<Pizza> cardapio;
	
	public PizzasDoce() {
		cardapio = new ArrayList<Pizza>();
		cardapio.add(new Pizza("Romeu e Julieta"));
		cardapio.add(new Pizza("Chocolate com Morango"));
		cardapio.add(new Pizza("Brigadeiro"));
		
	}
	
	@Override
	public ItPizzas criarIterator() {
		return new ItPizzas(cardapio);
	}
	

}
