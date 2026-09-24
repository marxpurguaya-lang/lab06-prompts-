# Bitácora de Ingeniería de Prompts

## Laboratorio 06

**Curso:** Fundamentos de Ingeniería de Prompts  
**Alumno:** Marx Arturo  
**Repositorio:** lab06-prompts-

---

## Ejercicio 2: Tokens y ventana de contexto

Los tokens son unidades pequeñas en las que un modelo de inteligencia artificial divide el texto para poder procesarlo.

La ventana de contexto representa la cantidad de información que el modelo puede tener en cuenta dentro de una conversación o solicitud.

Mientras más información relevante se proporcione dentro del contexto, la respuesta puede ser más precisa.

### Ejemplo

Un prompt corto:

> Crea un programa en Java.

Un prompt con mayor contexto:

> Crea un programa en Java para una cafetería que permita registrar hasta 5 pedidos y mostrar los pedidos registrados.

El segundo prompt proporciona más información y permite obtener una respuesta más específica.

---

## Ejercicio 3: Temperatura

La temperatura es un parámetro que puede influir en la variabilidad de las respuestas generadas por un modelo de inteligencia artificial.

Con una temperatura baja, las respuestas tienden a ser más predecibles y consistentes.

Con una temperatura más alta, las respuestas pueden presentar mayor variedad.

Para generar código Java es conveniente utilizar respuestas consistentes, mientras que para generar ideas creativas puede ser útil permitir mayor variedad.

---

## Ejercicio 4: Prompt vago vs prompt estructurado

### Prompt vago

> Haz un programa para una tienda.

Este prompt no especifica el lenguaje de programación, las funciones que debe realizar ni el formato esperado.

### Prompt estructurado

> Actúa como desarrollador Java. Crea un programa de consola para registrar productos de una tienda. Cada producto debe tener código, nombre, precio y stock. Permite ingresar los datos por teclado y posteriormente muestra la información registrada. Presenta el código completo organizado por clases.

El prompt estructurado proporciona más información y reduce las interpretaciones posibles.

---

## Ejercicio 5: Anatomía de un prompt

Un prompt puede organizarse utilizando diferentes componentes.

| Componente  | Ejemplo                                                      |
| ----------- | ------------------------------------------------------------ |
| Rol         | Actúa como desarrollador Java.                               |
| Instrucción | Crea un programa para registrar productos.                   |
| Contexto    | El sistema será utilizado para una tienda.                   |
| Ejemplos    | Utiliza métodos como getPrecio() y setPrecio().              |
| Formato     | Presenta primero una explicación y luego el código completo. |

Estos componentes permiten expresar con mayor claridad lo que se espera de la inteligencia artificial.

---

## Ejercicio 6: Del prompt básico al profesional

### Versión 1

> Crea un programa en Java para registrar productos.

### Versión 2

> Actúa como desarrollador Java. Crea un programa para registrar productos de una tienda. El producto debe tener código, nombre, precio y stock. Permite ingresar los datos por teclado y después mostrar la información registrada.

### Versión 3

> Actúa como desarrollador Java con experiencia en programación orientada a objetos.
>
> Crea un programa de consola para registrar un producto de una tienda. El programa debe utilizar una clase Producto con los atributos codigo, nombre, precio y stock. El usuario debe ingresar estos datos por teclado y posteriormente el programa debe mostrar la información registrada.
>
> Utiliza métodos como getPrecio() y setPrecio(double precio).
>
> No uses librerías externas y valida que el precio y el stock no sean valores negativos.
>
> Primero explica brevemente la estructura de la clase Producto y después presenta el código Java completo, organizado por clases y listo para compilar.

### Comparación

La versión 1 es muy general y deja muchas decisiones a la inteligencia artificial.

La versión 2 agrega información sobre el lenguaje, el objetivo y los datos necesarios.

La versión 3 agrega el rol, restricciones, ejemplos, validaciones y formato de respuesta. Por ello, permite definir con mayor precisión el resultado esperado.

---

## Observaciones

1. Un prompt con poca información produce respuestas más generales.
2. Agregar contexto permite obtener respuestas más relacionadas con la necesidad.
3. Los ejemplos ayudan a orientar el tipo de respuesta esperado.
4. Es importante indicar restricciones y formato cuando se necesita un resultado específico.
5. La revisión del resultado generado por la IA sigue siendo necesaria.

---

## Conclusiones

1. Aprendí que escribir un buen prompt permite obtener respuestas más precisas y útiles.
2. Comprendí la importancia de proporcionar suficiente contexto.
3. Aprendí que los componentes del prompt ayudan a organizar mejor una solicitud.
4. Pude comprobar que mejorar un prompt permite obtener resultados más completos.
5. Comprendí que la inteligencia artificial es una herramienta de apoyo y que debo revisar el resultado antes de utilizarlo.
