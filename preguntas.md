# Preguntas (10% c/u)

1. ¿Qué acciones ***no*** debería realizar una función pura?
    una función pura no debería: mutar datos o modificar archivos.
2. ¿Qué se gana al crear funciones puras?
    La princial ventaja de trabajar con funciones puras es la ausencia de efectos colaterales,la
    transparencia, testabilidad y portabilidad.
3. ¿Por qué diseñar datos inmutables?
    Se entiende como algo inmutable algo que no se puede modificar, por lo tanto se crea un objeto
    inmutable para asegurarnos de que no pueda ser modificado inesperadamente afectando la ejecución
    del programa.
4. ¿Por qué son importantes los tipos?
    son importantes para la reutilización segura de abstracciones.

# Tests Passed(4% c/u) 

# Estilo y buenas prácticas (-1% por cada falla) 
Ejemplos de fallas:
- No reusar funciones donde aplique. Incluye funciones de orden superior.
- No usar funciones parciales para ganar expresividad donde aplique.
- No usar nombres dicientes para variables o funciones (no aplica para funciones anónimas con *underscore*).
- Las funciones con sujifo *Rec* deberán ser recursivas o se descontará el respectivo *test* (4%).