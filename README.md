# Ejercicio: Referencias y paso de parámetros

## 📌 Descripción

Este ejercicio consiste en trabajar con las referencias a objetos y el paso de parámetros en Java mediante una clase llamada `Caja`.

Se pretende comprender cómo se comportan las variables cuando se pasan a métodos, diferenciando entre la modificación del contenido de un objeto, la reasignación de una referencia y la modificación de una variable primitiva.

También se estudia qué ocurre cuando dos variables hacen referencia al mismo objeto y qué sucede al intentar acceder a un objeto cuya referencia es `null`.

## ⚙️ Métodos estáticos de prueba

En la clase `TestReferencias` se implementan tres métodos estáticos para comprobar cómo se pasan los parámetros en Java.

### 1. modificar(Caja c)

Recibe una referencia a un objeto `Caja` y modifica su contenido.

El cambio afecta al objeto original porque el parámetro recibido hace referencia al mismo objeto.

### 2. reasignar(Caja c)

Recibe una referencia a un objeto `Caja` y le asigna una nueva caja:

```java
c = new Caja("nueva");
```

Esta reasignación solamente modifica la referencia local del método. La variable original continúa apuntando al objeto anterior.

### 3. incrementar(int n)

Recibe un número entero y le suma `10`.

El cambio no afecta a la variable original porque los tipos primitivos se pasan por valor en Java.

## ✅ Conclusión

Con este ejercicio se comprende cómo funciona realmente el paso de parámetros en Java.

Se aprende que Java siempre pasa los argumentos por valor, aunque cuando se trata de objetos lo que se copia es la referencia al objeto.

Por este motivo, modificar el contenido de un objeto desde un método afecta al objeto original, mientras que reasignar el parámetro a un objeto nuevo no modifica la referencia original.

También se comprueba que dos variables pueden apuntar al mismo objeto y se aprende a identificar y controlar los errores producidos por referencias `null`.
