Algoritmo elementoArreglo
	Definir arregloNumeros, n, recorrerArreglo, elemento, aux Como Entero;
	
	recorrerArreglo = 0;
	aux = 0;
	Escribir "Ingrese el tamaño del arreglo"
	Leer n;
	
	Dimension  arregloNumeros(n);
	
	Para recorrerArreglo <- 0 Hasta n - 1 Con Paso 1 Hacer
		Escribir "Ingrese el numero de la posicion " recorrerArreglo
		Leer arregloNumeros(recorrerArreglo);
	FinPara
	
	Escribir "Ingrese el elemento que quiere buscar"
	Leer elemento;
	
	recorrerArreglo = 0;
	Para recorrerArreglo <- 0 Hasta n - 1 Con Paso 1 Hacer
		Si arregloNumeros(recorrerArreglo) = elemento Entonces
			Escribir "El elemento requerido se encuentra en la posicion " recorrerArreglo;
			aux = 1
		FinSi
	FinPara
	
	Si aux = 0 Entonces
		Escribir "No se encontro el elemento buscado en el arreglo"
	FinSi
FinAlgoritmo
