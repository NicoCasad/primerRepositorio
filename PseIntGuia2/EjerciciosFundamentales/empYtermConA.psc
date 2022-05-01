Algoritmo empYtermConA
	Definir palabra Como Caracter;
	Definir long Como Entero;
	
	Escribir "Ingrese una palabra o frase";
	Leer palabra;
	
	long = longitud(palabra) - 1;
	Si Mayusculas(Subcadena(palabra,0,0)) = Mayusculas(Subcadena(palabra,long,long)) Entonces
		Escribir "CORRECTO";
	SiNo Escribir "INCORRECTO";
	FinSi
	
FinAlgoritmo