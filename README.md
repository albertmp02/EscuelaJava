<!-- title: Clase Barco -->

- [1. Clase Barco](#1-clase-barco)
  - [1.1. Descripción](#11-descripción)
  - [1.2. Funcionalidades](#12-funcionalidades)
  - [1.3. Uso](#13-uso)
  - [1.4. Créditos y atribuciones](#14-créditos-y-atribuciones)
  - [1.5. License](#15-license)
- [2. Clase Coche](#2-clase-coche)
  - [2.1. Descripción](#21-descripción)
  - [2.2. Funcionalidades](#22-funcionalidades)
  - [2.3. Uso](#23-uso)
  - [2.4. Créditos y atribuciones](#24-créditos-y-atribuciones)
  - [2.5. License](#25-license)
- [1. Clase Barco](#1-clase-barco)
  - [1.1. Descripción](#11-descripción)
  - [1.2. Funcionalidades](#12-funcionalidades)
  - [1.3. Uso](#13-uso)
  - [1.4. Créditos y atribuciones](#14-créditos-y-atribuciones)
  - [1.5. License](#15-license)
- [1. Clase Barco](#1-clase-barco)
  - [1.1. Descripción](#11-descripción)
  - [1.2. Funcionalidades](#12-funcionalidades)
  - [1.3. Uso](#13-uso)
  - [1.4. Créditos y atribuciones](#14-créditos-y-atribuciones)
  - [1.5. License](#15-license)

# 1. Clase Barco

**Barco**

Este es un proyecto Java que define la clase Barco que extiende la clase Vehiculo.

## 1.1. Descripción

La clase Barco representa un vehículo acuático y se utiliza para instanciar objetos que contienen información sobre el color, la marca, el precio, la matrícula y el tipo de barco. La clase también tiene un método para arrancar el barco y establecer la hora de inicio del viaje.
Funcionalidades

## 1.2. Funcionalidades

La clase Barco tiene las siguientes funcionalidades:

    Constructor: Crea una instancia de Barco con un color, marca, precio, matrícula y tipo de barco.
    getTipoBarco(): Devuelve el tipo de barco.
    arrancar(): Arranca el barco y establece la hora de inicio del viaje. Si el barco ya está en marcha, muestra un mensaje de aviso.
    retroceder(int metros): Retrocede el barco la cantidad de metros indicada. Si el barco no está en marcha, muestra un mensaje de aviso.
    parar(): Para el barco y muestra la hora de inicio y fin del viaje. Si el barco no está en marcha, muestra un mensaje de aviso.
    avanzar(int distancia): Avanza el barco la cantidad de metros indicada. Si el barco no está en marcha, muestra un mensaje de aviso.
    imprimirDatos(): Muestra los datos del barco.

```java
Barco barco = new Barco("Azul", "Marca", "5000", "1234ABC", "Tipo de Barco");
String tipoBarco = barco.getTipoBarco();
barco.arrancar();
```

## 1.3. Uso

**Uso de la clase Barco**

Para utilizar la clase Barco, primero debe instanciar un objeto pasando los argumentos adecuados al constructor. Luego, puede llamar a los métodos getTipoBarco() y arrancar() según sea necesario.

## 1.4. Créditos y atribuciones

Lead Developer - Albert Machio

## 1.5. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

# 2. Clase Coche

**Coche**

Este es un proyecto Java que define la clase Coche que extiende la clase Vehiculo.

## 2.1. Descripción

La clase Coche representa un vehículo terrestre y se utiliza para instanciar objetos que contienen información sobre el color, la marca, el precio, la matrícula y el tipo de marchas. La clase también tiene un método para arrancar el coche y establecer la hora de inicio del viaje.
Funcionalidades

## 2.2. Funcionalidades

La clase Barco tiene las siguientes funcionalidades:

    Constructor: Crea una instancia de Coche con un color, marca, precio, matrícula y tipo de barco.
    getTipoMarchas(): Devuelve el tipo de barco.
    arrancar(): Arranca el coche y establece la hora de inicio del viaje. Si el barco ya está en marcha, muestra un mensaje de aviso.
    retroceder(int metros): Retrocede el coche la cantidad de metros indicada. Si el barco no está en marcha, muestra un mensaje de aviso.
    parar(): Para el coche y muestra la hora de inicio y fin del viaje. Si el barco no está en marcha, muestra un mensaje de aviso.
    avanzar(int distancia): Avanza el coche la cantidad de metros indicada. Si el barco no está en marcha, muestra un mensaje de aviso.
    imprimirDatos(): Muestra los datos del barco.

```java
Coche coche = new Barco("Azul", "Marca", "5000", "1234ABC", "Automático");
String tipoMarcha = barco.getTipoMarcha();
coche.arrancar();
```

## 2.3. Uso

**Uso de la clase Coche**

Para utilizar la clase Coche, primero debe instanciar un objeto pasando los argumentos adecuados al constructor. Luego, puede llamar a los métodos getTipoMarcha() y arrancar() según sea necesario.

## 2.4. Créditos y atribuciones

Lead Developer - Albert Machio

## 2.5. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

# 3. Clase Moto

**Moto**

Este es un proyecto Java que define la clase Moto que extiende la clase Vehiculo.

## 3.1. Descripción

La clase Moto representa un vehículo terrestre y se utiliza para instanciar objetos que contienen información sobre el color, la marca, el precio, la matrícula y el tipo de moto. La clase también tiene un método para arrancar el coche y establecer la hora de inicio del viaje.
Funcionalidades

## 3.2. Funcionalidades

La clase Barco tiene las siguientes funcionalidades:

    Constructor: Crea una instancia de Moto con un color, marca, precio, matrícula y tipo de barco.
    getTipoMoto(): Devuelve el tipo de barco.
    arrancar(): Arranca el coche y establece la hora de inicio del viaje. Si el barco ya está en marcha, muestra un mensaje de aviso.
    retroceder(int metros): Retrocede el coche la cantidad de metros indicada. Si el barco no está en marcha, muestra un mensaje de aviso.
    parar(): Para el coche y muestra la hora de inicio y fin del viaje. Si el barco no está en marcha, muestra un mensaje de aviso.
    avanzar(int distancia): Avanza el coche la cantidad de metros indicada. Si el barco no está en marcha, muestra un mensaje de aviso.
    imprimirDatos(): Muestra los datos del barco.

```java
Moto moto = new Barco("Azul", "Marca", "5000", "1234ABC", "Deportiva");
String tipoMoto = barco.getTipoMoto();
moto.arrancar();
```

## 3.3. Uso
**Uso de la clase Moto**

Para utilizar la clase Moto, primero debe instanciar un objeto pasando los argumentos adecuados al constructor. Luego, puede llamar a los métodos getTipoMoto() y arrancar() según sea necesario.

## 3.4. Créditos y atribuciones

Lead Developer - Albert Machio

## 3.5. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

# 4. Clase DatabaseAccess

**DatabaseAccess**

Una clase que se encarga de los accesos a la base de datos

## 4.1. Descripción

La clase DatabaseAccess se encarga de gestionar la base de datos y de consultar y almacenar vehiculos, segun el usuario lo desee

## 4.2. Funcionalidades

La clase Barco tiene las siguientes funcionalidades:

    Constructor: Crea una instancia de DatabaseAccess.
    cerrarConexion(): Cierra todas las conexiones activas
    crearVehiculo(Vehiculo vehiculo): Crea el vehiculo deseado y lo inserta en la base de datos
    consultarvehiculos(String tipoVehiculo): Consulta el tipo de vehiculo deseado y se trae una lista de la base de datos
    consultarVehiculoPorId(String tipoVehiculo, id): Consulta el id del vehiculo segun su tipoVehiculo y devuelve un vehiculo

```java
DatabaseAccess databaseAccess = new DatabaseAccess
databaseAccess.consultarPorId("MOTO", 1)
databaseAccess.cerrarConexion();
```

## 4.3. Uso
**Uso de la clase DatabaseAccess**

Para utilizar la clase DatabaseAccess, primero se debe instanciar, y ya luego se pueden usar sus metodos

## 4.4. Créditos y atribuciones

Lead Developer - Albert Machio

## 4.5. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

# 5. Clase UserInput

**UserInput**

Una clase que se encarga de gestionar las entradas del usuario

## 5.1. Descripción

La clase UserInput se encarga de recoger todos los inputs del usuario usando Scanner a través de consola

## 5.2. Funcionalidades

La clase Barco tiene las siguientes funcionalidades:

    Constructor: Crea una instancia de UserInput.
    getTipoVehiculo(): Pregunta al usuario que tipo de vehiculo desea crear y devuelve un int dependiendo de cual sea
    getAccion(): Pregunta al usuario que tipo de accion desea realizar, y devuelve un int dependiendo de cual sea
    getUserInput(String message, List<String> options): Método generico para mostrar un mensaje y una serie de opciones a elegir
    getMetros(): Pregunta al usuario el numero de metros avanzados, y lo devuelve
    reset(): Reinicia el scanner
    getVehiculo(): Pide los datos del vehiculo a insertar, y lo devuelve
    getCoche(): Pide los datos del vehiculo a insertar, y lo devuelve
    getMoto(): Pide los datos de la moto a insertar, y la devuelve
    getBarco(): Pide los datos del barco a insertar, y lo devuelve

```java
UserInput userInput = new UserInput();
Coche coche = userInput.getCoche();
```

## 5.3. Uso
**Uso de la clase UserInput**

Para utilizar la clase UserInput, primero se debe instanciar, y ya luego se pueden usar sus metodos

## 5.4. Créditos y atribuciones

Lead Developer - Albert Machio

## 5.5. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.


# 6. Clase VehiculoManager

**VehiculoManager**

Una clase que se encarga de gestionar los vehiculos

## 6.1. Descripción

La clase VehiculoManager se encarga de controlar todos los vehiculos

## 6.2. Funcionalidades

La clase VehiculoManager tiene las siguientes funcionalidades:

    Constructor: Crea una instancia de VehiculoManager.
    createVehiculo(): Pide datos al usuario sobre el vehiculo que debe crear, y lo crea y lo inserta en la base de datos
    createCoche(): Inserta el coche en la base de datos
    createMoto(): Inserta la moto en la base de datos
    createBarco(): Inserta el barco en la base de datos

```java
VehiculoManager vehiculoManager = new VehiculoManager();
vehiculoManager.createVehiculo();
```

## 6.3. Uso
**Uso de la clase VehiculoManager**

Para utilizar la clase VehiculoManager, primero se debe instanciar, y ya luego se pueden usar sus metodos

## 6.4. Créditos y atribuciones

Lead Developer - Albert Machio

## 6.5. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

# 7. Clase Vehiculo

**Vehiculo**

Superclase abstracta que representa todos los vehiculos

## 7.1. Descripción

La clase Vehiculo es una clase abstracta con atributos que comparten todos los vehiculos, como el color

## 7.2. Funcionalidades

La clase VehiculoManager tiene las siguientes funcionalidades:

    Constructor: Crea una instancia de VehiculoManager.
    impirmirDatos(): Imprime los datos génericos de los vehiculos
    arrancar(): Arranca el coche en caso de que no esté arrancado todavia
    parar(): Para el coche en caso de que ya esté arrancado
    retroceder(int distancia): Retrocede unos metros designados por parametros
    avanzar(int distancia): Avanza unos metros designados por parametros
    

```java
(no se puede instanciar, asi que no se deberia usar)
```

## 7.3. Uso
**Uso de la clase Vehiculo**

Como esta clase es abstracta, no se puede isntanciar

## 7.4. Créditos y atribuciones

Lead Developer - Albert Machio

## 7.5. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

# 8. Clase MyApp

**MyApp**

Clase Main encargada de ejecutar el proyecto

## 8.1. Descripción

La clase MyApp contiene un método main y se encarga de ejecutar el proyecto

## 8.2. Funcionalidades

La clase VehiculoManager tiene las siguientes funcionalidades:

    
    main(String[] args): Método en el que se incluira toda la ejecucion del programa

```java
En el método main, se llamarán a los métodos deseados
```

## 8.3. Uso
**Uso de la clase MyApp**

Es la clase main, así que solo se usará en esa misma clase, y se creará el método main ejecutando lo que deseemos

## 8.4. Créditos y atribuciones

Lead Developer - Albert Machio

## 8.5. License

The MIT License (MIT)

Copyright (c) 2015 Chris Kibble

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
