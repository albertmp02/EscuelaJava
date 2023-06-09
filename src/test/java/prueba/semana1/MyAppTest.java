/*
 * Copyright (c) 2016-2023 Sinensia and contributors
 *
 * This work is dual-licensed under the Apache License 2.0
 * and European Union Public License. See LICENSE file for details.
 */

package prueba.semana1;

import org.apache.logging.log4j.core.Logger;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * JavaDoc Summary.
 *
 * @since 1.0.0
 * @author Carlos Arranz
 */

public class MyAppTest {
	
	VehiculoManager vehiculoManager;
	
	@BeforeClass
	public void setUp() {
		vehiculoManager = new VehiculoManager();
	}
	
	@Test
	public void crearCocheTest() {
		vehiculoManager.runAccion();
	}

}
