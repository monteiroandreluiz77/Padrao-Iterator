package iterator;

public class Main {

	public static void main(String[] args) {
	AgPizzas pizzasSalgadas = new PizzasSalgadas();
	System.out.println("Pizzas Salgadas: \n");
	for (ItPizzas it = pizzasSalgadas.criarIterator(); !it.feito(); it.proximaPizza()) {
		System.out.println(it.itemAtual().sabor);
	}
	
	AgPizzas pizzasDoce = new PizzasDoce();
	System.out.println("Pizzas Doce: \n");
	for (ItPizzas it = pizzasDoce.criarIterator(); !it.feito(); it.proximaPizza()) {
		System.out.println(it.itemAtual().sabor);

	}

  }
}