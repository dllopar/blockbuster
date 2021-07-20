package ar.edu.unlam.pb2.VideoClub;

public class VideoJuego extends Producto implements Alquilable {

	private TipoDeConsola tipo;
	private Estado estado;
	private Integer precioAlquiler;
	private Integer calificacion;

	public VideoJuego(Integer codigo, String descripcion, TipoDeConsola tipo, Integer calificacion) {
		super(codigo, descripcion);
		this.tipo=tipo;
		estado=Estado.DISPONIBLE;
		this.calificacion=calificacion;
	}

	public TipoDeConsola getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeConsola tipo) {
		this.tipo = tipo;
	}
	
	

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public Integer getPrecioDeAlquiler() {
		
		return precioAlquiler;
	}

	@Override
	public void setPrecioAlquiler(Integer precio) {
		
		precioAlquiler=precio;
		
	}

	public Integer getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}

	public Integer getPrecioAlquiler() {
		return precioAlquiler;
	}
	
	
	

}
