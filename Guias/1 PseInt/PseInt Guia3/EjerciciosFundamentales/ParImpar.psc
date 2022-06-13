Algoritmo Impar
	Definir num Como Entero;
	
	Escribir "Ingrese un numero"
	Leer num;
	Escribir definirParidad(num);
	
FinAlgoritmo

Funcion paridad <- definirParidad(numer)
	Definir paridad como Logico;
	Si numer MOD 2 <> 0 Entonces
		paridad = Verdadero;
	SiNo
		paridad = Falso;
	FinSi
	FinFuncion
	