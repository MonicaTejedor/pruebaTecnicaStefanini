
package com.stefanini.usuarios.modelo;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * <b>Descripción:<b> Clase que contiene la entidad usuarios
 *<b>Caso de Uso:<b> Prueba técnica Stefanini y Banco Unión S.A.
 * 
 * @author Mónica Andrea Tejedor Parrado
 * @version 1.0
 */
@Entity
@Table(name = "usuarios")
public class Usuarios {

	/**
	 *Atributo que determina el id del usuario
	 *Se genera automáticamente y de manera consecutiva en la base de datos
	 */
	@Id
	@Column(name = "id_usuarios")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	
	/**
	 *Atributo que determina el nombre del usuario
	 */
	@Column(name = "nombre_usuario")
	private String nombreUsuario;
	
	/**
	 *Atributo que determina el tipo de documento del usuario
	 */
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	
	/**
	 *Atributo que determina el número de documento del usuario
	 */
	@Column(name = "documento")
	private String numeroDocumento;
	
	/**
	 *Atributo que determina la categoría del usuario
	 */
	@Column(name = "categoria")
	private String categoria;
	
	/**
	 *Atributo que determina si el usuario tiene tarjeta
	 */
	@Column(name = "tarjeta")
	private Boolean tarjeta;
	
	/**
	 *Atributo que determina la fecha y hora de registro del usuario
	 */
	@Column(name = "fecha_registro")
	private LocalDateTime fechaRegistro;	
	
	/**
	 * Constructor vacío
	 */
	public Usuarios() {
		super();
	}



	/**
	 * @param idUsuario
	 * @param nombreUsuario
	 * @param tipoDocumento
	 * @param numeroDocumento
	 * @param categoria
	 * @param tarjeta
	 * @param fechaRegistro
	 */
	public Usuarios(int idUsuario, String nombreUsuario, String tipoDocumento, String numeroDocumento, String categoria,
			Boolean tarjeta, LocalDateTime fechaRegistro) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.categoria = categoria;
		this.tarjeta = tarjeta;
		this.fechaRegistro = fechaRegistro;
	}



	/**
	 * @return the idUsuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}



	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}



	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}



	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}



	/**
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}



	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}



	/**
	 * @return the numeroDocumento
	 */
	public String getNumeroDocumento() {
		return numeroDocumento;
	}



	/**
	 * @param numeroDocumento the numeroDocumento to set
	 */
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}



	/**
	 * @return the categoria
	 */
	public String getCategoria() {
		return categoria;
	}



	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}



	/**
	 * @return the tarjeta
	 */
	public Boolean getTarjeta() {
		return tarjeta;
	}



	/**
	 * @param tarjeta the tarjeta to set
	 */
	public void setTarjeta(Boolean tarjeta) {
		this.tarjeta = tarjeta;
	}



	/**
	 * @return the fechaRegistro
	 */
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}



	/**
	 * @param fechaRegistro the fechaRegistro to set
	 */
	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	
	
	
}
