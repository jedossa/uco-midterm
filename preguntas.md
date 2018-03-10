# Preguntas (10% c/u)

1. ¿Qué acciones ***no*** debería realizar una función pura?
    Cosas diferentes a la acción que debe cumplir dentro del código.
2. ¿Qué se gana al crear funciones puras?
    No hay función 100% pura, pero podría ayudar a crear las funciones más cortas y más legibles para el programador.
3. ¿Por qué diseñar datos inmutables?
    Para que no se puedan alterar en otros procesos ni se afecten los datos.
4. ¿Por qué son importantes los tipos?
    Porque dan expresividad y definen el tipo de dirección que es un dato.
# Tests Passed(4% c/u) 

# Estilo y buenas prácticas (-1% por cada falla) 
Ejemplos de fallas:
- No reusar funciones donde aplique. Incluye funciones de orden superior.
- No usar funciones parciales para ganar expresividad donde aplique.
- No usar nombres dicientes para variables o funciones (no aplica para funciones anónimas con *underscore*).
- Las funciones con sujifo *Rec* deberán ser recursivas o se descontará el respectivo *test* (4%).