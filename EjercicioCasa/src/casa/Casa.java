package casa;


import java.util.ArrayList;

public class Casa {
	private double precio;
	private Persona propietario;
	private Direccion direccion;
	private ArrayList<Habitacion> listaHabitaciones;
	private ArrayList<Persona> listaPersonas;
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Persona getPropietario() {
		return propietario;
	}
	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}
	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}
	public ArrayList<Persona> getListaPersona() {
		return listaPersonas;
	}
	public void setListaPersonas(ArrayList<Persona> listaPersonas) {
		this.listaPersonas = listaPersonas;
	}
	@Override
	public String toString() {
		return "Casa [precio=" + precio + ", propietario=" + propietario + ", direccion=" + direccion
				+ ", listaHabitaciones=" + listaHabitaciones + ", listaPersona=" + listaPersonas + "]";
	}
	
	
	public double calcularM2() {
		int m2Totales = 0;
		for(Habitacion h : listaHabitaciones) {
			m2Totales += h.getM2();
			}
		return m2Totales;
	}
}
