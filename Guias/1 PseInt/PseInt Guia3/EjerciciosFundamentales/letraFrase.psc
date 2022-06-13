Algoritmo letraFrase
	Definir frase, letra Como Caracter;
	
	Escribir "Ingrese una frase"
	Leer frase;
	Escribir "Ingrese la letra a buscar"
	Leer letra;
	
	Escribir "La cantidad de veces que se repite la letra es: " contarLetra(frase, letra);
	
FinAlgoritmo

Funcion cantLetra <- contarLetra(frase, letra)
	Definir cantLetra, recorrerLetras Como Entero;
	recorrerLetras = 0;
	cantLetra = 0;
	
	Para recorrerLetras = 0 Hasta Longitud(frase) - 1 Con Paso recorrerLetras + 1 Hacer
		Si Mayusculas(Subcadena(frase, recorrerLetras, recorrerLetras)) = Mayusculas(letra) Entonces
			cantLetra = cantLetra + 1;
		FinSi
	FinPara
	
FinFuncion
	