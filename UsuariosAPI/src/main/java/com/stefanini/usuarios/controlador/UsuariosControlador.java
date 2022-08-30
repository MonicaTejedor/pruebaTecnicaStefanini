/**
 * 
 */
package com.stefanini.usuarios.controlador;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stefanini.usuarios.modelo.Usuarios;
import com.stefanini.usuarios.servicio.UsuariosServicio;


/**
 * 
 * <b>Descripción:<b> Clase que contiene el controlador y las rutas de la API 
 *<b>Caso de Uso:<b> Prueba técnica Stefanini y Banco Unión S.A.
 * 
 * @author Mónica Andrea Tejedor Parrado
 * @version 1.0
 */
@RestController
public class UsuariosControlador {

	/**
	 * Sobreescritura del servicio
	 */
	@Autowired
	private UsuariosServicio servicio;

	/**
	 * Método que permite la consulta de todos los usuarios
	 */
	@GetMapping("/usuarios")
	public List<Usuarios> consultarUsuarios() {
		return servicio.consultarUsuarios();
	}

	/**
	 * Método que permite la consulta de un usuario, mediante el id del usuario
	 */
	@GetMapping("/usuarios/{id}")
	public ResponseEntity<Usuarios> obtenerUsuario(@PathVariable Integer id) {
		try {
			Usuarios usuario = servicio.obtenerUsuario(id);
			return new ResponseEntity<Usuarios>(usuario, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Usuarios>(HttpStatus.NOT_FOUND);
		}

	}

	/**
	 * Método que permite guardar la información de un usuario
	 */
	@PostMapping("/usuarios")
	public void guardarUsuario(@RequestBody Usuarios usuario) {
		LocalDateTime localDate = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formattedLocalDate = localDate.format(formatter);
		usuario.setFechaRegistro(localDate);
		servicio.guardarUsuario(usuario);
	}

	/**
	 * Método que permite la actualización de un usuario, mediante el id de usuario
	 */
	@PutMapping("/usuarios/{id}")
	public ResponseEntity<?> actualizarUsuario(@RequestBody Usuarios usuario, @PathVariable Integer id) {
		try {
			Usuarios usuarioExistente = servicio.obtenerUsuario(id);
			usuarioExistente.setNombreUsuario(usuario.getNombreUsuario());
			usuarioExistente.setTipoDocumento(usuario.getTipoDocumento());
			usuarioExistente.setNumeroDocumento(usuario.getNumeroDocumento());
			usuarioExistente.setCategoria(usuario.getCategoria());
			usuarioExistente.setTarjeta(usuario.getTarjeta());
			
			LocalDateTime localDate = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			String formattedLocalDate = localDate.format(formatter);
			usuarioExistente.setFechaRegistro(localDate);
			servicio.guardarUsuario(usuarioExistente);
			return new ResponseEntity<Usuarios>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Usuarios>(HttpStatus.NOT_FOUND);
		}

	}
	
	/**
	 * Método que permite eliminar un usuario, mediante el id del usuario
	 */
	@DeleteMapping("/usuarios/{id}")
	public void eleiminarUsuario(@PathVariable Integer id) {
		servicio.eliminarUsuario(id);
	}
}
