Algoritmo calculoJornal
	Definir nombreTrabajador, dia, turno, tipoDia Como Caracter;
	DEFINIR cantHorasTrabajadas como Entero;
	
	Escribir "Ingrese su nombre"
	Leer nombreTrabajador;
	Escribir "Ingrese el dia de la semana en el que trabajo";
	Leer dia;
	Escribir "Ingrese si fue en turno diurno o nocturno";
	Leer turno;
	Escribir "Ingrese si el dia fue festivo o No festivo";
	Leer tipoDia;
	Escribir "Indique la cantidad de horas trabajadas";
	Leer cantHorasTrabajadas;
	
FinAlgoritmo

Funcion pago <- calcJornal(turno, tipoDia, horasTrab)
	Definir pago como Entero;
	pago = 0;
	Si turno = "diurno" Entonces
		Si tipoDia = "festivo" Entonces
			pago = pago + ((90 + 90 * 0.1) * horasTrab)
		SiNo
			pago = pago + 90 * horasTrab;
		FinSi
	SiNo
		Si turno = "nocturno" Entonces
			Si tipoDia = "festivo" Entonces
				pago = pago + ((125 + 125 * 0.15) * horasTrab)
			SiNo
				pago = pago + 125 * horasTrab;
			FinSi
		FinSi
		
	FinSi
FinFuncion
	