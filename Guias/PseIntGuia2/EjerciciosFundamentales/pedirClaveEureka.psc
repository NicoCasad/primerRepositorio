Algoritmo pedirClaveEureka
	Definir clave, clave1 Como Caracter;
	Definir i Como Entero;
	
	clave1 = "Eureka"
	i = 0;
	Hacer
		Escribir "Ingrese la clave";
		Leer clave;
		i = i + 1;
		
	Mientras Que (Mayusculas(clave) <> Mayusculas(clave1)) Y (i <> 3)
	
	Si i = 3 Entonces
		Escribir "Se han agotado los 3 intentos";
		
	Sino Escribir "Se ha ingresado correctamente al sistema";
	FinSi
FinAlgoritmo
