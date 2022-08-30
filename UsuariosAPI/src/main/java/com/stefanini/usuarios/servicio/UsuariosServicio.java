/**
 * 
 */
package com.stefanini.usuarios.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stefanini.usuarios.modelo.Usuarios;
import com.stefanini.usuarios.repositorio.IUsuariosRepositorio;

/**
 * 
 * <b>Descripción:<b> Clase que contiene los métodos para el funcionamiento de
 * la API <b>Caso de Uso:<b> Prueba técnica Stefanini y Banco Unión S.A.
 * 
 * @author Mónica Andrea Tejedor Parrado
 * @version 1.0
 */
@Service
public class UsuariosServicio {

	/**
	 * Sobreescritura del repositorio
	 */
	@Autowired
	private IUsuariosRepositorio repositorio;

	/**
	 * Método que permite consultar todos los usuarios
	 */
	public List<Usuarios> consultarUsuarios() {
		return repositorio.findAll();
	}

	/**
	 * Método que permite guardar un usuario
	 */
	public void guardarUsuario(Usuarios usuario) {
		repositorio.save(usuario);
	}

	/**
	 * Método que permite consultar un usuario, mediante el id de usuario
	 */
	public Usuarios obtenerUsuario(Integer idUsuario) {
		return repositorio.findById(idUsuario).get();
	}

	/**
	 * Método que permite eliminar un usuario, mediante el id de usuario
	 */
	public void eliminarUsuario(Integer idUsuario) {
		repositorio.deleteById(idUsuario);
	}
}
