package com.Game_app.Gaming.Projectnewtwork;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import com.Game_app.Gaming.Project.GameRunner;
import com.Game_app.Gaming.Project.GameRunner;
import com.Game_app.Gaming.Project.GamingConsole;
//import com.Game_app.Gaming.Project.SuperContraGame;
import com.Game_app.Gaming.Project.PacamanGame;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext
				(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
//			context.getBean("prashnat43");
		}
		
	}

}
