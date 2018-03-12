# Preguntas (10% c/u)

1. ¿Qué acciones ***no*** debería realizar una función pura?
    - Incluir funcionalidades que no correspondan a la de la intención de la función
    - Retornar tipo de valor Unit
2. ¿Qué se gana al crear funciones puras?
    - Modularidad
    - Intención
    - Transparencia referencial
    - No tienen side-effects
3. ¿Por qué diseñar datos inmutables?
    Porque tenemos control sobre los datos, al mutar estado no sabemos los valores que puede tomar dico valor.
4. ¿Por qué son importantes los tipos?
    Porque ayuda a modelar mejor, crear código más descriptivo y tenemos la ayuda del compilador que nos valida los tipos al compilar, valga la redundancia.

# Tests Passed(4% c/u) 

# Estilo y buenas prácticas (-1% por cada falla) 
Ejemplos de fallas:
- No reusar funciones donde aplique. Incluye funciones de orden superior.
- No usar funciones parciales para ganar expresividad donde aplique.
- No usar nombres dicientes para variables o funciones (no aplica para funciones anónimas con *underscore*).
- Las funciones con sujifo *Rec* deberán ser recursivas o se descontará el respectivo *test* (4%).