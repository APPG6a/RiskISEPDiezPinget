package fr.isep.ii1202project;

import java.awt.*;
import java.util.List;

public class Player {

	//Player info
	private String pseudo;

	//Game Info
	private List<Territory> territories;
	private Color color;

	public Player(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public List<Territory> getTerritories() {
		return territories;
	}

	public void setTerritories(List<Territory> territories) {
		this.territories = territories;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
