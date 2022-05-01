Algoritmo conversionSegundos
	Definir segIngresados, horas, minutos, seg Como Real;
	
	Escribir "Ingresar la cantidad de segundos a convertir";
	Leer segIngresados;
	
	horas = redon((segIngresados / 60) / 60);
	minutos = redon(segIngresados / 60) mod 60;
	seg = segIngresados mod 60;
	
	Escribir "La conversion resulta en: " horas " horas, " minutos " minutos, " seg " segundos"; 
	
FinAlgoritmo
