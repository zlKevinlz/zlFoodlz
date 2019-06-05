
package ejercicio2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Scanner")
public class Escanner extends Dispositivo {
    @Id
    
    @Column (nullable = false)
    private String conexion;
    
    @Column (nullable = false)
    private String modelo;

    public Escanner(String Serial, String Color, String Modelo) {
        super(Serial, Color, Modelo);
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}
