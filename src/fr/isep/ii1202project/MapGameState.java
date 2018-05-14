package fr.isep.ii1202project;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MapGameState extends BasicGameState {
	public static final int ID = 2;
	// déclaration des autres objets (cf leçon précédente)

	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		// initialisation des objets (cf leçon précédente)
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		// affichage (cf leçon précédente)
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
		// mise à jour (cf leçon précédente)
	}

	@Override
	public void keyReleased(int key, char c) {
		// quitter le jeux sur [ESC] (cf <a title="Rest sur Tomcat, Leçon 1 : Introduction" href="http://www.shionn.org/rest-over-tomcat-lesson-1">leçon 1)
	}

	@Override
	public int getID() {
		return ID;
	}
}
