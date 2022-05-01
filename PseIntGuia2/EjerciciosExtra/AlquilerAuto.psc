Algoritmo AlquilerAuto
	Definir horas, minutos, naftaConsumida, precio como Real;
	
	Escribir "Ingrese cuanto tardo en devolver el auto en horas"
	Leer horas;
	
	Si horas > 2 Entonces
		minutos = horas * 60;
		Escribir "Ingrese los litros de nafta consumida"
		Leer naftaConsumida;
		precio = naftaConsumida * 40 + minutos * 5.20;
	SiNo
		precio = 400;
	FinSi
	Escribir "El precio por el alquiler del auto es de $" precio;
	
FinAlgoritmo
