Algoritmo ej22
	Definir tamanoDeLado Como Entero;
	Definir columna, fila Como Entero;
	
	Escribir "Ingrese el tamaño de un lado"
	Leer tamanoDeLado;
	
	columna = 1;
	fila = 1;
	
	Mientras fila <= tamanoDeLado Hacer
		Mientras columna <= tamanoDeLado Hacer
			Si fila > 1 Y fila < tamanoDeLado Y columna > 1 Y columna < tamanoDeLado Entonces
				Escribir Sin Saltar "  ";
			SiNo
				Escribir Sin Saltar "* ";
			FinSi
			columna = columna + 1;
		FinMientras
		Escribir "";
		fila = fila + 1;
		columna = 1;
	FinMientras
FinAlgoritmo
