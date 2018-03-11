# Preguntas (10% c/u)

1. ¿Qué acciones ***no*** debería realizar una función pura?
    1. Mdificar variables globales.
    2. Mutar estados.
    3. Incumplir su intención.

2. ¿Qué se gana al crear funciones puras?
    Eliminar complejidad innecesaria, garantiza transparencia referencial y evita los efector colaterales fuera de su ámbito.

3. ¿Por qué diseñar datos inmutables?
    Porque se evita la posible modificación de sus valores durante el tiempo de ejecución.

4. ¿Por qué son importantes los tipos?



# Tests Passed(4% c/u) 

# Estilo y buenas prácticas (-1% por cada falla) 
Ejemplos de fallas:
- No reusar funciones donde aplique. Incluye funciones de orden superior.
- No usar funciones parciales para ganar expresividad donde aplique.
- No usar nombres dicientes para variables o funciones (no aplica para funciones anónimas con *underscore*).
- Las funciones con sujifo *Rec* deberán ser recursivas o se descontará el respectivo *test* (4%).