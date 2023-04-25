package prueba.semana1;

/**
 * VehiculoManager
 * Se encarga de gestionar los Vehiculos.
 */
public class VehiculoManager {
    private Vehiculo vehiculo;
    private DatabaseAccess database;
    
    public VehiculoManager() {
    	database = new DatabaseAccess();
    }

    /**
     * Método para crear un Vehiculo siguiendo el input del usuario.
     *
     * @return Vehiculo vehiculo
     */
    public void createVehiculo() {

        InputHandler inputHandler = new InputHandler();

        Integer tipoVehiculo = inputHandler.getTipoVehiculo();

        switch (tipoVehiculo) {
            case 0: // Coche
                createCoche(inputHandler.getCoche());
                break;
            case 1: // Moto
            	createMoto(inputHandler.getMoto());
                break;
            case 2: // Barco
            	createBarco(inputHandler.getBarco());
                break;
            case 3: // Salir
                break;
            default: // Como default por opcion no incluida, salir
                System.out.println("No se ha encontrado una opción válida.");

        }

    }

    private void createCoche(Coche coche) {
        database.crearVehiculo(coche);
    }

    private void createMoto(Moto moto) {
        database.crearVehiculo(moto);
    }

    private void createBarco(Barco barco) {
        database.crearVehiculo(barco);
    }

    /**
     * pregunta y ejecuta
     * la accion del usuario.
     */
    public boolean runAccion() {

        InputHandler inputHandler = new InputHandler();

        Integer accion = inputHandler.getAccion();

        switch (accion) {
            case 0: // Opcion arranque
                return vehiculo.arrancar();

            case 1: // Opcion parar
                return vehiculo.parar();

            case 2: // Opcion avanzar
                if (vehiculo.isArrancado()) {
                    int metrosAvanzados = inputHandler.getMetros();
                    return vehiculo.avanzar(metrosAvanzados);
                } else {
                    System.out.println(
                            "No puedo avanzar con un vehiculo que no está en marcha,"
                                    + "por favor arranque antes de avanzar.");
                    return false;
                }

            case 3: // Opcion retroceder
                if (vehiculo.isArrancado()) {
                    int metrosRetrocedidos = inputHandler.getMetros();
                    return vehiculo.retroceder(metrosRetrocedidos);
                } else {
                    System.out.println(
                            "No puedo retroceder con un vehiculo que no está en marcha,"
                                    + "por favor arranque antes de avanzar.");
                    return false;
                }
            case 4: // Opcion imprimir datos
                vehiculo.imprimirDatos();
                return false;
            case 5: // Salir
                return true;
            default: // Como default por opcion no incluida, salir
                return true;

        }

    }

}
