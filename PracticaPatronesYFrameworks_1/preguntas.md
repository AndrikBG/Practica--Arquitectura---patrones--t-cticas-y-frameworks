# Respuestas a las preguntas

---

## 1. a) ¿Existe bajo acoplamiento en la aplicación?

**Pregunta:** ¿Existe bajo acoplamiento en la aplicación? Justifica tu respuesta *(piensa en qué pasaría si cambias la estructura de datos por un arreglo)*.

> **No**, no tiene bajo acoplamiento. Al cambiar el tipo de dato a un arreglo, se tienen que cambiar los métodos para que se adapten al tipo de dato y, además, afecta a un método (`actualiza`) de la clase `Ventana`.

---

## 1. b) ¿Existe alta cohesión en la aplicación?

**Pregunta:** ¿Existe alta cohesión en la aplicación? Justifica tu respuesta.

> **Sí**, cada clase tiene un propósito, aunque la clase `Manejador` también sirve como el manejador de datos y la lógica.

---

## 1. c) ¿Se puede cambiar la estructura de datos respetando el escenario de modificabilidad?

**Pregunta:** Supón que se desea cambiar la estructura de datos que contiene la lista de datos. ¿Se puede hacer esto respetando el escenario de modificabilidad? Justifica tu respuesta.

> **No**, no es posible hacer el cambio, ya que al cambiar el tipo de dato perjudica a la clase `Ventana`, pues está esperando un tipo de dato en concreto.
