package fr.isep.ii1202project.teritory;

import fr.isep.ii1202project.region.IDRegion;
import fr.isep.ii1202project.units.Units;

import java.util.List;

public class Territory {

	private IDTerritory id;
	private IDRegion region;
	private List<Units> garrison;
	private List<Territory> borders;


	public Territory(IDTerritory id, IDRegion region, List<Units> garrison, List<Territory> borders) {
		this.id = id;
		this.region = region;
		this.garrison = garrison;
		this.borders = borders;
	}

	public IDTerritory getId() {
		return id;
	}

	public void setId(IDTerritory id) {
		this.id = id;
	}

	public IDRegion getRegion() {
		return region;
	}

	public void setRegion(IDRegion region) {
		this.region = region;
	}

	public List<Units> getGarrison() {
		return garrison;
	}

	public void setGarrison(List<Units> garrison) {
		this.garrison = garrison;
	}

	public List<Territory> getBorders() {
		return borders;
	}

	public void setBorders(List<Territory> borders) {
		this.borders = borders;
	}
}
