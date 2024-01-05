package com.Game_app.Gaming.Project.helloworld;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
// DEfine beans 
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// we creating the class and  configuration to give input IOC Container 

record Person(String name,int age,Address address) {};
// address the first line of city 
record Address(String firstLine,String city) {};
 
@Configuration
public class HelloWorldConfiguration {
	@Bean
 public String name() {
	 return " Prashant";
 }
	@Bean
	public int age() {
		return 18;
		
	}

@Bean

public Person person() {
 var person = new Person("Ravi",20,new  Address("Main Street","Utreet")); 
     return person;
	
}
// we use specify the bean name and we access the info
//  bean cast to your class type from
//the application context, where the bean is what you configured 
//in the application context
@Bean

(name="prashant2")
@Primary
 // we use the multiple beans by use @primary 
public Address address() {
	var address= new Address("Beaker Street","Londan");
	return address;
}
@Bean
(name="prashant34")
public Address address2() {
	var address= new Address("Shastri nager ","Kanjur");
	return address;
}
@Bean
@Primary 
public Person personparameter(String name,int age,Address address) {
	return new Person(name, age ,address);
	}
@Bean
public Person person5Qualifier(String name,int age,@Qualifier("address3qualifier")Address address) {
	return new Person(name, age ,address);
     }
@Bean("prashant23")
// by using of quantifiers we use the auto-wiring 
@Qualifier("address3qualifier")
public Address address3() {

	var address = new Address("kanjur marg ","mumbai");
	return address;
}




// we can use info above of two class name & age by using of *Method call*
@Bean(name="perrson")
public Person perso2nMethodeCall() {
	var person = new Person(name(),age(),address()); 
		return  person;
	
}


}
