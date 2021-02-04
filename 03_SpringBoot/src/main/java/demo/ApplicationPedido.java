package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import demo.modelo.entidad.Cliente;
import demo.modelo.entidad.Pedido;


/*Esta clase de aqui va a ser nuestro punto de entrada de la aplicacion
 * 
 * Por ejemplo, si tu le has dicho en el start que quieres
 * usar una base de datos ,si no configuras una base de datos
 * esta anotacion te levanta una base de datos en memoria 
 * perfectamente operativa */

@SpringBootApplication
public class ApplicationPedido {

	public static ApplicationContext context;
	
	public static void main(String[] args) {
		context = SpringApplication.run(Application.class, args);
		
		Cliente c = context.getBean("cliente", Cliente.class);
		Pedido p = context.getBean("pedido", Pedido.class);
		p.setId(1);
		p.setPrecio(1.25);
		
		
		c.setNombre("Pepe");
		c.setApellido("Villuela");
		c.setPedido(p);
		
		System.out.println(c);
		
		Cliente c2 = context.getBean("cliente", Cliente.class);
		Pedido p2 = context.getBean("pedido", Pedido.class);
		p2.setId(45);
		p2.setPrecio(3.25);
		
		c2.setNombre("Nacho");
		c2.setApellido("Artorga");
		c2.setPedido(p2);
		
		System.out.println(c2);
		
	}

}