Algoritmo paresOimpares
	Definir num1, num2 Como Entero;
	
	Escribir "Ingrese el primer numero";
	Leer num1;
	Escribir "Ingrese el segundo numero";
	Leer num2;
	
	Si num1 MOD 2 = 0 Y num2 MOD 2 = 0 Entonces
		Escribir "Ambos numeros son pares";
	SiNo
		Escribir "Los numeros no son pares, o por lo menos uno de ellos no lo es";
	FinSi
	
FinAlgoritmo
