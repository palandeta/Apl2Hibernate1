package codigo;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
	@Id
	private String nombre;
	private int edad;
	private Date nacimiento;
	public Usuario(String nombre, int edad, Date nacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacimiento = nacimiento;
	}
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}
	
}
