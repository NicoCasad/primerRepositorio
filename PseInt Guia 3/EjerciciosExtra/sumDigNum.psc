Algoritmo sumDigNum
	Definir numer como Entero;
	
	Escribir "Ingrese un numero"
	Leer numer;
	
	Escribir sumaDigitos(numer);
FinAlgoritmo

Funcion resultado <- sumaDigitos(numer)
	Definir resultado, primNum Como Entero;
	resultado = 0;
	Mientras numer <> 0 Hacer
		resultado = resultado + numer MOD 10;
		numer = trunc(numer/10);
	FinMientras

FinFuncion
	