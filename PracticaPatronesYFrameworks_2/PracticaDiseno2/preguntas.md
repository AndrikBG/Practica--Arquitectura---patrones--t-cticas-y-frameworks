# Respuestas a las preguntas

---

## 2. a) ¿Cómo es el acoplamiento entre la ventana y el manejador?

**Pregunta:** ¿Cómo es el acoplamiento entre la ventana y el manejador? Justifica tu respuesta.

> **Bajo.** Antes, la ventana dependía de una clase concreta, `Manejador`, que se encargaba de toda la implementación. Ahora, la ventana depende de una interfaz, la cual actúa como un contrato que oculta los detalles de la lógica que tiene la clase `ManejadorImpl`. Además, las acciones relacionadas con los datos se movieron a otra capa distinta, lo que nos permite hacer cambios en la estructura de datos sin afectar las otras capas.

---

## 2. b) ¿Cómo es la cohesión en la aplicación (a nivel de los módulos)?

**Pregunta:** ¿Cómo es la cohesión en la aplicación (a nivel de los módulos)? Justifica tu respuesta.

> **Alta.** Ahora todo está separado por capas y cada capa tiene su funcionalidad propia. La capa de vista se encarga de toda la parte visual de la aplicación, y esa capa se comunica únicamente con la capa de negocio, que es la que se encarga de fungir como intermediario entre la vista y los datos. La capa de datos es la encargada de hacer acciones relacionadas como agregar, borrar, actualizar, recuperar, etc. A diferencia de la otra versión, que manejaba todo en una clase `Manejador`, aquí ya está todo separado.

---

## 2. c) ¿Se puede cambiar la estructura de datos respetando el escenario de modificabilidad?

**Pregunta:** Supón que se desea cambiar la estructura de datos que contiene la lista de datos. ¿Se puede hacer esto respetando el escenario de modificabilidad? Justifica tu respuesta.

> **Sí**, se cumple el escenario de modificabilidad. Esto gracias al uso de una interfaz `MapeadorDatos`, ya que con ello solamente se tendría que modificar la clase `MapeadorDatosImpl`, ya que es la que maneja todo lo relacionado con los datos. Esto no afecta en nada a la clase `ManejadorImpl`, puesto que solo se encarga de orquestar los métodos entre la ventana y `MapeadorDatosImpl`.
