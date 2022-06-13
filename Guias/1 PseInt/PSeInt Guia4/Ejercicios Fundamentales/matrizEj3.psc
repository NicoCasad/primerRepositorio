Algoritmo matrizEj3
	Definir matriz, n, m Como Entero
	
	Escribir "Ingrese la cantidad de filas"
	Leer n
	Escribir "Ingrese la cantidad de columnas"
	Leer m
	Dimension matriz(n, m)
	
	llenarMatriz(matriz, n, m);
	
	Escribir "";
	Escribir "la suma es: " matrizSuma(matriz, n, m)
	
FinAlgoritmo

SubProceso llenarMatriz(matriz, n, m)
	Definir fila, columna, aux Como Entero;
	aux = 0
	Para fila <- 0 Hasta n - 1 Con Paso 1 Hacer
		Para columna <- 0 Hasta m - 1 Con Paso 1 Hacer
			
			matriz(fila, columna) = Aleatorio(0, 50)
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

Funcion suma <- matrizSuma(matriz, n, m)
	Definir suma, fila, columna como Entero;
	suma = 0;
	
	Para fila <- 0 Hasta n - 1 Con Paso 1 Hacer
		Para columna <- 0 Hasta m - 1 Con Paso 1 Hacer
			
			suma = suma + matriz(fila, columna)
			
		FinPara
	FinPara
FinFuncion
	