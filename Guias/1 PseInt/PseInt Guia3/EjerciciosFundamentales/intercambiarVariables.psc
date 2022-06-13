Algoritmo intercambiarVariables
	Definir numA, numB como Real;
	
	Escribir "Ingrese el primer numero";
	Leer numA;
	Escribir "Ingrese el segundo numero";
	Leer numB;
	
	intercambiar(numA,numB)
FinAlgoritmo

SubProceso intercambiar(numA, numB)
	Definir aux como Real;
	aux = numA;
	numA = numB;
	numB = aux;
	
	Escribir "El valor del primer numero quedo en: " numA " y el segundo en: " numB;
FinSubProceso
	