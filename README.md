# 📇 Proyecto Contactos Java (v1.1)

¡Hola! Esta es la versión 1.1 de mi proyecto en consola en Java para gestionar contactos. Se aplicó Programación Orientada a Objetos (POO), manejo de excepciones para entradas seguras, validación contra duplicados y un borrado físico correcto en el `ArrayList`.

---

## 📂 ¿Cómo está organizado el código?

El proyecto está dividido en cuatro clases principales:

* **`Persona.java` (El molde):** Representa a cada contacto individual con su `nombre`, `descripcion` y `telefono`, incluyendo constructores, `getters` y `setters`.
* **`Contacto.java` (El gestor y lógica):** Administra el `ArrayList<Persona>`:
    * **Agregar:** Valida que el número telefónico no esté registrado previamente para evitar duplicados.
    * **Ver:** Recorre la lista mostrando los detalles en pantalla.
    * **Editar:** Busca al contacto por su nombre para actualizar sus datos.
    * **Eliminar:** Localiza al contacto por su nombre y lo remueve físicamente de la lista usando `personas.remove(i)`.
* **`Error.java` (Validador de entradas):** Clase utilitaria encargada de capturar excepciones (`NumberFormatException`) para evitar que el programa colapse si el usuario introduce letras en campos numéricos.
* **`Main.java` (La interfaz):** Controla el flujo del menú interactivo en bucle utilizando la clase `Error` para asegurar entradas limpias y seguras.

---

## 🕹️ ¿Cómo funciona el menú?

* `1` ➔ **Agregar Contactos:** Pide los datos asegurando que el teléfono no esté duplicado en el sistema.
* `2` ➔ **Ver Contactos:** Imprime la lista completa de registros actuales.
* `3` ➔ **Editar Contacto:** Actualiza la información del contacto buscado por su nombre.
* `4` ➔ **Eliminar Contacto:** Remueve físicamente al contacto del sistema de forma limpia.
* `0` ➔ **Salir:** Cierra la aplicación de manera correcta.

---

## 🚀 Próximas mejoras (v1.2)
* Implementar persistencia de datos (guardado en archivos o base de datos) para no perder los contactos al cerrar la consola.
* Añadir validaciones para evitar nombres duplicados o búsquedas insensibles a mayúsculas y minúsculas.