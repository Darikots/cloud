package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import entidad.Avion;

@SpringBootApplication
public class Aplication {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
	context = SpringApplication.run(Aplication.class, args);
			
			
			
			Avion a = context.getBean("avion", Avion.class);
	
			System.out.println(a);
			
			Avion a2 = context.getBean("avion", Avion.class);
			
			System.out.println(a2);
			
			
			Avion a3 = context.getBean("avion", Avion.class);
				
			System.out.println(a3);

	}

}
