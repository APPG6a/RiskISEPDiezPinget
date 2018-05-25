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
	private int logoWidth;
	private int logoHeight;

	private StateBasedGame game;

	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		this.game = game;
		WIDTH = container.getWidth();
		HEIGHT = container.getHeight();

		this.background = new Image("/res/background.png");
		this.logo = new Image("/res/logo-jeu-risk.png");

		logoWidth = WIDTH / 2;
		logoHeight = logo.getHeight() * logoWidth / logo.getWidth();
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		background.draw(0, 0, WIDTH, HEIGHT);
		logo.draw((WIDTH - logoWidth) / 2, (HEIGHT - logoHeight) / 2, logoWidth, logoHeight);
		g.drawString("Appuyer sur une touche", WIDTH / 2 - 100, HEIGHT / 6 * 5);
	}


	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
	}

	@Override
	public void keyReleased(int key, char c) {
		game.enterState(MapGameState.ID);
	}

	@Override
	public int getID() {
		return ID;
	}
}
