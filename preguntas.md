# Preguntas (10% c/u)

1. ¿Qué acciones ***no*** debería realizar una función pura?
   Evaluar valores que estén fuera de su scope

2. ¿Qué se gana al crear funciones puras?
    Expresividad, respetará la intención por la que fue creada.

3. ¿Por qué diseñar datos inmutables?
    porque es necesario conservar los mismos valores en el tiempo de ejecución así siempre que
    sean invocados el resultado será el mismo.

4. ¿Por qué son importantes los tipos?
    Porque nos permiten clasificar los valores y asi restringir y limitar el uso de valores.

# Tests Passed(4% c/u) 

# Estilo y buenas prácticas (-1% por cada falla) 
Ejemplos de fallas:
- No reusar funciones donde aplique. Incluye funciones de orden superior.
- No usar funciones parciales para ganar expresividad donde aplique.
- No usar nombres dicientes para variables o funciones (no aplica para funciones anónimas con *underscore*).
- Las funciones con sujifo *Rec* deberán ser recursivas o se descontará el respectivo *test* (4%).