
package ejercicio2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Keyboard")
public class Teclado {
    @Id
    
    @Column (nullable = false)
    private int Idioma ;
    
    @Column (nullable = false)
    private String Conexion;

    public int getIdioma() {
        return Idioma;
    }

    public void setIdioma(int Idioma) {
        this.Idioma = Idioma;
    }

    public String getConexion() {
        return Conexion;
    }

    public void setConexion(String Conexion) {
        this.Conexion = Conexion;
    }

    public Teclado(int Idioma, String Conexion) {
        this.Idioma = Idioma;
        this.Conexion = Conexion;
    }

  
}
