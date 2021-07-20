package ar.edu.unlam.pb2.VideoClubTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.VideoClub.Alquilable;
import ar.edu.unlam.pb2.VideoClub.Cliente;
import ar.edu.unlam.pb2.VideoClub.Comestibles;
import ar.edu.unlam.pb2.VideoClub.Estado;
import ar.edu.unlam.pb2.VideoClub.Genero;
import ar.edu.unlam.pb2.VideoClub.Libro;
import ar.edu.unlam.pb2.VideoClub.Pelicula;
import ar.edu.unlam.pb2.VideoClub.Producto;
import ar.edu.unlam.pb2.VideoClub.ProductoNoEncontrado;
import ar.edu.unlam.pb2.VideoClub.TipoDeConsola;
import ar.edu.unlam.pb2.VideoClub.Vendible;
import ar.edu.unlam.pb2.VideoClub.VideoClub;
import ar.edu.unlam.pb2.VideoClub.VideoJuego;

public class VideoClubTest {

	@Test
	public void queSePuedaCrearUnaPelicula() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final String ACTOR_1_ESPERADO = "Guillermo Francella";
		final String ACTOR_2_ESPERADO = "Emilio Disi";
		final Integer CALIFICACION_ESPERADA = 0;

		// Ejecuci�n
		Pelicula pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO,
				ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO, CALIFICACION_ESPERADA);
		pelicula.agregarActor(ACTOR_1_ESPERADO);
		pelicula.agregarActor(ACTOR_2_ESPERADO);

		// Validaci�n
		assertEquals(CODIGO_ESPERADO, pelicula.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, pelicula.getDescripcion());
		assertEquals(GENERO_ESPERADO, pelicula.getGenero());
		assertEquals(ANO_DE_ESTRENO_ESPERADO, pelicula.getAnio());
		assertEquals(DIRECTOR_ESPERADO, pelicula.getDirector());
		assertTrue(pelicula.actua(ACTOR_1_ESPERADO));

	}

	@Test
	public void queSePuedaCrearUnVideojuego() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		final Integer CALIFICACION_ESPERADA = 0;

		// Ejecuci�n
		VideoJuego juego = new VideoJuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA,
				CALIFICACION_ESPERADA);

		// Validaci�n
		assertEquals(CODIGO_ESPERADO, juego.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, juego.getDescripcion());
		assertEquals(CONSOLA_ESPERADA, juego.getTipo());

	}

	@Test
	public void queSePuedaCrearUnLibro() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";

		// Ejecuci�n
		Libro libro = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);

		// Validaci�n
		assertEquals(CODIGO_ESPERADO, libro.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, libro.getDescripcion());
		assertEquals(AUTOR_ESPERADO, libro.getAutor());
		assertEquals(EDITORIAL_ESPERADA, libro.getEditorial());

	}

	@Test
	public void queSePuedaCrearUnComestible() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Chomps";

		// Ejecuci�n
		Comestibles comestible = new Comestibles(CODIGO_ESPERADO, DESCRIPCION_ESPERADA);

		// Validaci�n
		assertEquals(CODIGO_ESPERADO, comestible.getCodigo());
		assertEquals(DESCRIPCION_ESPERADA, comestible.getDescripcion());
	}

	@Test
	public void queUnaPeliculaSeaVendible() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Exterminators II";
		final Genero GENERO_ESPERADO = Genero.ACCION;
		final Integer ANO_DE_ESTRENO_ESPERADO = 1993;
		final String DIRECTOR_ESPERADO = "Carlos Galettini";
		final Integer PRECIO_VENTA = 5000;
		final Integer CALIFICACION_ESPERADA = 0;

		// Ejecuci�n
		Vendible pelicula = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO,
				ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO, CALIFICACION_ESPERADA);
		pelicula.setPrecioDeVenta(PRECIO_VENTA);
		;

		// Validaci�n
		assertEquals(PRECIO_VENTA, pelicula.getPrecioDeVenta());
	}

	@Test
	public void queUnJuegoSeaAlquilable() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fornite";
		final TipoDeConsola CONSOLA_ESPERADA = TipoDeConsola.PLAY_STATION;
		final Integer PRECIO_ALQUILER = 500;
		final Integer CALIFICACION_ESPERADA = 0;

		// Ejecuci�n
		Alquilable juego = new VideoJuego(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, CONSOLA_ESPERADA,
				CALIFICACION_ESPERADA);
		juego.setPrecioAlquiler(PRECIO_ALQUILER);

		// Validaci�n
		assertEquals(PRECIO_ALQUILER, juego.getPrecioDeAlquiler());
	}

	@Test
	public void queSePuedaCrearUnCliente() {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Oculto";
		final Integer EDAD_ESPERADA = 23;

		// Ejecuci�n
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, NOMBRE_ESPERADO, APELLIDO_ESPERADO, EDAD_ESPERADA);

		// Validaci�n
		assertEquals(CODIGO_ESPERADO, nuevoCliente.getCodigoCliente());
		assertEquals(NOMBRE_ESPERADO, nuevoCliente.getNombre());
		assertEquals(APELLIDO_ESPERADO, nuevoCliente.getApellido());
		assertEquals(EDAD_ESPERADA, nuevoCliente.getEdad());

	}

	@Test
	public void queSePuedaVenderUnLibro() throws ProductoNoEncontrado {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Fifty Shades of Grey";
		final String AUTOR_ESPERADO = "E. L. James";
		final String EDITORIAL_ESPERADA = "Vintage Books";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.VENDIDO;

		// Ejecuci�n
		VideoClub video = new VideoClub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Libro(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, AUTOR_ESPERADO, EDITORIAL_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);

		video.agregarProducto(nuevoProducto);

		// Validaci�n
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstado());
		assertTrue(video.vender(nuevoProducto, nuevoCliente));
		// assertEquals(NOMBRE_ESPERADO,
		// video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstado());
	}

	@Test
	public void queSePuedaAlquilarUnaPelicula() throws ProductoNoEncontrado {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final String ACTOR_1_ESPERADO = "Natalie Portman";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
		final Integer CALIFICACION_ESPERADA = 0;

		// Ejecuci�n
		VideoClub video = new VideoClub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO,
				ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO, CALIFICACION_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);

		video.agregarProducto(nuevoProducto);

		// Validaci�n
		assertEquals(ESTADO_INICIAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstado());
		assertTrue(video.alquilar(nuevoProducto, nuevoCliente));
		// assertEquals(NOMBRE_ESPERADO,
		// video.buscarProducto(nuevoProducto).getQuienPoseeElProducto().getNombre());
		assertEquals(ESTADO_FINAL_ESPERADO, video.buscarProducto(nuevoProducto).getEstado());
	}

	@Test(expected = ProductoNoEncontrado.class)
	public void queSeNoSePuedaVenderUnComestibleVendido() throws ProductoNoEncontrado {
		// Preparaci�n
		VideoClub video = new VideoClub("blockBuster");
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "Chomps";

		// Ejecuci�n
		Producto comestible = new Comestibles(CODIGO_ESPERADO, DESCRIPCION_ESPERADA);
		video.vender(comestible, null);

		// Validaci�n

	}

	@Test
	public void queSeNoSePuedaAlquilarUnPeliculaAlquilada() throws ProductoNoEncontrado {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final String ACTOR_1_ESPERADO = "Natalie Portman";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
		final Integer CALIFICACION_ESPERADA = 0;

		// Ejecuci�n
		VideoClub video = new VideoClub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO,
				ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO, CALIFICACION_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);

		video.agregarProducto(nuevoProducto);
		video.alquilar(nuevoProducto, nuevoCliente);
		// Validaci�n

		Estado actual = nuevoProducto.getEstado();

		assertEquals(actual, ESTADO_FINAL_ESPERADO);
	}

	@Test
	public void queLuegoDeDevueltaUnaPeliculaSePuedaAlquilar() throws ProductoNoEncontrado {
		// Preparaci�n
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final String ACTOR_1_ESPERADO = "Natalie Portman";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
		final Integer CALIFICACION_ESPERADA = 0;

		// Ejecuci�n
		VideoClub video = new VideoClub(NOMBRE_VIDEOCLUB);
		Producto nuevoProducto = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO,
				ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO, CALIFICACION_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);

		video.agregarProducto(nuevoProducto);
		video.alquilar(nuevoProducto, nuevoCliente);
		video.devolverProducto(nuevoProducto);
		// Validaci�n

		Estado actual = nuevoProducto.getEstado();

		assertEquals(actual, ESTADO_INICIAL_ESPERADO);
	}
	
	@Test
	public void queSeNoSePuedaAlquilarUnPeliculaAUnMenor() throws ProductoNoEncontrado {
		final Integer CODIGO_ESPERADO = 1;
		final String DESCRIPCION_ESPERADA = "El Cisne Negro";
		final Genero GENERO_ESPERADO = Genero.SUSPENSO;
		final Integer ANO_DE_ESTRENO_ESPERADO = 2010;
		final String DIRECTOR_ESPERADO = "Darren Aronofsky";
		final String ACTOR_1_ESPERADO = "Natalie Portman";
		final String NOMBRE_VIDEOCLUB = "Blockbuster";
		final Integer CODIGO_CLIENTE_ESPERADO = 1;
		final String NOMBRE_ESPERADO = "Camila";
		final String APELLIDO_ESPERADO = "Privado";
		final Integer EDAD_ESPERADA = 23;
		final Estado ESTADO_INICIAL_ESPERADO = Estado.DISPONIBLE;
		final Estado ESTADO_FINAL_ESPERADO = Estado.ALQUILADO;
		final Integer CALIFICACION_ESPERADA = 0;

		// Ejecuci�n
		VideoClub video = new VideoClub(NOMBRE_VIDEOCLUB);
		Pelicula nuevoProducto = new Pelicula(CODIGO_ESPERADO, DESCRIPCION_ESPERADA, GENERO_ESPERADO,
				ANO_DE_ESTRENO_ESPERADO, DIRECTOR_ESPERADO, CALIFICACION_ESPERADA);
		Cliente nuevoCliente = new Cliente(CODIGO_ESPERADO, APELLIDO_ESPERADO, NOMBRE_ESPERADO, EDAD_ESPERADA);

		video.agregarProducto(nuevoProducto);
		video.alquilar(nuevoProducto, nuevoCliente);
		assertTrue(video.calificacionDelPelicula(nuevoProducto, nuevoCliente));
	}

}
