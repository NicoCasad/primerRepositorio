Algoritmo ciclistaDeAaB
	Definir horas, minutos, seg, tiempo, km, tiempoFinal, hFinal, mFinal, sFinal como Real;
	
	Escribir "ingrese primero las horas luego los minutos y luego los segundos de la hora en la que parte"
	Leer horas;
	Leer minutos;
	Leer seg;
	Escribir "Ingrese la distancia que hay entre ambas ciudades en km"
	Leer km;
	
	tiempo = horas * 3600 + minutos * 60 + seg;
	tiempoFinal = tiempo + (km / 10) * 3600;
	sFinal = trunc(tiempoFinal MOD 60);
	mFinal = trunc(trunc(tiempoFinal / 60) MOD 60 );
	hFinal = trunc(trunc(tiempoFinal / 60) / 60 );
	
	Escribir "La hora de llegada a una velocidad de 10 km/h es: " hFinal " horas, " mFinal " minutos, " sFinal " segundos";
FinAlgoritmo
