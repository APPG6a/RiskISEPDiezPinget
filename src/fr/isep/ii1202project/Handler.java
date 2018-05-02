package fr.isep.ii1202project;

import fr.isep.ii1202project.GameObject;

import java.awt.*;
import java.util.LinkedList;

public class Handler {

	LinkedList<GameObject> objects = new LinkedList<GameObject>();

	public void tick(){
		for (int it = 0; it < objects.size(); it++){
			GameObject object = objects.get(it);

			object.tick();
		}
	}

	public void render(Graphics graphics){
		for (int it = 0; it < objects.size(); it++){
			GameObject object = objects.get(it);

			object.render(graphics);
		}
	}

	public void addObject(GameObject object){
		objects.add(object);
	}

	public void remouveObject(GameObject object){
		objects.remove(object);
	}

}
