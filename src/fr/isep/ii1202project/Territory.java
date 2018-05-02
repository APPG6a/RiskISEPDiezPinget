package fr.isep.ii1202project;

import java.awt.*;
import java.util.List;

public class Territory extends GameObject{

	//units
	private int infantryNumber;
	private int cavalryNumber;
	private int canonNumber;

	//Map
	private String name;
	private Color color;
	private List<Territory> borders;

	public Territory(int x, int y, ENTITIES id) {
		super(x, y, id);
	}

	public void tick() {

	}

	public void render(Graphics graphics) {

	}
}
