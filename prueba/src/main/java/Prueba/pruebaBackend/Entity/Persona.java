package Prueba.pruebaBackend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="rut")
	private String rut;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellido")
	private String apellido;
	
	@Column(name="email")
	private String email;
	
	 	@Column(name="direccion")
	private String direccion;
	
	public Persona() {}
	
	public Persona(int id, String rut, String nombre, String apellido, String email, String direccion) {
		super();
		this.id = id;
		this.rut = rut;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "persona [id=" + id + ", rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", email="
				+ email + ", direccion=" + direccion + "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
}
