package ar.edu.unlam.pb2.VideoClub;

public class Comestibles extends Producto implements Vendible{
	
	private Estado estado;
	private Integer precioDeVenta;

	public Comestibles(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		estado=Estado.DISPONIBLE;
	}
	
	

	public Estado getEstado() {
		return estado;
	}



	public void setEstado(Estado estado) {
		this.estado = estado;
	}



	@Override
	public Integer getPrecioDeVenta() {
		
		return precioDeVenta;
	}



	@Override
	public void setPrecioDeVenta(Integer precio) {
		
		precioDeVenta=precio;
		
	}




}
