/**
 * 
 */
package com.stefanini.usuarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stefanini.usuarios.modelo.Usuarios;

/**
 * 
 * <b>Descripción:<b> Interfaz que extiende de JPARepository
 *<b>Caso de Uso:<b> Prueba técnica Stefanini y Banco Unión S.A.
 * 
 * @author Mónica Andrea Tejedor Parrado
 * @version 1.0
 */
public interface IUsuariosRepositorio extends JpaRepository<Usuarios, Integer>{

}
 