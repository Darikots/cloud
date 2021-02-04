package main;



import java.util.List;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSInput;

import casa.Casa;
import casa.Direccion;
import casa.Habitacion;
import casa.Persona;

public class MainCasa {

	public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("recursos/context.xml");
	Casa c1 = (Casa)context.getBean("casa", Casa.class);
			System.out.println(c1);
					
			
	}

}
