package entidad;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Motor {
	int cv;
	int cilindrada;
	public int getCv() {
		return cv;
	}
	public void setCv(int cv) {
		this.cv = cv;
	}
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	@Override
	public String toString() {
		return "Motor [cv=" + cv + ", cilindrada=" + cilindrada + "]";
	}
	
	

}
