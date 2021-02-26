package com;

import java.util.List;
import java.util.Optional;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.modelo.entidad.Videojuego;
import com.modelo.persistencia.DaoVideojuego;

@SpringBootApplication
public class Videojuego1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Videojuego1Application.class, args);
		
		DaoVideojuego v = context.getBean("daoVideojuego", DaoVideojuego.class);
	
		Videojuego v1 = new Videojuego();
		v1.setNombre("Sonic Heroes");
		v1.setCompañia("Sonic Team");
		v1.setPuntuacion(6.1);
		v1.setPrecio(651.2);
		v.save(v1);
		
		Videojuego v2 = new Videojuego();
		v2.setNombre("Sonic Heroes2");
		v2.setCompañia("Sonic Team");
		v2.setPuntuacion(1.1);
		v1.setPrecio(461.2);
		v.save(v2);
		
		Videojuego v3 = new Videojuego();
		v3.setNombre("Sonic Heroes3");
		v3.setCompañia("Sonic Team");
		v3.setPuntuacion(9.1);
		v1.setPrecio(631.2);
		v.save(v3);
		
		Videojuego v4 = new Videojuego();
		v4.setNombre("Sonic Heroes4");
		v4.setCompañia("Sonic Team");
		v4.setPuntuacion(7.1);
		v1.setPrecio(621.2);
		v.save(v4);
		
		System.out.println("\nVideojuegos añadidos");
		List<Videojuego> listaVideojuegos = v.findAll();
		for (Videojuego videojuego : listaVideojuegos) {
			System.out.println(videojuego);
		}
		v3 = new Videojuego();
		v3.setId(3);
		v3.setNombre("Sonic Heroes8");
		v3.setCompañia("Sonic Teams");
		v3.setPuntuacion(6.1);
		v3.setPrecio(721.2);
		v.save(v3);
		
		System.out.println("\nVideojuegos modificados");
		List<Videojuego> listaModificada = v.findAll();
		for (Videojuego videojuego : listaModificada) {
			System.out.println(videojuego);
		}
		
		
		Optional<Videojuego> vOp = v.findById(4);
		if(vOp.isPresent()) {
			System.out.println("El videojuego existe");
		}else {
			System.out.println("El videojuego no existe");
		}
		
		v.deleteById(3);
		System.out.println("\nVideojuegos borrados");
		List<Videojuego> listaBorrada = v.findAll();
		for (Videojuego videojuego : listaBorrada) {
			System.out.println(videojuego);
		}	
	}

}
