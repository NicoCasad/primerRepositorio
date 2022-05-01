Algoritmo fechaCorrecta
	Definir dia, mes, ano Como Entero;
	
	Escribir "Ingrese el dia"
	Leer dia;
	Escribir "Ingrese el mes"
	Leer mes;
	Escribir "Ingrese el año"
	Leer ano;
	
	Si ano < 2022 Entonces
		Si mes < 13 Y mes > 0
			Si dia > 0 Y dia <  32 Entonces
				Segun mes Hacer
					1: 
						Escribir dia " de Enero de " ano;
					2:
						Si dia < 29 Entonces
							Escribir dia " de Febrero de " ano;
						SiNo
							Si ano MOD 4 = 0 Entonces
								Si dia < 30 Entonces
									Escribir dia " de Febrero de " ano;
								SiNo
									Escribir "Febrero solo llega al dia 29 en años bisiestos"
								FinSi
							SiNo
								Escribir "Febrero solo llega al dia 28"
							FinSi
						FinSi
					3:
						Si dia < 31 Entonces
							Escribir dia " de Marzo de " ano;
						SiNo
							Escribir "Marzo solo tiene 30 dias"
						FinSi
					4:
						Escribir dia " de Abril de " ano;
					5:
						Si dia < 31 Entonces
							Escribir dia " de Mayo de " ano;
						SiNo
							Escribir "Mayo solo tiene 30 dias"
						FinSi
					6:
						Escribir dia " de Junio de " ano;
					7:
						Si dia < 31 Entonces
							Escribir dia " de Julio de " ano;
						SiNo
							Escribir "Julio solo tiene 30 dias"
						FinSi
					8:
						Escribir dia " de Agosto de " ano;
					9:
						Si dia < 31 Entonces
							Escribir dia " de Septiembre de " ano;
						SiNo
							Escribir "Septiembre solo tiene 30 dias"
						FinSi
					10:
						Escribir dia " de Octubre de " ano;
					11:
						Si dia < 31 Entonces
							Escribir dia " de Noviembre de " ano;
						SiNo
							Escribir "Noviembre solo tiene 30 dias"
						FinSi
					12:
						Escribir dia " de Diciembre de " ano;
				FinSegun
			SiNo
				Escribir "El dia ingresado es incorrecto"
			FinSi
		SiNo
			Escribir "El mes ingresado es incorrecto"
		FinSi
	SiNo
		Escribir "El mes ingresado es incorrecto"
	FinSi
	
	
FinAlgoritmo
