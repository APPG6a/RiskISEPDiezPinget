package fr.isep.ii1202project.region;

import fr.isep.ii1202project.teritory.IDTerritory;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private IDRegion id;
	private List<IDTerritory> territories;

	public Region(IDRegion id) {
		this.id = id;
		this.territories = new ArrayList<>();
	}

	public Region(IDRegion id, List<IDTerritory> territories) {
		this.id = id;
		this.territories = territories;
	}

	public IDRegion getId() {
		return id;
	}

	public void setId(IDRegion id) {
		this.id = id;
	}

	public List<IDTerritory> getTerritories() {
		return territories;
	}

	public void setTerritories(List<IDTerritory> territories) {
		this.territories = territories;
	}

	public void addTerritories(IDTerritory id) {
		this.territories.add(id);
	}
}
