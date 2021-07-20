package ar.edu.unlam.pb2.VideoClub;

public class Libro extends Producto implements Vendible{

	private String autor;
	private String editorial;
	private Estado estado;
	private Integer precioDeVenta;

	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		super(codigo, descripcion);
		this.autor=autor;
		this.editorial=editorial;
		estado=Estado.DISPONIBLE;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
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
