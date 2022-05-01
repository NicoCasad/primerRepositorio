Algoritmo matrizEj4
	Definir matriz, n, m Como Entero
	
	Escribir "Ingrese el tamaño de la matriz"
	Leer n
	m = n;
	Dimension matriz(n, m)
	
	llenarMatriz(matriz, n, m)
FinAlgoritmo

SubProceso llenarMatriz(matriz, n, m)
	Definir fila, columna, aux Como Entero;
	aux = 0
	Para fila <- 0 Hasta n - 1 Con Paso 1 Hacer
		Para columna <- 0 Hasta m - 1 Con Paso 1 Hacer
			
			Si fila = columna Entonces
				matriz(fila, columna) = 0;
			SiNo
				matriz(fila, columna) = Aleatorio(0, 9)
			FinSi
			
			Si aux = fila Entonces
				Escribir Sin Saltar " " matriz(fila, columna)
			SiNo
				Escribir "";
				Escribir Sin Saltar " " matriz(fila, columna);
			FinSi
			
			aux = fila;
			
		FinPara
	FinPara
FinSubProceso