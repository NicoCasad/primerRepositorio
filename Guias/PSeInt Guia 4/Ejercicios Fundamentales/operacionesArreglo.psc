Algoritmo operacionesArreglo
	Definir arregloReales, i, suma, resta, multiplicacion como Real;
	Dimension arregloReales(10);
	suma = 0
	resta = 0
	multiplicacion = 0;
	Escribir "Ingrese 10 numeros reales"
	
	Para i <- 0 Hasta 9 Con paso 1 Hacer
		Leer arregloReales(i);
	FinPara
	i = 0;
	
	Para i <- 0 Hasta 9 Con paso 1 Hacer
		suma = suma + arregloReales(i);
		resta = resta - arregloReales(i);
		multiplicacion = multiplicacion * arregloReales(i); 
	FinPara
	
	Escribir suma;
	Escribir resta;
	Escribir multiplicacion;
	
FinAlgoritmo
