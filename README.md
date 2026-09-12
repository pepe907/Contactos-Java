# 📇 Proyecto Contactos Java (v1.0)

¡Hola! Este es mi proyecto en Java de consola para gestionar contactos. Lo armé aplicando Programación Orientada a Objetos (POO) básica, usando un `ArrayList` para guardar todo en memoria y un menú interactivo en la terminal para que sea fácil de usar.

---

## 📂 ¿Cómo está organizado el código?

El proyecto está dividido en tres clases principales que se comunican entre sí:

* **`Persona.java` (El molde):** Representa a cada contacto individual. Guarda lo esencial: el `nombre`, una `descripcion` y el `telefono`. Incluye su constructor y todos sus `getters` y `setters`.
* **`Contacto.java` (El gestor):** Aquí es donde guardo la lista (`ArrayList<Persona>`) y toda la lógica para administrar los registros:
  * **Agregar:** Crea el objeto y lo manda directo al `ArrayList`.
  * **Ver:** Recorre la lista con un bucle para mostrar los detalles de cada contacto en pantalla.
  * **Editar:** Busca al contacto por su nombre y le actualiza la descripción y el teléfono si lo encuentra.
  * **Eliminar:** Busca al contacto por su nombre para sacarlo de la lista.
* **`Main.java` (La interfaz):** Es la clase que corre el programa. Usa un `Scanner` para atrapar lo que escribes y levanta un menú en bucle (`do-while`) para que puedas moverte por las opciones sin tener que reiniciar la app a cada rato.

---

## 🕹️ ¿Cómo funciona el menú?

Cuando pones a correr la aplicación, te vas a encontrar con estas opciones en la consola:

* `1` ➔ **Agregar Contactos:** Te pide el nombre, la descripción y el teléfono para guardarlos al instante.
* `2` ➔ **Ver Contactos:** Te imprime la lista completa de todo lo que tienes guardado hasta el momento.
* `3` ➔ **Editar Contacto:** Te pregunta el nombre del contacto que buscas y te deja actualizar sus datos.
* `4` ➔ **Eliminar Contacto:** Busca al contacto por su nombre para removerlo del sistema.
* `0` ➔ **Salir:** Cierra el programa de forma limpia.

---

## 🚀 Próximas mejoras (v1.1)
* Asegurarme de que el método de eliminar borre físicamente el elemento de la lista (`personas.remove(i)`).
* Agregar validaciones para evitar que se dupliquen nombres o que el sistema falle si ingresas una letra donde va un número.
