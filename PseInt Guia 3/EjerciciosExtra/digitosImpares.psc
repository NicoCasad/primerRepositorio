Algoritmo digitosImpares
	Definir num como Entero;
	
	Escribir "Ingrese un numero";
	Leer num;
	
	Escribir contDigitos(num);
	
FinAlgoritmo

Funcion resultado <- contDigitos(numer)
	Definir resultado Como Caracter;
	Definir bool como Logico;
	bool = Verdadero;
	Mientras numer <> 0 Hacer
		Si (numer MOD 10) MOD 2 = 0 Entonces
			bool = Falso;
		FinSi
		numer = trunc(numer / 10);
	FinMientras
	Si bool = Verdadero Entonces
		resultado = "Los digitos del numero ingresado son impares";
	SiNo
		resultado = "Los digitos del numero ingresado no son todos impares o no son impares";
	FinSi
FinFuncion
	