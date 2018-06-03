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
import java.util.Arrays;
import java.util.List;

import static fr.isep.ii1202project.teritory.IDTerritory.*;

public class MapGameState extends BasicGameState {
	public static final int ID = 3;

	private int WIDTH;
	private int HEIGHT;

	private Image background;
	private Image dashboard;
	private List<Region> regions = new ArrayList<>();
	private List<Territory> territories = new ArrayList<>();

	private StateBasedGame game;

	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException {
		this.game = game;
		WIDTH = container.getWidth();
		HEIGHT = container.getHeight();

		this.background = new Image("/res/Map/RiskISEP.png");
		this.dashboard = new Image("/res/BlankPanel-3.png");

		System.out.println("\n[START]\tConfiguration de la map\n");

		for (IDRegion region :
				IDRegion.values()) {
			System.out.println("Creating region : " + region.toString());
			this.regions.add(new Region(region));
		}

		System.out.println();

		for (IDTerritory territory :
				IDTerritory.values()) {
			System.out.println("case " + territory.toString());
			this.territories.add(new Territory(territory));
		}

		System.out.println();

		for (Region region :
				regions) {
			for (Territory territory :
					territories) {
				switch (region.getId()) {
					case Asia:
						if (new ArrayList<>(Arrays.asList(
								IDTerritory.Afghanistan,
								IDTerritory.Siam,
								IDTerritory.India,
								IDTerritory.MiddleEast,
								IDTerritory.China,
								IDTerritory.Mongolia,
								IDTerritory.Japan,
								IDTerritory.Kamchatka,
								IDTerritory.Irkutsk,
								IDTerritory.Yakutsk,
								IDTerritory.Siberia,
								IDTerritory.Ural)).contains(territory.getId())) {
							System.out.println("Creating association : " + territory.getId().toString() + " - " + region.getId().toString());
							territory.setRegion(region.getId());
							region.addTerritories(territory.getId());
						}

					case Europe:
						if (new ArrayList<>(Arrays.asList(
								IDTerritory.GreatBritain,
								IDTerritory.Iceland,
								IDTerritory.Scandinavia,
								IDTerritory.Ukraine,
								IDTerritory.NorthernEurope,
								IDTerritory.SouthernEurope,
								IDTerritory.WesternEurope)).contains(territory.getId())) {
							System.out.println("Creating association : " + territory.getId().toString() + " - " + region.getId().toString());
							territory.setRegion(region.getId());
							region.addTerritories(territory.getId());
						}

					case Africa:
						if (new ArrayList<>(Arrays.asList(
								IDTerritory.Madagascar,
								IDTerritory.SouthAfrica,
								IDTerritory.Congo,
								IDTerritory.EastAfrica,
								IDTerritory.Egypt,
								IDTerritory.NorthAfrica)).contains(territory.getId())) {
							System.out.println("Creating association : " + territory.getId().toString() + " - " + region.getId().toString());
							territory.setRegion(region.getId());
							region.addTerritories(territory.getId());
						}

					case SouthAmerica:
						if (new ArrayList<>(Arrays.asList(
								IDTerritory.Argentina,
								IDTerritory.Brazil,
								IDTerritory.Peru,
								IDTerritory.Venezuela)).contains(territory.getId())) {
							System.out.println("Creating association : " + territory.getId().toString() + " - " + region.getId().toString());
							territory.setRegion(region.getId());
							region.addTerritories(territory.getId());
						}

					case NorthAmerica:
						if (new ArrayList<>(Arrays.asList(
								IDTerritory.CentralAmerica,
								IDTerritory.WesternUnitedStates,
								IDTerritory.EasternUnitedStates,
								IDTerritory.Quebec,
								IDTerritory.Ontario,
								IDTerritory.Alaska,
								IDTerritory.Alberta,
								IDTerritory.NorthwestTerritory,
								IDTerritory.Greenland)).contains(territory.getId())) {
							System.out.println("Creating association : " + territory.getId().toString() + " - " + region.getId().toString());
							territory.setRegion(region.getId());
							region.addTerritories(territory.getId());
						}

					case Oceania:
						if (new ArrayList<>(Arrays.asList(
								IDTerritory.Indonesia,
								IDTerritory.NewGuinea,
								IDTerritory.EasternAustralia,
								IDTerritory.WesternAustralia)).contains(territory.getId())) {
							System.out.println("Creating association : " + territory.getId().toString() + " - " + region.getId().toString());
							territory.setRegion(region.getId());
							region.addTerritories(territory.getId());
						}
				}
			}
		}


		for (Territory territory :
				territories) {
			switch (territory.getId()) {
				case Alaska:
					territory.setBorders(new ArrayList<>(Arrays.asList(Alberta, NorthwestTerritory, Kamchatka)));
					territory.setOccupancy(new Image("/res/Map/NorthAmerica/Alaska.png"));
				case Alberta:
					territory.setBorders(new ArrayList<>(Arrays.asList(Alaska, NorthwestTerritory, Ontario, WesternUnitedStates)));
					territory.setOccupancy(new Image("/res/Map/NorthAmerica/Alberta.png"));
				case CentralAmerica:
					territory.setBorders(new ArrayList<>(Arrays.asList(WesternUnitedStates, Venezuela, EasternUnitedStates)));
					territory.setOccupancy(new Image("/res/Map/NorthAmerica/CentralAmerica.png"));
				case EasternUnitedStates:
					territory.setBorders(new ArrayList<>(Arrays.asList(CentralAmerica, WesternUnitedStates, Ontario, Quebec)));
					territory.setOccupancy(new Image("/res/Map/NorthAmerica/EasternUnitedStates.png"));
				case Greenland:
					territory.setBorders(new ArrayList<>(Arrays.asList(NorthwestTerritory, Ontario, Quebec, Iceland)));
					territory.setOccupancy(new Image("/res/Map/NorthAmerica/Greenland.png"));
				case NorthwestTerritory:
					territory.setBorders(new ArrayList<>(Arrays.asList(Alaska, Greenland, Ontario, Alberta)));
					territory.setOccupancy(new Image("/res/Map/NorthAmerica/NorthwestTerritory.png"));
				case Ontario:
					territory.setBorders(new ArrayList<>(Arrays.asList(NorthwestTerritory, Greenland, Quebec, EasternUnitedStates, WesternUnitedStates, Alberta)));
					territory.setOccupancy(new Image("/res/Map/NorthAmerica/Ontario.png"));
				case Quebec:
					territory.setBorders(new ArrayList<>(Arrays.asList(Ontario, Greenland, EasternUnitedStates)));
					territory.setOccupancy(new Image("/res/Map/NorthAmerica/Quebec.png"));
				case WesternUnitedStates:
					territory.setBorders(new ArrayList<>(Arrays.asList(Alberta, Ontario, EasternUnitedStates, CentralAmerica)));
					territory.setOccupancy(new Image("/res/Map/NorthAmerica/WesternUnitedStates.png"));
				case Argentina:
					territory.setBorders(new ArrayList<>(Arrays.asList(Peru, Brazil)));
					territory.setOccupancy(new Image("/res/Map/SouthAmerica/Argentina.png"));
				case Brazil:
					territory.setBorders(new ArrayList<>(Arrays.asList(Venezuela, NorthAfrica, Argentina, Peru)));
					territory.setOccupancy(new Image("/res/Map/SouthAmerica/Brazil.png"));
				case Peru:
					territory.setBorders(new ArrayList<>(Arrays.asList(Venezuela, Brazil, Argentina)));
					territory.setOccupancy(new Image("/res/Map/SouthAmerica/Peru.png"));
				case Venezuela:
					territory.setBorders(new ArrayList<>(Arrays.asList(CentralAmerica, Brazil, Peru)));
					territory.setOccupancy(new Image("/res/Map/SouthAmerica/Venezuela.png"));
				case GreatBritain:
					territory.setBorders(new ArrayList<>(Arrays.asList(Iceland, Scandinavia, NorthernEurope, WesternEurope)));
					territory.setOccupancy(new Image("/res/Map/Europe/GreatBritain.png"));
				case Iceland:
					territory.setBorders(new ArrayList<>(Arrays.asList(Greenland, GreatBritain, Scandinavia)));
					territory.setOccupancy(new Image("/res/Map/Europe/Iceland.png"));
				case NorthernEurope:
					territory.setBorders(new ArrayList<>(Arrays.asList(GreatBritain, Ukraine, SouthernEurope, WesternEurope, Scandinavia)));
					territory.setOccupancy(new Image("/res/Map/Europe/NorthernEurope.png"));
				case Scandinavia:
					territory.setBorders(new ArrayList<>(Arrays.asList(GreatBritain, Ukraine, NorthernEurope, Iceland)));
					territory.setOccupancy(new Image("/res/Map/Europe/Scandinavia.png"));
				case SouthernEurope:
					territory.setBorders(new ArrayList<>(Arrays.asList(WesternEurope, NorthernEurope, Ukraine, Egypt, NorthAfrica, MiddleEast)));
					territory.setOccupancy(new Image("/res/Map/Europe/SouthernEurope.png"));
				case Ukraine:
					territory.setBorders(new ArrayList<>(Arrays.asList(Scandinavia, Ural, Afghanistan, MiddleEast, SouthernEurope, NorthernEurope)));
					territory.setOccupancy(new Image("/res/Map/Europe/Ukraine.png"));
				case WesternEurope:
					territory.setBorders(new ArrayList<>(Arrays.asList(GreatBritain, NorthernEurope, SouthernEurope, NorthAfrica)));
					territory.setOccupancy(new Image("/res/Map/Europe/WesternEurope.png"));
				case Congo:
					territory.setBorders(new ArrayList<>(Arrays.asList(NorthAfrica, EastAfrica, SouthAfrica)));
				case EastAfrica:
					territory.setBorders(new ArrayList<>(Arrays.asList(Egypt, Madagascar, SouthAfrica, Congo, NorthAfrica, MiddleEast)));
				case Egypt:
					territory.setBorders(new ArrayList<>(Arrays.asList(SouthernEurope, MiddleEast, EastAfrica, NorthAfrica)));
				case Madagascar:
					territory.setBorders(new ArrayList<>(Arrays.asList(EastAfrica, SouthAfrica)));
				case NorthAfrica:
					territory.setBorders(new ArrayList<>(Arrays.asList(WesternEurope, SouthernEurope, Egypt, Congo, Brazil, EastAfrica)));
				case SouthAfrica:
					territory.setBorders(new ArrayList<>(Arrays.asList(Congo, EastAfrica, Madagascar)));
				case Afghanistan:
					territory.setBorders(new ArrayList<>(Arrays.asList(Ukraine, Ural, China, India, MiddleEast)));
				case China:
					territory.setBorders(new ArrayList<>(Arrays.asList(Afghanistan, Siberia, Mongolia, Siam, India, Ural)));
				case India:
					territory.setBorders(new ArrayList<>(Arrays.asList(MiddleEast, Afghanistan, China, Siam)));
				case Irkutsk:
					territory.setBorders(new ArrayList<>(Arrays.asList(Siberia, Yakutsk, Kamchatka, Mongolia)));
				case Japan:
					territory.setBorders(new ArrayList<>(Arrays.asList(Kamchatka, Mongolia)));
				case Kamchatka:
					territory.setBorders(new ArrayList<>(Arrays.asList(Yakutsk, Alaska, Japan, Mongolia, Irkutsk)));
				case MiddleEast:
					territory.setBorders(new ArrayList<>(Arrays.asList(Ukraine, Afghanistan, India, Egypt, EastAfrica, SouthernEurope)));
				case Mongolia:
					territory.setBorders(new ArrayList<>(Arrays.asList(Siberia, Irkutsk, Kamchatka, Japan, China)));
				case Siam:
					territory.setBorders(new ArrayList<>(Arrays.asList(India, China, Indonesia)));
				case Siberia:
					territory.setBorders(new ArrayList<>(Arrays.asList(Alaska, Ural, Yakutsk, Irkutsk, Mongolia, China)));
				case Ural:
					territory.setBorders(new ArrayList<>(Arrays.asList(Ukraine, Siberia, Afghanistan, China)));
				case Yakutsk:
					territory.setBorders(new ArrayList<>(Arrays.asList(Siberia, Kamchatka, Irkutsk)));
				case EasternAustralia:
					territory.setBorders(new ArrayList<>(Arrays.asList(NewGuinea, WesternAustralia)));
				case Indonesia:
					territory.setBorders(new ArrayList<>(Arrays.asList(Siam, NewGuinea, WesternAustralia)));
				case NewGuinea:
					territory.setBorders(new ArrayList<>(Arrays.asList(Indonesia, EasternAustralia, WesternAustralia)));
				case WesternAustralia:
					territory.setBorders(new ArrayList<>(Arrays.asList(Indonesia, NewGuinea, EasternAustralia)));
			}

		}

	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException {
		background.draw(WIDTH/5, 0, WIDTH*4/5, HEIGHT);
		dashboard.draw(0, 0, WIDTH*1/5, HEIGHT);
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
