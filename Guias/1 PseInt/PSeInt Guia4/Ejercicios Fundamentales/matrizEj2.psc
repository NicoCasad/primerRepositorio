Algoritmo matrizEj2
	Definir matrizEnteros, numeroBuscar, i, j, aux como Entero;
	Dimension matrizEnteros(5, 5);
	aux = 0;
	
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			
			matrizEnteros(i, j) = Aleatorio(0, 5)
			
		FinPara
	FinPara
	
	Escribir "Ingrese el valor a buscar"
	Leer numeroBuscar;
	
	Para i <- 0 Hasta 2 Con Paso 1 Hacer
		Para j <- 0 Hasta 2 Con Paso 1 Hacer
			
			SI matrizEnteros(i, j) = numeroBuscar Entonces
				Escribir "El numero ingresado se encontro en la fila " i " y columna " j;
				aux = 1;
			FinSi
			
		FinPara
	FinPara
	
	Si aux = 0 Entonces
		Escribir "No se encontro ninguna coincidencia"
	FinSi
FinAlgoritmo
