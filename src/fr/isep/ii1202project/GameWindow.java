package fr.isep.ii1202project;

import org.newdawn.slick.*;

public class GameWindow extends BasicGame {

	private static final int WIDTH = 1000;
	private static final int HEIGHT = (int) (WIDTH / 1.6);

	private GameContainer container;
	private Image background;
	private Image logo;

	public GameWindow() {
		super("RiskISEP");
	}

	public static void main(String[] args) throws SlickException {
		new AppGameContainer(new GameWindow(), WIDTH, HEIGHT, false).start();
	}

	@Override
	public void init(GameContainer container) throws SlickException {
		this.container = container;
		this.background = new Image("/res/background.png");
		this.logo = new Image("/res/logo-jeu-risk.png");
	}

	@Override
	public void render(GameContainer container, Graphics g) throws SlickException {
		background.draw(0, 0, WIDTH, HEIGHT);
		logo.draw(WIDTH/4,
				HEIGHT/2-(logo.getHeight()*(WIDTH/2)/logo.getWidth()/2),
				WIDTH / 2,
				logo.getHeight()*(WIDTH/2)/logo.getWidth());
	}

	@Override
	public void update(GameContainer container, int delta) throws SlickException {
	}

	@Override
	public void keyReleased(int key, char c) {
		if (Input.KEY_ESCAPE == key) {
			container.exit();
		}
	}
}