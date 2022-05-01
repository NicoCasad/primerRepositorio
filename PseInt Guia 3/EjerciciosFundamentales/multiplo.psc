Algoritmo multiplo
	Definir num, num2 como Entero;
	
	Escribir "Ingrese el primer numero que sea multiplo del segundo a ingresar"
	Leer num;
	Escribir "Ingrese un numero"
	Leer num2;
	
	Escribir EsMultiplo(num,num2);
FinAlgoritmo

Funcion resultado <- EsMultiplo(numer,numer2)
	Definir resultado, auxiliar Como Logico;
	Definir naturales Como Entero;
	resultado = Falso;
	naturales = 0;
	
	Para naturales = 0 Hasta  9 Con Paso naturales + 1 Hacer
		Si numer2*naturales = numer Entonces
			resultado = Verdadero 
		FinSi
	FinPara

FinFuncion
	