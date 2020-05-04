package com.jeu;
// fait defillé le fond d'ecran pour faire avancer mario
public class Chrono implements Runnable {
 
	private final int PAUSE = 3; // temps d'attente entre 2 tours de boucles
	
	
	
	@Override
	public void run() {
		
		while(true){
			Main.scene.repaint();// appel la methode paintcomponent de l'objet scene
			try {Thread.sleep(PAUSE); // temps de pause du flux
			} catch (InterruptedException e){}
		}
	}

	
}
