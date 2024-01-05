package com.Game_app.Gaming.Project.helloworld;

//import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		//we use the try-with-resourse
	 try(
		var context  = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);)
	 {//Lanuch Spring context 
		// configure the things that we wants spring to manage  -  @configuration
		// name -@Beans
		// 3: Retrieving Beans managed by Spring 
			
		
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("age"));
		System.out.println(context.getBean("person"));
		System.out.print(context.getBean("prashant2"));
		// multiple  matching beans are present we use @primary for control 
		System.out.print(context.getBean("prashant34"));
		System.out.print(context.getBean("prashant23"));

		// we pass the value by pass the class in sout 
		System.out.println(context.getBean(Address.class));
		System.out.println(context.getBean(Person.class));


//		System.out.println(context.getBean( "perso2nMethodeCall"));
//		System.out.println(context.getBean( "person5Quilifer"));
        //  is called methode reference System.out.println
//           Arrays.stream (context.getBeanDefinitionNames()).forEach(System.out::println);
		 
	 }
      	
	}

}
