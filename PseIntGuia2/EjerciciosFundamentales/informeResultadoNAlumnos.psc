Algoritmo informeResultadoNAlumnos
	Definir tPIntegrador, Exposicion, Parcial, promReprobados, MayorNotaExposicion, notafinal Como Real;
	Definir Alumnos , aux, reprobados, aprobados, ParcialEntreNum4y7con5 Como Entero;
	
	aux = 1;
	aprobados = 0;
	reprobados = 0;
	MayorNotaExposicion = 0;
	ParcialEntreNum4y7con5 = 0;
	promReprobados = 0;
	
	Escribir "Ingrese la cantidad de alumnos del curso";
	Leer Alumnos;
	
	Para aux <- 1 Hasta Alumnos Con Paso aux Hacer
		Escribir "Ingrese la nota del alumno " aux " del tp Integrador"
		Leer tPIntegrador;
		Escribir "Ingrese la nota del alumno " aux " de la Exposicion"
		Leer Exposicion;
		Escribir "Ingrese la nota del alumno " aux " del Parcial"
		Leer parcial;
		
		notafinal = tPIntegrador * 0.35 + Exposicion * 0.25 + Parcial * 0.4;
		Si notafinal < 6.5 Entonces
			promReprobados = promReprobados + notafinal;
			reprobados = reprobados + 1;
		SiNo
			Si notafinal > 7.5 Entonces
				aprobados = aprobados + 1;
			FinSi
		FinSi
		Si Exposicion > MayorNotaExposicion Entonces
			MayorNotaExposicion = Exposicion;
		FinSi
		Si Parcial >= 4 Y Parcial <= 7.5 Entonces
			ParcialEntreNum4y7con5 = ParcialEntreNum4y7con5 + 1;
		FinSi
	FinPara
	
	promReprobados = promReprobados / reprobados;
	Escribir "La nota promedio de reprobados es de: " promReprobados;
	Escribir "El porcentaje de alumnos que tuvieron la nota final por arriba de 7,5 es del: " (100*aprobados) / Alumnos "%";
	Escribir "La mayor nota obtenida en las exposiciones es:" MayorNotaExposicion;
	Escribir "La cantidad de estudiantes que su nota del parcial estuvo entre 4 y 7,5 es de: " ParcialEntreNum4y7con5 " alumnos";
	
FinAlgoritmo
