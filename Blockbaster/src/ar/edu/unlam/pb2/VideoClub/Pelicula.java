package ar.edu.unlam.pb2.VideoClub;

import java.util.ArrayList;

public class Pelicula extends Producto implements Vendible, Alquilable{

	private Genero genero;
	private Integer anio;
	private String director;
	private ArrayList<String>actor;
	private Estado estado;
	private Integer precioAlquiler;
	private Integer precioDeVenta;
	private Integer calificacion;

	public Pelicula(Integer codigo, String descripcion, Genero genero, Integer anio, String director, Integer calificacion) {
		super(codigo, descripcion);
		this.genero=genero;
		this.anio = anio;
		this.director=director;
		actor= new ArrayList<>();
		estado=Estado.DISPONIBLE;
		this.calificacion=calificacion;
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



	public void agregarActor(String actorParaAgregar) {
		actor.add(actorParaAgregar);
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Integer getAnio() {
		return anio;
	}

	public void setAnio(Integer anio) {
		this.anio = anio;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}
	
	


	public ArrayList<String> getActor() {
		return actor;
	}

	public void setActor(ArrayList<String> actor) {
		this.actor = actor;
	}
	
	

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public Integer getPrecioDeVenta() {
		// TODO Auto-generated method stub
		return precioDeVenta;
	}

	@Override
	public void setPrecioDeVenta(Integer precio) {
		precioDeVenta=precio;
		
	}

	@Override
	public Integer getPrecioDeAlquiler() {
		
		return precioAlquiler;
	}

	@Override
	public void setPrecioAlquiler(Integer precio) {
		
		precioAlquiler=precio;
	}

	public boolean actua(String aCTOR_1_ESPERADO) {
		
		Boolean aBuscar=false;
		
		if(actor.contains(aCTOR_1_ESPERADO)) {
			aBuscar= true;
		}
		return aBuscar;
	}

	
	
	
	

}
