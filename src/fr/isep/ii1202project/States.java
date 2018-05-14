package fr.isep.ii1202project;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class States extends StateBasedGame {

	private static final int WIDTH = 1000;
	private static final int HEIGHT = (int) (WIDTH / 1.6);

	public static void main(String[] args) throws SlickException{
		new AppGameContainer(new States(), WIDTH, HEIGHT, false).start();

	}

	public States() {
		super("RiskISEP");
	}

	@Override
	public void initStatesList(GameContainer gameContainer) throws SlickException {
		addState(new MainScreenGameState());
		addState(new MapGameState());
	}
}
