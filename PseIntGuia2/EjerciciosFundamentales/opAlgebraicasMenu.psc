Algoritmo opAlgebraicasMenu
	Definir letra Como Caracter;
	Definir num1, num2 como Real;
	
	Escribir "Ingrese el primer numero";
	Leer num1;
	Escribir "Ingrese el segundo numero";
	Leer num2;
	Escribir "Eliga la opcion a realizar"
	Escribir "S para sumar";
	Escribir "R para restar";
	Escribir "M para multiplicar";
	Escribir "D para dividir";
	Leer letra;
	
	Segun Minusculas(letra)
		"s":
			Escribir  num1 + num2;
		"r":
			Escribir num1 - num2;
		"m":
			Escribir num1 * num2;
		"d":
			Escribir num1 / num2;
	FinSegun
	
FinAlgoritmo
