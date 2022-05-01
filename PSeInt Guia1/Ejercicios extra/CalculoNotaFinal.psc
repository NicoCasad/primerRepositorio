Algoritmo CalculoNotaFinal
	Definir parcial1, parcial2, parcial3, trabajoFinal, examenFinal como Entero;
	Definir notaFinal como Real;
	
	Escribir "Ingrese la nota del primer parcial";
	Leer parcial1;
	Escribir "Ingrese la nota del segundo parcial";
	Leer parcial2;
	Escribir "Ingrese la nota del tercer parcial";
	Leer parcial3;
	Escribir "Ingrese la nota del trabajo final";
	Leer trabajoFinal;
	Escribir "Ingrese la nota del examen final";
	Leer examenFinal;
	
	notaFinal = ((parcial1 + parcial2 + parcial3) / 3) * 0.55 + trabajoFinal * 0.15 + examenFinal * 0.3;
	
	Escribir "su calificacion final en la materia es de: " notaFinal;
FinAlgoritmo
