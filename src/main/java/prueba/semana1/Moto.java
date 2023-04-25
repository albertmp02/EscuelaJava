package prueba.semana1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Moto.java Clase para el objecto Moto
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Moto extends Vehiculo {
	@Column
    private String tipoMoto;
    protected static final String TIPO = "Moto";

    /**
     * contructor de la clase moto.
     */
    public Moto(String color, String marca, String precio, String matricula, String tipoMoto) {
        super(color, marca, precio, matricula, 2); // Una moto siempre tiene 2 ruedas
        this.tipoMoto = tipoMoto;

    }

    public String getTipoMoto() {
        return tipoMoto;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es una moto");
        System.out.println("Esta moto es de tipo " + tipoMoto);
        super.imprimirDatos();
    }
}
