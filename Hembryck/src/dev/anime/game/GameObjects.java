package dev.anime.game;

import java.awt.Canvas;

import javax.swing.JFrame;

import dev.anime.game.input.KeyManager;
import dev.anime.game.input.MouseManager;

public class GameObjects {
	
	private Game game;
	
	public GameObjects(Game game) {
		this.game = game;
	}
	
	public Game getGame() {
		return game;
	}
	
	public JFrame getFrame() {
		return game.getDisplay().getFrame();
	}
	
	public Canvas getCanvas() {
		return game.getDisplay().getCanvas();
	}
	
	public KeyManager getKeys() {
		return game.getDisplay().getKey();
	}
	
	public MouseManager getMouse() {
		return game.getDisplay().getMouse();
	}
	
	
	
}