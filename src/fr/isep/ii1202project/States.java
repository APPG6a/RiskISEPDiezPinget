package fr.isep.ii1202project;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public class States extends StateBasedGame {



	public States() {
		super("RiskISEP");
	}

	@Override
	public void initStatesList(GameContainer gameContainer) throws SlickException {
		addState(new MainScreenGameState());
		addState(new MapGameState());
	}
}
