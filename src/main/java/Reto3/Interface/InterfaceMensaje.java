/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Reto3.Interface;

import Reto3.Modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Juan Carlos Diaz Peña
 */
public interface InterfaceMensaje extends CrudRepository<Mensaje,Integer>{
    
}
