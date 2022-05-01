Algoritmo Fibonacci
	Definir num como Entero;
	
	Escribir "Ingrese el numero"
	Leer num;
	
	Escribir numFibonacci(num);
FinAlgoritmo

Funcion resultado <- numFibonacci(numer)
	Definir resultado, puestos, a, b, c como Entero;
	a = 0;
	b = 1;
	puestos = 1;
	Para puestos <- 1 Hasta numer Hacer
		resultado = a;
		c <- a + b
		a <- b
		b <- c
	FinPara
FinFuncion
	