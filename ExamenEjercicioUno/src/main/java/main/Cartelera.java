package main;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.Pelicula;

public class Cartelera {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("recursos/context.xml");
		
		Pelicula p = context.getBean("pelicula1", Pelicula.class);
		System.out.println(p);

		Pelicula p2 = context.getBean("pelicula2", Pelicula.class);
		System.out.println(p2);
	}

}
