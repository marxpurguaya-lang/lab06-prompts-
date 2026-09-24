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
