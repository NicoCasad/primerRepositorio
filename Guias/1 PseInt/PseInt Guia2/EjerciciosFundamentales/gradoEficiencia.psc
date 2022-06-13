Algoritmo gradoEficiencia
	Definir cantTorn, eficiencia, cantDefectuosos Como Real;
	Definir nombre Como Caracter;
	
	Escribir "Ingrese el nombre del operario";
	Leer nombre;
	Escribir "Ingrese la cantidad de tornillos no defectuosos realizados por " nombre;
	Leer cantTorn;
	Escribir "Ingrese la cantidad de tornillos defectuosos realizados por " nombre;
	Leer cantDefectuosos;
	
	Si cantDefectuosos < 200 Y cantTorn < 10000 Entonces
		Escribir "El grado de eficiencia de " nombre " es de grado 6"
	SiNo
		Si cantDefectuosos > 200 Y cantTorn > 10000 Entonces
			Escribir "El grado de eficiencia de " nombre " es de grado 7"
		SiNo
			Si cantDefectuosos < 200 Y cantTorn > 10000 Entonces
				Escribir "El grado de eficiencia de " nombre " es de grado 8"
			SiNo
				Escribir "El grado de eficiencia de " nombre " es de grado 5"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo