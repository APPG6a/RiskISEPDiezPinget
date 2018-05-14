package fr.isep.ii1202project;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MainScreenGameState extends BasicGameState {
	public static final int ID = 1;

	private int WIDTH;
	private int HEIGHT;

	private Image background;
	private Image logo;

	private StateBasedGame game;

	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		this.game = game;
		WIDTH = container.getWidth();
		System.out.println("Width acquired : " + WIDTH);
		HEIGHT = container.getHeight();
		System.out.println("Height acquired : " + HEIGHT);
		this.background = new Image("/res/background.png");
		this.logo = new Image("/res/logo-jeu-risk.png");
	}

	/**
	 * Contenons nous d'afficher l'image de fond.
	 * Le text est placé approximativement au centre.
	 */
	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		background.draw(0, 0, WIDTH, HEIGHT);
		logo.draw(WIDTH / 4,
				HEIGHT / 2 - (logo.getHeight() * (WIDTH / 2) / logo.getWidth() / 2),
				WIDTH / 2,
				logo.getHeight() * (WIDTH / 2) / logo.getWidth());
		g.drawString("Appuyer sur une touche", WIDTH / 2 - 100, HEIGHT / 6 * 5);
	}

	/**
	 * Passer à l’écran de jeu à l'appui de n'importe quel touche.
	 */
	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
	}

	@Override
	public void keyReleased(int key, char c) {
		game.enterState(MapGameState.ID);
	}

	/**
	 * L'identifiant permet d'identifier les différentes boucles.
	 * Pour passer de l'une à l'autre.
	 */
	@Override
	public int getID() {
		return ID;
	}
}
