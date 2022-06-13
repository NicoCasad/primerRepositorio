Algoritmo DarVueltaNumero
	Definir num, num1 Como Real;
	
	Escribir "Ingrese un numero de dos cifras"
	Leer num;
	
	num1 = trunc(num % 10);
	num = trunc(num / 10);
	num1 = num1 * 10 + num;
	
	Escribir "El numero al revés es: " num1;
	
FinAlgoritmo
