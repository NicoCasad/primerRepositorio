Algoritmo empiezaConA
	Definir palabra Como Caracter;
	
	Escribir "Ingrese una palabra o frase";
	Leer palabra;
	
	Si Mayusculas(Subcadena(palabra,0,0)) = "A" Entonces
		Escribir "CORRECTO";
	SiNo Escribir "INCORRECTO";
	FinSi
	
FinAlgoritmo
