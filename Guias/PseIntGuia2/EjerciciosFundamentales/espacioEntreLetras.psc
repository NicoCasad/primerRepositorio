Algoritmo espacioEntreLetras
	Definir frase Como Caracter;
	Definir num, aux Como Entero;
	num = 0;
	Escribir "Ingrese una palabra"
	Leer frase;
	
	Para num <- 0 Hasta Longitud(frase) Con Paso (num + 1) Hacer
		Escribir Sin Saltar Subcadena(frase, num, num) " ";
		
	FinPara
FinAlgoritmo
