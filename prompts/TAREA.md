# Tarea: Mi prompt profesional

## Funcionalidad elegida

Registro de productos para una tienda utilizando Java.

La funcionalidad permitirá ingresar los datos de un producto y mostrar la información registrada.

---

## Versión 1: Prompt básico

> Crea un programa en Java para registrar productos.

Este prompt es muy general porque no indica cómo debe funcionar el programa ni qué datos debe manejar.

---

## Versión 2: Prompt mejorado

> Actúa como desarrollador Java. Crea un programa para registrar productos de una tienda. El producto debe tener código, nombre, precio y stock. Permite ingresar los datos por teclado y después mostrar la información registrada.

En esta versión agregué el rol, el contexto y los datos que debe manejar el programa.

---

## Versión 3: Prompt profesional

> Actúa como desarrollador Java con experiencia en programación orientada a objetos.
>
> Crea un programa de consola para registrar un producto de una tienda. El programa debe utilizar una clase Producto con los atributos codigo, nombre, precio y stock. El usuario debe ingresar estos datos por teclado y posteriormente el programa debe mostrar la información registrada.
>
> Utiliza este estilo para los métodos:
> `getPrecio()` y `setPrecio(double precio)`.
>
> No uses librerías externas y valida que el precio y el stock no sean valores negativos.
>
> Primero explica brevemente la estructura de la clase Producto y después presenta el código Java completo, organizado por clases y listo para compilar.

---

## Cambios realizados

### De la versión 1 a la versión 2

Agregué:

- El lenguaje de programación Java.
- El rol del desarrollador.
- El contexto de una tienda.
- Los datos que debe tener el producto.
- La forma de ingreso de los datos.

Esto permitió reducir la ambigüedad del prompt.

### De la versión 2 a la versión 3

Agregué:

- Programación orientada a objetos.
- La clase `Producto`.
- Los métodos `getPrecio()` y `setPrecio()`.
- Restricciones sobre librerías externas.
- Validación para evitar precios y stocks negativos.
- Un formato específico para presentar la respuesta.

Esto permite obtener un resultado más organizado y cercano a lo solicitado.

---

## Prompt final y sus cinco componentes

| Componente  | Aplicación                                                                                   |
| ----------- | -------------------------------------------------------------------------------------------- |
| Rol         | Actúa como desarrollador Java con experiencia en programación orientada a objetos.           |
| Instrucción | Crea un programa de consola para registrar un producto de una tienda.                        |
| Contexto    | El programa utiliza una clase Producto con código, nombre, precio y stock.                   |
| Ejemplos    | `getPrecio()` y `setPrecio(double precio)`.                                                  |
| Formato     | Primero explicar la estructura y después presentar el código completo organizado por clases. |

### Restricciones utilizadas

- No utilizar librerías externas.
- El precio no puede ser negativo.
- El stock no puede ser negativo.
- El código debe estar organizado por clases.
- Debe estar listo para compilar.

---

## Evaluación del resultado

| Criterio                      | Cumple |
| ----------------------------- | ------ |
| Utiliza Java                  | Sí     |
| Tiene clase Producto          | Sí     |
| Incluye los cuatro atributos  | Sí     |
| Valida precio y stock         | Sí     |
| Está organizado por clases    | Sí     |
| No utiliza librerías externas | Sí     |

---

## Errores frecuentes y cómo los evité

### 1. Ser demasiado general

Un prompt como "Crea un programa en Java" deja muchas decisiones abiertas.

Lo evité indicando el objetivo, los atributos, las validaciones y la estructura del programa.

### 2. No indicar el formato de respuesta

Si no se indica el formato, la IA puede entregar una respuesta diferente a la esperada.

Lo evité indicando que primero debe explicar la estructura y después presentar el código completo organizado por clases.

---

## Enlace desde el README

El archivo debe poder abrirse desde el README mediante:

```markdown
- [Bitácora de prompts](prompts/BITACORA.md)
- [Tarea: mi prompt profesional](prompts/TAREA.md)
```

### Evidencia de publicación

Se realizó el envío de los archivos del laboratorio al repositorio de GitHub mediante `git push`. El resultado mostró `Everything up-to-date`, confirmando que los cambios locales ya estaban sincronizados con el repositorio remoto.

**Capturas:**

- Captura 1: ejecución de `git push`.
- Captura 2: estado del repositorio con `git status`.
- Captura 3: archivos publicados en GitHub.

### 3. Guarda

Presiona:

**Ctrl + S → cierra el Bloc de notas.**

### 4. Súbelo a GitHub

En PowerShell:

```powershell
cd C:\Lab06D.I\lab06-prompts-
git add .
git commit -m "Completa tarea de prompt profesional"
git push
```
