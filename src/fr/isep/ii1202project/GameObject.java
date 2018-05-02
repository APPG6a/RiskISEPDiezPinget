package fr.isep.ii1202project;

import java.awt.*;

public abstract class GameObject {

	protected int x, y;
	protected float xVel = 0, yVel = 0;
	protected ENTITIES id;

	public GameObject(int x, int y, ENTITIES id) {
		this.x = x;
		this.y = y;
		this.id = id;
	}

	public abstract void tick();
	public abstract void render(Graphics graphics);

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public float getxVel() {
		return xVel;
	}

	public void setxVel(float xVel) {
		this.xVel = xVel;
	}

	public float getyVel() {
		return yVel;
	}

	public void setyVel(float yVel) {
		this.yVel = yVel;
	}

	public ENTITIES getId() {
		return id;
	}

	public void setId(ENTITIES id) {
		this.id = id;
	}
}
