package demo.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.modelo.entidades.Videojuego;

@Repository
public interface DaoVideojuego extends JpaRepository<Videojuego, Integer>{

	
	
}
	


