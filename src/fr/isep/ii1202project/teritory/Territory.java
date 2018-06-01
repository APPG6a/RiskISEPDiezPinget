package fr.isep.ii1202project.teritory;

import fr.isep.ii1202project.region.IDRegion;
import fr.isep.ii1202project.units.Units;
import org.newdawn.slick.Image;

import java.util.List;

public class Territory {

	private IDTerritory id;
	private IDRegion region;
	private List<Units> garrison;
	private List<IDTerritory> borders;
	private Image occupancy;

	public Territory(IDTerritory id) {
		this.id = id;
	}

	public Territory(IDTerritory id, IDRegion region, List<Units> garrison, List<IDTerritory> borders, Image occupancy) {
		this.id = id;
		this.region = region;
		this.garrison = garrison;
		this.borders = borders;
		this.occupancy = occupancy;
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

	public List<IDTerritory> getBorders() {
		return borders;
	}

	public void setBorders(List<IDTerritory> borders) {
		this.borders = borders;
	}

	public Image getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(Image occupancy) {
		this.occupancy = occupancy;
	}

//	TODO relationship mousePosition <-> isInTerritory
}
