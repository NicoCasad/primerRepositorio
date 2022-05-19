Algoritmo longYconc
	Definir palabra, resultado Como Caracter;
	
	Escribir "Ingrese una frase o palabra de 4 cifras";
	Leer palabra;
	
	Si longitud(palabra) = 4 Entonces
		Escribir CONCATENAR(palabra, "!");
	SiNo Escribir Concatenar(palabra, "?");
		
	FinSi
	
FinAlgoritmo
