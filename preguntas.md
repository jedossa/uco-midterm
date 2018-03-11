# Preguntas (10% c/u)

1. ¿Qué acciones ***no*** debería realizar una función pura?
    Las Funciones puras se pueden definir como funciones sin efectos secundarios,
    Las  funciones puras son funciones con unica responsabilidad;
    por lo tanto una funcion pura no puede retornar una operacion con una llamada a ella misma (n*factorial(n-1)) porque las funciones
    puras deben ser recursivas.
    Las funciones puras no deben mutar ni acceder a un estado global
    Las funciones puras no deben definirse sin el tipo de retorno
    Las funciones puras no deben usarse con parentesis cuando no reciben parametros.


2. ¿Qué se gana al crear funciones puras?
    Con la inmutabilidad se gana trasnparencia referencial para evitar el cambio indeseado de valores.
    Al no tener efectos secundarios y al tener unicas responsabilidades se gana LEGIBILIDAD DE CODIGO e igualmente transparencia
    referencial, un codigo facilmente modificable sin tocar otras funcionalidades, un codigo probable por medio de pruebas unitarias,
    un codigo optimizado a nivel de recursos de la maquina con cobertura de errores(sin desbordamientos de pila, etc) y
    un codigo reutilizable para evitar duplicaciones innecesarias.


3. ¿Por qué diseñar datos inmutables?
    La inmutabilidad simplifica la concurrencia; la modificacion de valores de manera indeseada; los datos inmutables nos
    evitan errores de integridad de datos.

4. ¿Por qué son importantes los tipos?
    Los tipos son importantes definirlos asi Scala nos permita inferencia de tipos, porque
    nos brinda legibilidad de codigo al momento de realizar una modificacion o hacer un seguimiento
    o contexto de lo que realmente hace una funcion y de que tipo son sus parametros y su retorno si retorna.
    Y en el contexto de la importancia de los tipos a nivel del lenguaje, es porque nos permiten manejar
    diferentes controles acerca de con que estamos trabajando y que puedo operar funcionalmente
    con un metodo o funcion determinado.

    def cifrar(texto: texto): cifrado = ???
    def descifrar(cifrado: texto): texto = ???

# Tests Passed(4% c/u) 

# Estilo y buenas prácticas (-1% por cada falla) 
Ejemplos de fallas:
- No reusar funciones donde aplique. Incluye funciones de orden superior.
- No usar funciones parciales para ganar expresividad donde aplique.
- No usar nombres dicientes para variables o funciones (no aplica para funciones anónimas con *underscore*).
- Las funciones con sujifo *Rec* deberán ser recursivas o se descontará el respectivo *test* (4%).