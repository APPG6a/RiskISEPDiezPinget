package fr.isep.ii1202project.region;

import fr.isep.ii1202project.teritory.Territory;

import java.util.List;

public class Region {

	private IDRegion id;
	private List<Territory> territories;

	public Region(IDRegion id) {
		this.id = id;
	}

	public Region(IDRegion id, List<Territory> territories) {
		this.id = id;
		this.territories = territories;
	}
}
