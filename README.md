***Clase Cafe:***

Se definen los atributos requeridos; Gramos de café, Mililitros de agua, Tamaño (Pequeño, Mediano, Grande). Se crea el constructor vacio y el con atributos.
Todos los atributos tienen getters pero no necesariamente setters. Se incluye método toString.

También tiene una clase Test asociada.

***Clase Alfajor:***

Se definen los atributos requeridos; Color del alfajor, Tamaño, Relleno. Se crea el constructor vacio y el con atributos.
Todos los atributos tienen getters pero no necesariamente setters. Se incluye método toString.

También tiene una clase Test asociada.

***Clase Cafeteria:***

Se definen los atributos requeridos; Nombre, dirección, redes sociales(ArrayList de String), listaCafes(ArrayList de Cafe) Constructor vacio y con atributos. Getters de todos los atributos y setters necesarios. Métodos void agregarCafe, eliminaCafe, buscarCafe, agregarRedSocial. Se incluye método toString

Se incluyen pruebas asociadas a todos los métodos.

El programa no incluye la clase Main para ejecución, ya que no estaba considerado en las instrucciones.

Si se quisiera ejecutar el programa, habría que crear la clase e inicializar los objetos, a elección.

***Relación entre clases:***

La clase Cafeteria tiene una asociación respecto a las Clases Alfajor y Cafe, ya que utiliza un objeto de cada clase ***dentro de sus atributos***, los cuales son listaCafes y listaAlfajores.