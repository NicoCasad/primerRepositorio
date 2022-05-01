Algoritmo hastaIngresar0
	Definir numeroIng, aux, max, min Como Entero;
	Definir prom como Real;
	aux = 0;
	prom = 0;
	min = 1000;
	max = 0;
	
	Hacer
		Escribir "Ingrese un numero entero, o 0 si quiere finalizar";
		Leer numeroIng;
		SI numeroIng <> 0 Entonces
			
			aux = aux + 1;
			prom = prom + numeroIng
			Si numeroIng < min Entonces
				min = numeroIng;
			SiNo
				Si numeroIng > max Entonces
					max = numeroIng;
				FinSi
			FinSi
		FinSi
		
	Mientras Que numeroIng <> 0
	
	prom = prom / aux;
	
	Escribir "El mayor numero ingresado fue: " max;
	Escribir "El menor numero ingresado fue: " min;
	Escribir "El promedio de los numeros ingresados es de: " prom;
FinAlgoritmo
