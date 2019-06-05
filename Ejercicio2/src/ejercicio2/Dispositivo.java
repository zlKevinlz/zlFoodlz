
package ejercicio2;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public  abstract class Dispositivo implements Serializable {
    @ Id
    private String Serial;
    
    @Column (nullable = false)
    private String Color;
    
    @Column (precision = 4)
    private String Modelo;

    public Dispositivo(String Serial, String Color, String Modelo) {
        this.Serial = Serial;
        this.Color = Color;
        this.Modelo = Modelo;
    }

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String Serial) {
        this.Serial = Serial;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }
    
    
    
}
