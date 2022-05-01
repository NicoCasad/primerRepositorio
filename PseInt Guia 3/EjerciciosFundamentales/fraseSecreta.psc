Algoritmo fraseSecreta
	Definir frase Como Caracter;
	
	Escribir "Ingrese una frase"
	Leer frase;
	
	cambiarFrase(frase);
FinAlgoritmo

SubProceso cambiarFrase(frase)
	Definir recorrerFrase Como Entero;
	Definir fraseSecret Como Caracter;
	recorrerFrase = 0;
	fraseSecret = "";
	
	Para recorrerFrase <- 0 Hasta Longitud(frase) - 1 Con Paso recorrerFrase + 1 Hacer
		Segun Minusculas(Subcadena(frase, recorrerFrase, recorrerFrase))
			Minusculas("a"): fraseSecret = Concatenar(fraseSecret, "@");
			Minusculas("e"): fraseSecret = Concatenar(fraseSecret, "#");
			Minusculas("i"): fraseSecret = Concatenar(fraseSecret, "$");
			Minusculas("o"): fraseSecret = Concatenar(fraseSecret, "%");
			Minusculas("u"): fraseSecret = Concatenar(fraseSecret, "*");
			De Otro Modo:
				fraseSecret = Concatenar(fraseSecret,Minusculas(Subcadena(frase, recorrerFrase, recorrerFrase) ))
		FinSegun
	FinPara
	Escribir fraseSecret;
FinSubProceso
