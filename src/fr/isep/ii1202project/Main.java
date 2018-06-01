package fr.isep.ii1202project;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;

public class Main {

	static private AppGameContainer gameContainer;

	private static final int WIDTH = 1920;
	private static final int HEIGHT = 1080;

	public static void main(String[] args) throws SlickException {
		gameContainer = new AppGameContainer(new States(), WIDTH, HEIGHT, true);
		gameContainer.start();

	}

}
