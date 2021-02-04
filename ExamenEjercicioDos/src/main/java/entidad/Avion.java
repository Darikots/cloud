package entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Avion {
	
	int id;
	String marca;
	Motor motor;
	int km;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Motor getMotores() {
		return motor;
	}
	public void setMotores(Motor motor) {
		this.motor = motor;
	}
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	@Override
	public String toString() {
		return "Avion [id=" + id + ", marca=" + marca + ", motor=" + motor + ", km=" + km + "]";
	}
	public void setMotores(Motor m, Motor m2) {
		// TODO Auto-generated method stub
		
	}
	public void setMotores(Motor m4, Motor m2, Motor m3) {
		// TODO Auto-generated method stub
		
	}
	

}
