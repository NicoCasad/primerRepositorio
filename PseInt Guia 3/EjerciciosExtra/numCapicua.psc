Algoritmo numCapicua
	Definir num como Entero;
	
	Escribir "Ingrese el numero a evaluar";
	Leer num;
	
	Escribir esCapicua(num);
FinAlgoritmo

Funcion resultado <- esCapicua(numer)
	Definir resultado Como Caracter;
	Definir aux, numeroAux como Entero;
	numeroAux = numer;
	aux = 0
	Mientras numeroAux <> 0 Hacer
		si aux = 0 Entonces
			aux = numeroAux Mod 10
			numeroAux = trunc(numeroAux/ 10);
		SiNo
			aux = aux * 10 + numeroAux Mod 10
			numeroAux = trunc(numeroAux/ 10);
		FinSi
	FinMientras
	Si numer = aux Entonces
		resultado = "El numero es capicua"
	SiNo
		resultado = "El numero no es capicua"
	FinSi
FinFuncion
	