package ar.edu.unlam.pb2.VideoClub;

public class Operacion {

	private Integer numeroOperacion;
	private Cliente cliente;
	private Pelicula pelicula;
	private VideoJuego videoJuego;

	public Operacion(Integer numeroOperacion, Cliente cliente, Producto producto) {

		this.numeroOperacion = numeroOperacion;
		this.cliente = cliente;
		this.pelicula = pelicula;
	}

	public Operacion(Integer numeroOperacion, Cliente cliente, VideoJuego videoJuego) {

		this.numeroOperacion = numeroOperacion;
		this.cliente = cliente;
		this.videoJuego = videoJuego;
	}

}
