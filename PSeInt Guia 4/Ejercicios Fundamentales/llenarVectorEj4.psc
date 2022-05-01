Algoritmo llenarVectorEj4
	Definir vector, n, recorrerVector Como Entero;
	recorrerVector = 0;
	Escribir "Ingrese tamaño de vector"
	Leer n;
	
	Dimension vector(n);
	
	Para recorrerVector <- 0 Hasta n-1 Hacer
		Escribir "Ingrese el valor de la posicion " recorrerVector;
		Leer vector(recorrerVector);
	FinPara
	
	Escribir "El valor mas grande del vector es " valorGrande(vector, n);
FinAlgoritmo

Funcion resultado <- valorGrande(vector, n)
	Definir resultado, recorrerVect como Entero;
	resultado = 0;
	Para recorrerVect <- 0 Hasta n-1 Hacer
		Si vector(recorrerVect) > resultado Entonces
			resultado = vector(recorrerVect);
		FinSi
	FinPara
FinFuncion
	