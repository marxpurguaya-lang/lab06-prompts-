# Bitácora de Ingeniería de Prompts

## Ejercicio 2: Tokens y ventana de contexto

### Conteo de tokens

| Texto                              | Tokens | Caracteres |
| ---------------------------------- | -----: | ---------: |
| Los estudiantes programan en Java. |     18 |         84 |
| The students program in Java.      |      7 |         37 |
| desafortunadamente                 |      5 |         21 |

Con esta prueba observé que los textos se pueden dividir en diferentes cantidades de tokens. Una palabra larga también puede dividirse en varios tokens.

### Ventana de contexto

Primero proporcioné en un chat la siguiente información:

> Estoy desarrollando una aplicacion llamada TiendaTec en Java Swing para gestionar los productos de una tienda. Solo responde: Entendido.

Después pregunté:

> ¿Como se llama mi aplicacion y que tecnologia usa?

La IA respondió que la aplicación se llama TiendaTec y utiliza Java Swing.

Luego realicé la misma pregunta en un chat nuevo. La IA volvió a identificar TiendaTec y Java Swing debido a la información que tenía disponible mediante memoria.

### Reflexión

Con este ejercicio comprendí la diferencia entre el contexto de una conversación y la memoria. El contexto permite utilizar la información proporcionada dentro del chat, mientras que la memoria puede conservar determinados datos para utilizarlos posteriormente.

---

## Ejercicio 3: Temperatura

### Variabilidad en el chat

Utilicé el siguiente prompt en tres chats diferentes:

> Propon 3 nombres para una aplicacion de prestamo de libros de una biblioteca universitaria. Responde solo con la lista.

Los nombres propuestos fueron diferentes en cada intento. Esto permitió observar que una misma instrucción puede producir respuestas variables.

### Simulador en Java

Primero ejecuté el programa con temperatura 0:

```text
java SimuladorTemperatura 0
```

---

## Ejercicio 4: Prompt vago vs. estructurado

### Prompt vago

Prompt utilizado:

> Haz un programa para gestionar una biblioteca.

La respuesta obtenida fue general porque no se especificó el lenguaje de programación, las funcionalidades requeridas ni las restricciones del programa.

### Prompt estructurado

Prompt utilizado:

> Actúa como desarrollador Java.
>
> Crea un programa de consola para gestionar una biblioteca universitaria.
>
> El programa debe permitir:
>
> - Registrar libros.
> - Mostrar los libros registrados.
> - Buscar libros por título.
>
> Cada libro debe tener:
>
> - Código
> - Título
> - Autor
> - Año de publicación
>
> Utiliza programación orientada a objetos con una clase Libro.
>
> Restricciones:
>
> - Usa solamente Java.
> - No utilices librerías externas.
> - Presenta el código completo y listo para compilar.

### Comparación

| Aspecto         | Prompt vago     | Prompt estructurado         |
| --------------- | --------------- | --------------------------- |
| Lenguaje        | No especificado | Java                        |
| Funcionalidades | Generales       | Registrar, mostrar y buscar |
| Datos           | No definidos    | Código, título, autor y año |
| Restricciones   | No tiene        | Sí                          |
| Resultado       | General         | Más específico              |

### Reflexión

Este ejercicio me permitió comprobar que un prompt con mayor nivel de detalle genera respuestas más precisas y alineadas con los requisitos planteados. Agregar contexto, restricciones y objetivos específicos ayuda a obtener mejores resultados.

---

## Ejercicio 5: Anatomía de un prompt

Para analizar la estructura de un prompt utilicé un ejemplo relacionado con Java.

### Componentes identificados

| Componente  | Ejemplo                                                                             |
| ----------- | ----------------------------------------------------------------------------------- |
| Rol         | Actúa como profesor de programación Java.                                           |
| Instrucción | Explica a un estudiante qué es una clase en Java.                                   |
| Contexto    | El estudiante está aprendiendo programación orientada a objetos en TECSUP.          |
| Ejemplo     | `class Producto { String nombre; double precio; }`                                  |
| Formato     | Explicar primero el concepto y después el ejemplo, utilizando un lenguaje sencillo. |

### Observación

Al separar el prompt en estos componentes comprendí que cada parte cumple una función. El rol orienta la respuesta, la instrucción indica qué hacer, el contexto aporta información, el ejemplo sirve como referencia y el formato determina cómo presentar la respuesta.

### Reflexión

Este ejercicio me ayudó a entender que un prompt bien estructurado permite comunicar mejor lo que necesito y obtener una respuesta más relacionada con el objetivo.

---

## Ejercicio 6: De prompt básico a profesional

### Iteración 1: Prompt básico

El primer prompt fue:

> Crea un programa en Java para registrar estudiantes.

La instrucción es muy general y deja muchas decisiones abiertas.

### Iteración 2: Prompt mejorado

Agregué el rol del desarrollador, el contexto de TECSUP, los datos del estudiante y el uso de programación orientada a objetos.

Esto permitió obtener una respuesta más específica.

### Iteración 3: Prompt profesional

Finalmente agregué requisitos detallados, restricciones, validaciones y un formato específico para la respuesta.

### Comparación

| Aspecto            | Básico       | Profesional              |
| ------------------ | ------------ | ------------------------ |
| Rol                | No definido  | Desarrollador Java       |
| Contexto           | Mínimo       | TECSUP y práctica de POO |
| Requisitos         | Generales    | Detallados               |
| Restricciones      | No tiene     | Sí                       |
| Formato            | No definido  | Especificado             |
| Resultado esperado | Poco preciso | Más controlado           |

### Reflexión

## La principal mejora fue pasar de una instrucción general a una solicitud con contexto, requisitos, restricciones y formato. Esto permitió reducir la ambigüedad y obtener una respuesta más cercana a lo que necesitaba.

---

## Ejercicio 7: Publicación en GitHub

### Evidencia de publicación

Se realizó la publicación de los archivos del laboratorio en el repositorio de GitHub utilizando Git desde PowerShell.

Comandos utilizados:

```text
git status
git add .
git commit -m "Actualiza bitacora"
git push
```

## Preguntas finales

### a) ¿Qué diferencia existe entre un prompt básico y un prompt profesional?

Un prompt básico da una instrucción general y deja muchas decisiones abiertas. En cambio, un prompt profesional incluye un rol, instrucciones claras, contexto, ejemplos, formato y restricciones. Esto permite obtener una respuesta más específica y cercana a lo que se necesita.

### b) ¿Por qué es importante la ventana de contexto?

La ventana de contexto es importante porque determina cuánta información puede considerar la IA al generar una respuesta. Si existe suficiente contexto, la IA puede relacionar mejor las instrucciones y los datos proporcionados.

### c) ¿Qué efecto tiene la temperatura?

La temperatura influye en la variabilidad de las respuestas. Una temperatura baja produce resultados más consistentes, mientras que una temperatura mayor puede generar resultados más variados.

### d) ¿Qué componente del prompt consideras más importante?

Considero que el contexto es uno de los componentes más importantes porque permite que la IA conozca la situación y el objetivo de la solicitud. Sin contexto, una instrucción puede ser demasiado general y producir una respuesta que no se ajuste a lo que necesito.
