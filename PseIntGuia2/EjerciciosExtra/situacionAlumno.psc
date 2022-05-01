Algoritmo situacionAlumno
	Definir nota, notaFinal Como Real;
	Definir recorrerNotas como Real;
	
	notaFinal = 0;
	
	Para recorrerNotas <- 1 Hasta  3 Hacer
		Escribir "Ingrese la nota del parcial n°" recorrerNotas
		Leer nota;
		notaFinal = notaFinal + nota;
	FinPara
	notaFinal = notaFinal / 3;
	Si notaFinal > 69  Y notaFinal < 101 Entonces
		Escribir "Aprueba"
	SiNo
		Escribir "Reprueba"
	FinSi
FinAlgoritmo
