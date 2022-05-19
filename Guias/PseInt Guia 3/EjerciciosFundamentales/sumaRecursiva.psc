Algoritmo sumaRecursiva
	Definir cantEnteros Como Entero;

	Escribir "Ingrese hasta que entero quiere sumar";
	Leer cantEnteros
	
	Escribir factorialDeLaSuma(cantEnteros);

FinAlgoritmo

Funcion suma <- factorialDeLaSuma(cantEnt)
	Definir suma Como Entero;
	suma = cantEnt
	Si cantEnt = 1 Entonces
		suma = 1;
	SiNo
		suma = suma + factorialDeLaSuma(cantEnt - 1)
	FinSi
FinFuncion
	