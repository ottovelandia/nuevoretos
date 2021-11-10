/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Juan Calos Diaz Peña
 */
@Entity
@Table(name = "farm")
/**
 * Clase de la tabla principal del proyecto finca 
 */
public class Finca implements Serializable {
       @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name; 
    private String address;
    private Integer  extension; 
    private String description;
    
    /**
     * Relación de muchos a uno entre la tabla cateroria y farms
     */
    @ManyToOne
    @JoinColumn(name="categoryid")
    @JsonIgnoreProperties("farms")
    private Categoria category;
    /**
     * Relación de uno a muchos entre la tabla farm client 
     */
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "farm")
    @JsonIgnoreProperties({"farm","client"})
    private List<Mensaje> messages;
    /**
     * Relación de uno a muchos entre la tabla Message y farm
     */

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "farm")
    @JsonIgnoreProperties({"farm","message"})
    public List<Reservacion> reservations;
    
    /**
     * El Metodo get nos sirve para leer en id que se genera en la tabla Farm 
     * @return Retorna el id de la tabla
     */

    public Integer getId() {
        return id;
    }
    
    /**
     * Metodo de datos de entrada en la tabla atributo que permite modificar id
     * @param id corresponde al id de la tabla finca o farm
     */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * El Metodo get nos sirve para leer en name que se genera en la tabla Farm
     * @return Retorna el name de la tabla
     */

    public String getName() {
        return name;
    }
    /**
     * Metodo de datos de entrada en la tabla atributo que permite modificar 
     * name
     * @param name corresponde al name de la tabla finca o farm
     */

    public void setName(String name) {
        this.name = name;
    }
    /**
     * El Metodo get nos sirve para leer en Address que se genera en la tabla 
     * Farm este atributo de la tabla es de tipo String
     * @return Retorna la address ingresada en la tabla
     */

    public String getAddress() {
        return address;
    }
    /**
     * Metodo de datos de entrada en la tabla atributo que permite modificar 
     * address
     * @param address corresponde al address o direcciónn de la tabla finca o 
     * farm
     */

    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * El Metodo get nos sirve para leer el parametro extension que se genera 
     * en la tabla Farm
     * @return Reorna el parametro extension de la tabla Farm  
     */

    public Integer getExtension() {
        return extension;
    }
    
    /**
     * Metodo de datos de entrada en la tabla atributo que permite modificar 
     * extension
     * @param extension corresponde al exension de la tabla finca o farm
     */

    public void setExtension(Integer extension) {
        this.extension = extension;
    }
    
    /**
     * El Metodo get nos sirve para leer el parametro description que se genera
     * en la tabla Farm
     * @return retorna la description de la tabla Farm
     */

    public String getDescription() {
        return description;
    }
    /**
     * Metodo de datos de entrada en la tabla atributo que permite modificar
     * el parametro description 
     * @param description corresponde a la description de la tabla finca o farm
     */

    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * El Metodo get nos sirve para leer el parametro category que se genera
     * en la tabla Farm
     * @return retorna la category de la tabla Farm
     */

    public Categoria getCategory() {
        return category;
    }
    /**
     * Metodo de datos de entrada en la tabla atributo que permite modificar
     * el parametro category  
     * @param category corresponde a la category de la tabla finca o farm
     */

    public void setCategory(Categoria category) {
        this.category = category;
    }
    /**
     * El Metodo get nos sirve para leer el parametro description que se genera
     * en la tabla Farm
     * @return retorna la messages de la tabla Farm
     */

    public List<Mensaje> getMessages() {
        return messages;
    }
    /**
     * Metodo de datos de entrada en la tabla atributo que permite modificar
     * el parametro messages
     * @param messages corresponde a la messages de la tabla finca o farm
     */

    public void setMessages(List<Mensaje> messages) {
        this.messages = messages;
    }
    /**
     * El Metodo get nos sirve para leer el parametro reservations que se genera
     * en la tabla Farm
     * @return retorna la reservations de la tabla Farm
     */

    public List<Reservacion> getReservations() {
        return reservations;
    }
    /**
     * Metodo de datos de entrada en la tabla atributo que permite modificar
     * el parametro messages reservations
     * @param reservations corresponde a la reservations de la tabla finca
     * o farm
     */

    public void setReservations(List<Reservacion> reservations) {
        this.reservations = reservations;
    }
    
    
   
   
    
    
}
