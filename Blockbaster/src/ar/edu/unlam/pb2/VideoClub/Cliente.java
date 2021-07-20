package ar.edu.unlam.pb2.VideoClub;

public class Cliente {
	
	private Integer codigoCliente;
	private String nombre;
	private String apellido;
	private Integer edad;

	public Cliente(Integer codigoCliente, String nombre, String apellido, Integer edad) {
		
		this.codigoCliente=codigoCliente;
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
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

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
