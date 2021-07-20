package ar.edu.unlam.pb2.VideoClub;

import java.util.ArrayList;

public class VideoClub {

	private String nombre;
	private ArrayList<Producto> productos;
	private ArrayList<Libro> libros;
	private ArrayList<VideoJuego> videoJuegos;
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Comestibles> comestible;
	private ArrayList<Operacion> operaciones;

	public VideoClub(String nombre) {
		this.nombre = nombre;
		libros = new ArrayList<Libro>();
		videoJuegos = new ArrayList<VideoJuego>();
		peliculas = new ArrayList<Pelicula>();
		comestible = new ArrayList<Comestibles>();
		operaciones = new ArrayList<Operacion>();
		productos = new ArrayList<Producto>();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public ArrayList<Operacion> getOperaciones() {
		return operaciones;
	}

	public void setOperaciones(ArrayList<Operacion> operaciones) {
		this.operaciones = operaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Libro> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}

	public ArrayList<VideoJuego> getVideoJuegos() {
		return videoJuegos;
	}

	public void setVideoJuegos(ArrayList<VideoJuego> videoJuegos) {
		this.videoJuegos = videoJuegos;
	}

	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}

	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}

	public ArrayList<Comestibles> getComestible() {
		return comestible;
	}

	public void setComestible(ArrayList<Comestibles> comestible) {
		this.comestible = comestible;
	}

	public void agregarProducto(Producto nuevoProducto) {

		productos.add(nuevoProducto);

	}

	public Producto buscarProducto(Producto nuevoProducto) throws ProductoNoEncontrado {

		if (productos.contains(nuevoProducto)) {
			return nuevoProducto;
		} else {
			throw new ProductoNoEncontrado();
		}

	}

	public Boolean vender(Producto nuevoProducto, Cliente nuevoCliente) throws ProductoNoEncontrado {

		if (buscarProducto(nuevoProducto).equals(nuevoProducto)) {
			Operacion nuevaOperacion = new Operacion(1, nuevoCliente, nuevoProducto);
			nuevoProducto.setEstado(Estado.VENDIDO);
			operaciones.add(nuevaOperacion);
			quitarProductoVendido(nuevoProducto);
			return true;
		} else {
			throw new ProductoNoEncontrado();
		}

	}

	public Boolean alquilar(Producto nuevoProducto, Cliente nuevoCliente) throws ProductoNoEncontrado {

		if (buscarProducto(nuevoProducto).equals(nuevoProducto) && nuevoProducto.getEstado().equals(Estado.DISPONIBLE)) {
			Operacion nuevaOperacion = new Operacion(1, nuevoCliente, nuevoProducto);
			nuevoProducto.setEstado(Estado.ALQUILADO);
			operaciones.add(nuevaOperacion);
			return true;
		} else {
			throw new ProductoNoEncontrado();
		}
	}

	public Boolean quitarProductoVendido(Producto nuevoProducto) throws ProductoNoEncontrado {

		Producto aBuscar = buscarProducto(nuevoProducto);

		return productos.remove(nuevoProducto);
	}

	public void devolverProducto(Producto nuevoProducto) throws ProductoNoEncontrado {

		Producto aBuscar = buscarProducto(nuevoProducto);

		aBuscar.setEstado(Estado.DISPONIBLE);

	}

	public Boolean calificacionDelPelicula(Pelicula peliculaNueva, Cliente edadCliente) throws ProductoNoEncontrado {
		Boolean esApto = false;
		if (peliculaNueva.getCalificacion() < edadCliente.getEdad()) {
			esApto = true;
		}

		return esApto;

	}

	public Boolean calificacionDelVideoJuego(VideoJuego videoNuevo, Cliente edadCliente) throws ProductoNoEncontrado {
		Boolean esApto = false;
		if (videoNuevo.getCalificacion() < edadCliente.getEdad() && alquilar(videoNuevo, edadCliente)) {
			esApto = true;
		}

		return esApto;

	}

}
