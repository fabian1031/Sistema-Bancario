# Sistema-Bancario
* ¿por qué fue necesario usar CuentaBancaria como tipo de variable en lugar de cada tipo específico? ¿Qué ventaja concreta te dio eso?

* las tres variables se tratan igual en el código
aunque cada una se comporte diferente por dentro. Si el banco agrega
CuentaNomina mañana, no hay que tocar este Main, solo crear la nueva
clase que extienda CuentaBancaria.