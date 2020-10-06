package iterator;

import java.util.ArrayList;

public class ItPizzas {
	
ArrayList<Pizza> cardapio;
int cont;

protected ItPizzas(ArrayList<Pizza> cardapio) {
	this.cardapio = cardapio;
	cont = 0;
}

public void um() {
	cont = 0;
}

public void proximaPizza() {
	cont++;
}

public void voltarPizza() {
	cont--;
}

public boolean feito() {
	return cont == cardapio.size();
}

public Pizza itemAtual() {
	if (feito()) {
		cont = cardapio.size() - 1;
	} else if (cont < 0) {
		cont = 0;
	}
	return cardapio.get(cont);
}

public String getSaborPizza() {
	return itemAtual().sabor;
}

}
