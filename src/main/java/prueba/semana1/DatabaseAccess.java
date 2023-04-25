package prueba.semana1;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseAccess {
	
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private Configuration configuration;
	
	public DatabaseAccess() {
		configuration.configure("hibernate.cfg.xml");
		entityManagerFactory = configuration.buildSessionFactory();
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	public void cerrarConexion() {
		entityManager.close();
		entityManagerFactory.close();
	}

	public void crearVehiculo(Vehiculo vehiculo) {
		if(vehiculo != null) {
			entityManager.getTransaction().begin();
			entityManager.persist(vehiculo);
			entityManager.getTransaction().commit();
			entityManager.close();
		}
	}
	
	public List<Vehiculo> consultarVehiculos(String tipoVehiculo) {
	    entityManager = entityManagerFactory.createEntityManager();
	    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
	    CriteriaQuery<Vehiculo> query = criteriaBuilder.createQuery(Vehiculo.class);
	    Root<Vehiculo> root = query.from(Vehiculo.class); //root vendria siendo el "Vehiculo" por asi decirlo
	    query.select(root);

	    if (tipoVehiculo.equals("Coche")) {
	    	/*
	    	 * //Aqui comparamos la entidad con la clase, y root.type es vehiculo, 
	    	 * y coche es su clase hija, con lo cual, son iguales, con lo cual, 
	    	 * se crea la clausula where en la cual seria equivalente a decir where=Coche
	    	 */
	        query.where(criteriaBuilder.equal(root.type(), Coche.class));
	    } else if (tipoVehiculo.equals("Moto")) {
	        query.where(criteriaBuilder.equal(root.type(), Moto.class));
	    } else if (tipoVehiculo.equals("Barco")) {
	        query.where(criteriaBuilder.equal(root.type(), Barco.class));
	    }

	    List<Vehiculo> vehiculos = entityManager.createQuery(query).getResultList();
	    entityManager.close();
	    return vehiculos;
	}

	
	public Vehiculo consultarVehiculoPorId(String tipoVehiculo, Long id) {
		Vehiculo vehiculoEncontrado = null;
	    CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
	    CriteriaQuery<Vehiculo> query = criteriaBuilder.createQuery(Vehiculo.class);
	    Root<Vehiculo> root = query.from(Vehiculo.class);
	    
	    if (tipoVehiculo.equals("Coche")) {
	        query.select(root).where(criteriaBuilder.and(
	                criteriaBuilder.equal(root.type(), Coche.class),
	                criteriaBuilder.equal(root.get("id"), id)
	        ));
	        /*
	         * La query de arriba seria equivalente a hacer una consulta de la tabla "vehiculo", pero esta tabla
	         * vehiculo no es una entidad mapeada, con lo cual al hacer el query.select(root) estamos seleccionando esa
	         * tabla vehiculo que no esta mapeada, pero digamos que al seleccionar esa tabla lo estamos seleccionando "todo",
	         * por así decirlo
	         */
	        vehiculoEncontrado = entityManager.createQuery(query).getSingleResult();
	    } else if (tipoVehiculo.equals("Moto")) {
	        query.select(root).where(criteriaBuilder.and(
	                criteriaBuilder.equal(root.type(), Moto.class),
	                criteriaBuilder.equal(root.get("id"), id)
	        ));
	        vehiculoEncontrado = entityManager.createQuery(query).getSingleResult();
	    } else if (tipoVehiculo.equals("Barco")) {
	        query.select(root).where(criteriaBuilder.and(
	                criteriaBuilder.equal(root.type(), Barco.class),
	                criteriaBuilder.equal(root.get("id"), id)
	        ));
	        vehiculoEncontrado = entityManager.createQuery(query).getSingleResult();
	    }
	    
	    return vehiculoEncontrado;
	}

	
}
