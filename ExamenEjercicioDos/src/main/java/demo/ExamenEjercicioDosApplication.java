package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import entidad.Avion;
import entidad.Motor;

@SpringBootApplication
public class ExamenEjercicioDosApplication {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamenEjercicioDosApplication.class, args);
	
		Avion a = context.getBean("avion", Avion.class);
		Avion a2 = context.getBean("avion", Avion.class);
		Avion a3 = context.getBean("avion", Avion.class);
		Motor m = context.getBean("motor", Motor.class);
		Motor m2 = context.getBean("motor", Motor.class);
		Motor m3 = context.getBean("motor", Motor.class);
		Motor m4 = context.getBean("motor", Motor.class);
		
		m.setCilindrada(3000);
		m.setCv(1000);
		
		m2.setCilindrada(4000);
		m2.setCv(5000);
		
		m3.setCilindrada(2000);
		m3.setCv(2000);
		
		m4.setCilindrada(5000);
		m4.setCv(1000);
		
		
		
		a.setId(1);
		a.setKm(3000);
		a.setMarca("boin");
		a.setMotores(m, m2);
		
		a2.setId(2);
		a2.setKm(15000);
		a2.setMarca("ultra");
		a2.setMotores(m4, m2, m3);
		
		
		a3.setId(3);
		a3.setKm(4000);
		a3.setMarca("otro");
		a3.setMotores(m, m4);
		
		System.out.println(a);
		System.out.println(a2);
		System.out.println(a3);
		
	}

}
