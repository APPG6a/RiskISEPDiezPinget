package fr.isep.ii1202project;

import fr.isep.ii1202project.region.IDRegion;
import fr.isep.ii1202project.region.Region;
import fr.isep.ii1202project.teritory.IDTerritory;
import fr.isep.ii1202project.teritory.Territory;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.util.ArrayList;
import java.util.List;

public class MapGameState extends BasicGameState {
	public static final int ID = 3;

	private int WIDTH;
	private int HEIGHT;

	private Image background;

	private List<Region> regions = new ArrayList<>();
	private List<Territory> territories = new ArrayList<>();

	private StateBasedGame game;

	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		this.game = game;
		WIDTH = container.getWidth();
		HEIGHT = container.getHeight();

		this.background = new Image("/res/Map/RiskISEP.png");

		for (IDRegion region :
				IDRegion.values()) {
			System.out.println(region.toString());
			System.out.println(new Region(region));
			System.out.println(regions);
			this.regions.add(new Region(region));
		}

		for (IDTerritory territory :
				IDTerritory.values()) {
			this.territories.add(new Territory(territory));
		}

//		for (IDRegion region :
//				IDRegion.values()) {
//			for (IDTerritory territory :
//					IDTerritory.values()) {
//				switch (region)
//				{
//					case Asia:
//						if (new ArrayList<IDTerritory>() {{add()}}){
//
//						}
//				}
//			}
//		}


	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		background.draw(0, 0, WIDTH, HEIGHT);
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException {
	}

	@Override
	public void keyReleased(int key, char c) {
	}

	@Override
	public int getID() {
		return ID;
	}
}
