Algoritmo tempXDia
	Definir numdias Como Entero;
	
	Escribir "Ingrese la cantidad de dias a evaluar";
	Leer numdias;
	
	tempMedia(numdias);
FinAlgoritmo

SubProceso tempMedia(numdias)
	Definir recorrerdias Como Entero;
	Definir tempMin, tempMax como Real;
	recorrerdias = 0;
	Para recorrerdias <- 1 Hasta numdias Hacer
		Escribir "Ingrese la temperatura maxima del dia " recorrerdias;
		Leer tempMax;
		Escribir "Ingrese la temperatura minima del dia " recorrerdias;
		Leer tempMin;
		Escribir "La temperatura media del dia " recorrerdias " es de " (tempMax + tempMin) / 2;
	FinPara
FinSubProceso
	