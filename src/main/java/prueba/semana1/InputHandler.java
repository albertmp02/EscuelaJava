package prueba.semana1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Se encarga de la entrada de datos por teclado.
 */
public class InputHandler {
    private Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * Metodo para pedir el vehiculo al usuario.
     *
     * @return int opcion
     */

    public Integer getTipoVehiculo() {
        List<String> options = Arrays.asList(
                "Coche",
                "Moto",
                "Barco",
                "Salir");
        return getUserInput("Por favor, seleccione una opción:", options);
    }

    /**
     * Metodo para pedir la acción al usuario.
     *
     * @return int opcion
     */
    public Integer getAccion() {
        List<String> options = Arrays.asList(
                "Arrancar",
                "Parar",
                "Avanzar",
                "Retroceder",
                "Mostrar datos",
                "Salir");
        return getUserInput("Por favor, seleccione una acción:", options);
    }

    private int getUserInput(String message, List<String> options) {

        System.out.println(message);
        for (int i = 0; i < options.size(); i++) {
            System.out.printf("%d : %s%n", i, options.get(i));
        }

        while (!scanner.hasNextInt()) {
            System.out.println("Eso no es una opción válida!");
            if (scanner.hasNextLine()) {
                scanner.next(); // importante!
            }
        }

        int respuesta = -1;
        do {
            System.out.println("Por favor elija una de las opciones propuestas.");
            respuesta = scanner.nextInt();
        } while (respuesta < 0 || respuesta >= options.size());

        System.out.printf("Has elegido la opción: %d - %s%n", respuesta, options.get(respuesta));
        return respuesta;
    }

    /**
     * Metodo para pedir los metros al usuario.
     *
     * @return Integer metros
     */
    public Integer getMetros() {

        System.out.println("Por favor introduzca los metros avanzados sin comas.");
        Integer respuesta; // incializamos con valor por defecto
        do {
            System.out.println("Por favor, introduzca un número positivo.");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no son metros válidos!");
                scanner.next(); // importante!
            }
            respuesta = scanner.nextInt();
        } while (respuesta < 0);
        System.out.println("Has introducido: " + respuesta + " metros.");

        return respuesta;

    }

    /**
     * Metodo para resetear el scanner.
     */
    public void reset() {
        this.scanner.reset();
        this.scanner.close();
        this.scanner = new Scanner(System.in);
    }
    
    private Vehiculo getVehiculo() {
    	//Lo hago de esta manera, no se me ocurria otra manera de devolver un Vehiculo
    	Vehiculo vehiculo;
    	Coche coche;
    	String color, marca, precio, matricula;
    	
    	System.out.println("Color:");
    	color = scanner.nextLine();
    	System.out.println("Marca: ");
    	marca = scanner.nextLine();
    	System.out.println("Precio: ");
    	precio = scanner.nextLine();
    	System.out.println("Matricula: ");
    	matricula = scanner.nextLine();
    	
    	coche = new Coche(color, marca, precio, matricula, "");
    	vehiculo = (Vehiculo)coche;
    	
    	return vehiculo;
    }
    
    public Coche getCoche() {
    	Coche coche;
    	Vehiculo vehiculo = getVehiculo();
    	String tipoMarchas;
    	
    	System.out.println("TipoMarchas: ");
    	tipoMarchas = scanner.nextLine();
    	
    	
    	coche = new Coche(vehiculo.getColor(), vehiculo.getMarca(), vehiculo.getPrecio(), vehiculo.getMatricula(), tipoMarchas);
    	return coche;
    }
    
    public Moto getMoto() {
    	Moto moto;
    	Vehiculo vehiculo = getVehiculo();
    	String tipoMoto;
    	
    	System.out.println("TipoMoto: ");
    	tipoMoto = scanner.nextLine();
    	
    	
    	moto = new Moto(vehiculo.getColor(), vehiculo.getMarca(), vehiculo.getPrecio(), vehiculo.getMatricula(), tipoMoto);
    	return moto;
    }
    
    public Barco getBarco() {
    	Barco barco;
    	Vehiculo vehiculo = getVehiculo();
    	String tipoBarco;
    	
    	System.out.println("TipoBarco: ");
    	tipoBarco = scanner.nextLine();
    	
    	
    	barco = new Barco(vehiculo.getColor(), vehiculo.getMarca(), vehiculo.getPrecio(), vehiculo.getMatricula(), tipoBarco);
    	return barco;
    }
}