package fr.isep.ii1202project;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	static private AppGameContainer gameContainer;

	private static final int WIDTH = 1000;
	private static final int HEIGHT = (int) (WIDTH / 1.6);

	public static void main(String[] args) throws SlickException {
		gameContainer = new AppGameContainer(new States(), WIDTH, HEIGHT, false);
		gameContainer.start();

	}

}
