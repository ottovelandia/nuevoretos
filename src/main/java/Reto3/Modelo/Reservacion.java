/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *Tabla Reservacion que hereda los atributos del entity Serializable
 * @author Juan Carlos Diaz Peña
 */
@Entity
@Table(name ="reservation")
public class Reservacion implements Serializable {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idReservation;
    private Date startDate;
    private Date devolutionDate;
    private String status="created";
    
    /**
     *Relación entre las tablas muchos a uno entre la tabla reservations y 
     * farm
     */
           
    @ManyToOne
    @JoinColumn(name = "id")
    @JsonIgnoreProperties("reservations")
    private Finca farm;
    
    /**
     * Relacion de uno a muchos entre la tabla reservations y messages
     * utilizando el id cliente 
     */
    
    @ManyToOne
    @JoinColumn(name = "idCliente")
    @JsonIgnoreProperties({"reservations","messages"})
    private Cliente client;
    
    /**
     * Atributo score para ejecutar las relaciones 
     */
    
    private String score;
    
    /**
     * El Metodo get nos sirve para leer en idReservation que se genera 
     * en la tabla reservation
     * @return Retorna el id de la tabla reservatión
     */

    public Integer getIdReservation() {
        return idReservation;
    }
    
    /**
     * Metodo de datos de entrada en la tabla atributo que permite modificar 
     * idReservation 
     * @param idReservation Corresponde al id de la tabla reservation 
     */

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }
    
    /**
     * El Metodo get nos sirve para leer startDate en la tabla reservation
     * @return retorna el campo startDate que se genera  de la tabla 
     * reservation
     */

    public Date getStartDate() {
        return startDate;
    }
    
    /**
     * Metodo de datos de entrada en la tabla reservation que permite modificar
     * atributo startDate de la tabla reservation
     * @param startDate parametro del campo startDate de la tabla reservation 
     */

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
        
    }
    
    /**
     * El Metodo get nos sirve para leer devolutionDate el campo en 
     * la tabla reservation
     * 
     * @return retorna el campo el campo devolutionDate que se genera  
     * de la tabla reservation 
     */

    public Date getDevolutionDate() {
        return devolutionDate;
    }
    
    /**
     * Metodo de datos de entrada en la tabla reservation que permite modificar
     * atributo devolutionDate de la tabla reservation
     * @param devolutionDate parametro del campo devolutionDate de la tabla
     * reservation 
     */

    public void setDevolutionDate(Date devolutionDate) {
        this.devolutionDate = devolutionDate;
    }
    /**
     * El Metodo get nos sirve para leer getStatus del campo en la tabla
     * reservation 
     * @return retorna el campo status que se genera en la tabla reservation 
     */

    public String getStatus() {
        return status;
    }
    
    /**
     * Metodo de datos de entrada en la tabla reservation que permite modificar
     * atributo status de la tabla reservation
     * @param status parametro del campo status de la tabla reservation
     */

    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * El Metodo get nos sirve para leer la relacion entre Farm la tabla finca
     * de la tabla finca y lo relaciona en una tabla intermedia  
     * @return retorna el valor far de la trabla Reservation
     */

    public Finca getFarm() {
        return farm;
    }
    
    /**
     * Metodo de datos de entrada en la tabla reservation que permite modificar
     * de la tabla finca y lo relaciona en una tabla intermedia  
     * @param farm parametro del campo far de la tabla intermedia finca 
     */

    public void setFarm(Finca farm) {
        this.farm = farm;
    }
    
    /**
     * El Metodo get nos sirve para leer la relacion entre la tabla reservation
     * y latabla cliente del parametro client
     * @return retorna el parametro cliente de la tabla inrmedia entre 
     * reservacion y cliente 
     */

    public Cliente getClient() {
        return client;
    }
    
    /**
     * Metodo de datos de entrada en la tabla reservation que permite modificar
     * la relacion entre la tabla reservation y cliente 
     * @param client parametro cliente de la tabla cliente que se relaciona 
     * con la tabla reservation 
     */

    public void setClient(Cliente client) {
        this.client = client;
    }
    
    /**
     * Metodo del metodo Score que nos permite tener control del metodo 
     * para que nos retorne un valor null al momento de correr el api 
     * @return retorna el parametro score
     */

    public String getScore() {
        return score;
    }
    
    /**
     * Metodo para leer el score del metodo 
     * @param score parametro score
     */

    public void setScore(String score) {
        this.score = score;
    }
    
    
    
}
