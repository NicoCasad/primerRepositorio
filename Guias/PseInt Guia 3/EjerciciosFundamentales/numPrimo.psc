Algoritmo numPrimo
	Definir num Como Entero
	
	Escribir "Ingrese un numero"
	Leer num;
	
	Escribir primoOnoPrimo(num);
	
FinAlgoritmo

Funcion resultado <- primoOnoPrimo(num)
	Definir resultado Como Caracter;
	Definir recorrerNaturales, vecesDvidido como Entero;
	recorrerNaturales = 1;
	vecesDvidido = 0;
	
	Para recorrerNaturales <- 1 Hasta 9 Hacer
		Si num MOD recorrerNaturales = 0 Entonces
			vecesDvidido = vecesDvidido + 1;
		FinSi
	FinPara
	Si num > 9 Entonces
		vecesDvidido = vecesDvidido + 1;
	FinSi
	Si vecesDvidido > 2 Entonces
		resultado = "No es primo"
	SiNo
		resultado = "Es primo"
	FinSi
FinFuncion
	