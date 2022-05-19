Algoritmo cuadradoDeAsteriscos
	Definir tamanoDelLado Como Entero;
	Definir aux, aux1, i, j como Real;
	
	i= 0;
	aux1 = 0;
	
	Escribir "Ingrese el tamaño del lado del cuadrado";
	Leer tamanoDelLado;
	
	Repetir
		aux = 1;	
		
		Para aux <- 1 Hasta tamanoDelLado Con Paso aux Hacer
			Escribir Sin Saltar "* ";
		FinPara
		
		Escribir "";
		
		Si i = 0 Y tamanoDelLado > 1 Entonces
			
			Repetir
				j= 0;
				Escribir Sin Saltar "* ";
				Repetir
					Escribir Sin Saltar "  ";
					j = j + 1; 
				Mientras Que  j <> tamanoDelLado - 2;
				Escribir Sin Saltar "*";
				Escribir "";
				aux1 = aux1 + 1;
				
			Mientras Que aux1 <> tamanoDelLado - 2;
		FinSi
		i = i + 1;
	Mientras Que i <> 2;


	
FinAlgoritmo
