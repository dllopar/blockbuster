package ar.edu.unlam.pb2.VideoClub;

public abstract class Producto {
	
	private Integer codigo;
	private String descripcion;
	private Estado estado;
	
	public Producto(Integer codigo, String descripcion) {
		
		this.codigo=codigo;
		this.descripcion=descripcion;
		estado=Estado.DISPONIBLE;
		
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Estado getEstado() {
		
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	
	

	
	
	
	
	

}
