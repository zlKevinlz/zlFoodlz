
package ejercicio2;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Computer")

public class Computador implements Serializable {

    @Id
    private String serie;
    
    @Column(nullable = false, length = 100)
    private String marca;
    
    @Column(nullable = false, length = 30)
    private String color;
    
    @Column(precision = 4)
    private Integer modelo;
    
    @Column(nullable = false)
    private Boolean todoEnUno;

    public Computador() {
    }

    public Computador(String serie, String marca, String color) {
        this.serie = serie;
        this.marca = marca;
        this.color = color;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    }

    public Boolean getTodoEnUno() {
        return todoEnUno;
    }

    public void setTodoEnUno(Boolean todoEnUno) {
        this.todoEnUno = todoEnUno;
    }

}

