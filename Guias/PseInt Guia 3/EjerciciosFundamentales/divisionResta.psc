Algoritmo divisionResta
	Definir num, divisor como Entero;
	
	Escribir "Ingrese el numero a dividir"
	Leer num;
	Escribir "Ingrese el divisor"
	Leer divisor;
	
	dividir(num, divisor);
FinAlgoritmo

SubProceso dividir(numer, divis)
	Definir resto, resultado como Entero;
	resultado = 0;
	resto = numer;
	Mientras resto > divis Hacer
		numer = numer - divis;
		resto = numer;
		resultado = resultado + 1;
	FinMientras
	Escribir "El resultado es: " resultado " y el resto es: " resto;
FinSubProceso
