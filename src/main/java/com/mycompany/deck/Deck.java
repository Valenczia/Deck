package com.mycompany.deck;

/**
 *
 * @author davidvalencia
 */
import java.util.ArrayList;

public class Deck {

	private final String[] PALO = {"corazones", "diamantes", "trébol", "picas"};
	private final String[] COLOR = {"rojo", "negro"};
	private final String[] VALOR = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "A", "J", "Q", "K"};

	private ArrayList<Card> deck;

	public Deck() {
		deck = new ArrayList<Card>();

		for (int palo = 0; palo < 2; palo++) 
			for (int valor = 0; valor < VALOR.length; valor++)
				deck.add(new Card(PALO[palo], COLOR[0], VALOR[valor]));

		for (int palo = 2; palo < 4; palo++) 
			for (int valor = 0; valor < VALOR.length; valor++)
				deck.add(new Card(PALO[palo], COLOR[1], VALOR[valor]));
	}
        
        public Card show() {
            // Sin revolver regresa la primera carta del deck
        }
        
        public void shuffle() {
            // Aquí debe de revolver el deck
            System.out.println("Se mezcló el Deck.");
        }
        
        public Card head() {
            shuffle();
            return show();
        }
        
        public Card pick() {
            shuffle();
            // Regreses una carta aleatorea del deck
        }
        
        public ArrayList<Card> hand() {
            shuffle();
            //Regresar las primeras 5 cartas del deck
        }
	
	public int getSize() {
		return deck.size();
	}

}
