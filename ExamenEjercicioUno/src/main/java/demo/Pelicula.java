package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pelicula {
	
	String titulo;
	int añoEstr;
	Director director;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoEstr() {
		return añoEstr;
	}

	public void setAñoEstr(int añoEstr) {
		this.añoEstr = añoEstr;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", añoEstr=" + añoEstr + ", director=" + director + "]";
	}
	
}
