
package ejercicio2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Mouse")
public class Mouse extends Dispositivo {
@Id
    
    @Column (nullable = false)
    private String conexion;

    @Column (nullable = false)
    private Boolean optico;

    public Mouse(String Serial, String Color, String Modelo) {
        super(Serial, Color, Modelo);
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public Boolean getOptico() {
        return optico;
    }

    public void setOptico(Boolean optico) {
        this.optico = optico;
    }
    
}
