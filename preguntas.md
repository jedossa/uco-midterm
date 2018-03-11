# Preguntas (10% c/u)

1. ¿Qué acciones ***no*** debería realizar una función pura?
Respuesta: -No debe tener efectos secundarios en el entorno en el que se esta trabajando.
-No deberia imprimir diferentes valores con los mismos parametros de entrada.
2. ¿Qué se gana al crear funciones puras?
Respuesta: -hacer test mas simples
-Son mas faciles de entender porque se puede reemplazar la funcion por su resultado, a esto se
le llama transparencia referencial.
- Se pueden ejecutar en paralelo con el resto de la aplicacion lo que le permite funcionar
de mejor manera
- Se obtiene un codigo mas descoplado porque se pueden eliminar, o cambiar sin afectar el resto
del codigo
3. ¿Por qué diseñar datos inmutables?
Respuesta: porque hace que la aplicacion sea mas entendible puesto que estamos seguros de los
valores posibles que pueda tener una variable u objeto, ademas de eso aporta seguridad al
codigo porque permite que no se alteren a medida de que el codigo va creciendo.

4. ¿Por qué son importantes los tipos?
Respuesta: Son importantes para poder diferenciar los comportamientos que tienen los diferentes objetos con
los que se esta trabajando, para saber que procedimientos puedo hacer segun los ti[ps que tengo
definidos.

# Tests Passed(4% c/u) 

# Estilo y buenas prácticas (-1% por cada falla) 
Ejemplos de fallas:
- No reusar funciones donde aplique. Incluye funciones de orden superior.
- No usar funciones parciales para ganar expresividad donde aplique.
- No usar nombres dicientes para variables o funciones (no aplica para funciones anónimas con *underscore*).
- Las funciones con sujifo *Rec* deberán ser recursivas o se descontará el respectivo *test* (4%).