import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PokemonAdded implements ActionListener {

	private MainPanel panel;
	
	public PokemonAdded(MainPanel vue) {
		panel = vue;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Card card = new Pokemon(panel.getName(), "pokemon", Integer.parseInt(panel.getLifePoints()), panel.getFirstElement(), panel.getSecondElement(), 0);
		Deck deck = new Deck();
		deck.addCard(card);
		
		System.out.println(card);
	}
}
