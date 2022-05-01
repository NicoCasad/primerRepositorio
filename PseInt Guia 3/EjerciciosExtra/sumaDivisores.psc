Algoritmo sumaDivisores
	Definir num como Entero;
	
	Escribir "Ingrese el numero del cual quiere sumar sus divisores"
	Leer num;
	
	Escribir EncontrarDivisores(num);
FinAlgoritmo

Funcion suma <- EncontrarDivisores(numer)
	Definir suma, recorrerDivisores como Entero;
	recorrerDivisores = 0;
	suma = 0; 
	
	Para  recorrerDivisores <- 1 Hasta numer - 1 Hacer
		Si numer MOD recorrerDivisores = 0 Entonces
			suma = suma + recorrerDivisores;
		FinSi
	FinPara
FinFuncion
	