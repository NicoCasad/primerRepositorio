Algoritmo NotaCoI
	Definir nota1, nota2, nota3 como Entero;
	Definir bool como Logico;
	
	Escribir "Ingrese sus 3 calificaciones obtenidas entre los numeros 1 y 10";
	Leer nota1;
	Leer nota2;
	Leer nota3;
	
	Si nota1 > 0 Y nota2 > 0 Y nota3 > 0 Y nota1 < 11 Y nota2 < 11 Y nota3 < 11 Entonces
		bool = Verdadero;
		Escribir bool;
	Sino bool = Falso;
		Escribir bool;
	FinSi
	
FinAlgoritmo
