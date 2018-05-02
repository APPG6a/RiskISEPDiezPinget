package fr.isep.ii1202project;

import java.awt.*;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {

	private final int WIDTH = 1000;
	private final int HEIGHT = WIDTH*9/16;

	private boolean isRunning = false;
	private Thread thread;
	private Handler handler;

	public Game() {
		new Window(WIDTH, HEIGHT, "RiskIsep", this);
		start();

		handler = new Handler();
	}

	public static void main(String[] args) {
		new Game();
	}

	private void start() {
		isRunning = true;
		thread = new Thread(this);
		thread.start();
	}

	private void stop() {
		isRunning = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void run() {

		//Code tire de Notch (Minecraft) puis commente pour les besoins de l'exercice

		//mettre la fenetre au premier plan lors du demarrage
		this.requestFocus();

		//initialisation de differents parametres pour la gestion temporelle de l'aplication
		long lastTime = System.nanoTime();
		double ammountOfTicks = 60.0;
		double ns = 1000000000 / ammountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();

		//compteur de la frame affichee actuelle
		int frames = 0;

		//boucle du jeu
		while (isRunning) {

			//Delai entre chaque rendu à l'ecran
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				//gestion du jeu dans le temps
				tick();

				delta--;
			}

			//rendu du jeu a l'ecran
			render();
			frames++;

			//toutes les secondes on actualise le nombre de frames affichees
			// (permet entre autres d'afficher les fps pour le debug)
			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				frames = 0;
			}
		}
		stop();
	}

	private void tick() {
		handler.tick();
	}

	private void render() {
		BufferStrategy bs = this.getBufferStrategy();
		if (bs == null) {
			this.createBufferStrategy(3);
			return;
		}

		Graphics graphics = bs.getDrawGraphics();

		////////////////////////////////////////
		// ICI, rendu de l'entirerete de l'application
		////////////////////////////////////////

		//background
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, WIDTH, HEIGHT);

		//render of all object in game
		handler.render(graphics);

		////////////////////////////////////////

		graphics.dispose();
		bs.show();

	}
}
