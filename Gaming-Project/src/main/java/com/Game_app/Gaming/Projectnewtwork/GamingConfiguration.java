package com.Game_app.Gaming.Projectnewtwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.Game_app.Gaming.Project.GameRunner;
import com.Game_app.Gaming.Project.GamingConsole;
import com.Game_app.Gaming.Project.PacamanGame;
import com.Game_app.Gaming.Project.SuperContraGame;
@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		 var game= new PacamanGame();
		 return game;
				 
	}
	
//	@Bean(name="prashant43")
//	@Primary
//	public GamingConsole game1() {
//		var game = new SuperContraGame();
//		return game;
//	}
//	
	
	
	
	@Bean
	public  GameRunner gameRunner(GamingConsole game) {
		 var gameRunner= new GameRunner(game);
		 return gameRunner;
				 
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////            var game = new MarioGame();
//		// tight coupling is appearing 
////		var game  = new SuperContraGame();
//		var game = new PacamanGame();// 1: creating the object 
//		var gameRunner = new GameRunner(game);
//		//2: object creating + Wiring Dependencies
//		// game is dependency of GamwRunner Class
//		
//		gameRunner.run();
		
		
	}

