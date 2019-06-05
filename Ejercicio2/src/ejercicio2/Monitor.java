
package ejercicio2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Monitor")

public class Monitor extends Dispositivo {
@Id

    @Column (nullable = false)
    private Double pulgadas;
    
    @Column (nullable = false)
    private Boolean esPlano;

    public Monitor(String Serial, String Color, String Modelo) {
        super(Serial, Color, Modelo);
    }

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getEsPlano() {
        return esPlano;
    }

    public void setEsPlano(Boolean esPlano) {
        this.esPlano = esPlano;
    }
    
    
}

