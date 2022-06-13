Algoritmo sueldoMinimo
	Definir sueldo, sueldoMinim como Real;
	
	Escribir "Ingrese el sueldo minimo";
	Leer sueldoMinim;
	Escribir "Ingrese su sueldo";
	Leer sueldo;
	
	
	
	SI	sueldo = sueldoMinim
		Escribir "su sueldo es igual al sueldo minimo"
	SiNo
		Si sueldo > sueldoMinim
			Escribir "Su sueldo es mayor al sueldo minimo"
		SiNo
			Si sueldo < sueldoMinim
				Escribir "Su sueldo es menor al sueldo minimo"
			FinSi
		FinSi
	FinSi

	
FinAlgoritmo
