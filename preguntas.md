# Preguntas (10% c/u)

1. ¿Qué acciones ***no*** debería realizar una función pura?
    R:// Crear efectos secundarios.
         Dada una misma entrada producir diferentes resultados.
         Que no permita recibir otra funcion como parametro y/o evaluar a otra funcion.

2. ¿Qué se gana al crear funciones puras?
    R:// Cuando escribimos funciones puras estamos evitando que se produzcan efectos secundarios.
         Transparencia referencial, dada una entrada especifica siempre debe producir la misma salida.
         Podemos combinarlas con otras funciones.
         Son faciles de probrar y/o debuggear.
         Son memoizables, esto nos ayuda a ahorrar recursos en la aplicacion.

3. ¿Por qué diseñar datos inmutables?
    R:// Porque así evitamos obtener cambios de valor no deseados en algún punto de nuestra aplicacion,
         evitando que se produzcan excepciones que no podamos controlar o comportamientos inesperados dentro de nuestro flujo.

4. ¿Por qué son importantes los tipos?
    R:// Son importantes porque nos fuerzan a hacer un codigo mas descriptivo, donde definimos claramente las intenciones
         de lo que deseamos realizar.
         Son importantes porque en tiempo de compilacion se detectan errores facilmente cuando algun tipo esta mal.
         Cuando programamos a traves de tipos utilizamos el compilador a nuestro favor.


# Tests Passed(4% c/u) 

# Estilo y buenas prácticas (-1% por cada falla) 
Ejemplos de fallas:
- No reusar funciones donde aplique. Incluye funciones de orden superior.
- No usar funciones parciales para ganar expresividad donde aplique.
- No usar nombres dicientes para variables o funciones (no aplica para funciones anónimas con *underscore*).
- Las funciones con sujifo *Rec* deberán ser recursivas o se descontará el respectivo *test* (4%).