# Preguntas (10% c/u)

1. ¿Qué acciones ***no*** debería realizar una función pura?
    Las funciones puras no deberian realizar lo siguiente:
     - No deben tomar variables globales
     - No deben llamar funciones que no sean puras
     - No deben tener datos mutables
     - Siempre deben retornar los mismos datos para la misma entrada


2. ¿Qué se gana al crear funciones puras?
    Las funciones puras no estan acopladas, por lo tanto es más sencillo realizar pruebas.
    El codigo de estas es más entendible, y debido a que no necesitan datos externos se
    pueden paralelizar de manera sencilla.
    El negocio de un proyecto deberia ser con funciones puras, debido a que con estas,
    se puede garantizar la integridad del codigo.

3. ¿Por qué diseñar datos inmutables?
    Es mejor diseñar con datos inmutables debido a que los datos mutables pueden cambiar en
    cualquier momento de estado, por lo tanto al usar datos imutables garantizamos integridad
    en los datos.

4. ¿Por qué son importantes los tipos?
    Los tipos son importantes para definir claramente con que estamos trabajando, esto nos
    ayuda a filtrar la informacion que le puede llegar a un método, y así, encontrar más facil
    errores en tiempo de complilación.

# Tests Passed(4% c/u) 

# Estilo y buenas prácticas (-1% por cada falla) 
Ejemplos de fallas:
- No reusar funciones donde aplique. Incluye funciones de orden superior.
- No usar funciones parciales para ganar expresividad donde aplique.
- No usar nombres dicientes para variables o funciones (no aplica para funciones anónimas con *underscore*).
- Las funciones con sujifo *Rec* deberán ser recursivas o se descontará el respectivo *test* (4%).