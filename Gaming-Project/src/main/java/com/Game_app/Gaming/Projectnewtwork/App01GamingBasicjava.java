package com.Game_app.Gaming.Projectnewtwork;

import com.Game_app.Gaming.Project.GameRunner;
import com.Game_app.Gaming.Project.PacamanGame;

public class App01GamingBasicjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//            var game = new MarioGame();
		// tight coupling is appearing 
//		var game  = new SuperContraGame();
		var game = new PacamanGame();// 1: creating the object 
		var gameRunner = new GameRunner(game);
		//2: object creating + Wiring Dependencies
		// game is dependency of GamwRunner Class
		
		gameRunner.run();
		
		
	}

}
