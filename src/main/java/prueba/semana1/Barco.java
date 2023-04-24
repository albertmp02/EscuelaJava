package prueba.semana1;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Barco.java Clase para el objecto Barco
 *
 * @autor: Antoni
 * @revisor: Carlos
 * @version: 1.0
 */
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Barco extends Vehiculo {
    private String tipoBarco;
    protected static final String TIPO = "Barco";

    /**
     * Constructor de la clase Barco.
     *
     * @param color     El color del Barco.
     * @param marca     La marca del Barco.
     * @param precio    El precio del Barco.
     * @param matricula La matricula del Barco.
     * @param tipoBarco El tipo de Barco.
     */
    public Barco(String color, String marca, String precio, String matricula, String tipoBarco) {
        super(color, marca, precio, matricula, 0);
        this.tipoBarco = tipoBarco;

    }

    /**
     * Devuelve el tipoBarco.
     *
     * @return String
     */
    public String getTipoBarco() {
        return tipoBarco;
    }

    @Override // <- Bien por el uso de Override
    public void imprimirDatos() {
        System.out.println("Este vehiculo es un barco");
        System.out.println("Este barco es de tipo" + tipoBarco);
        super.imprimirDatos();
    }

}
