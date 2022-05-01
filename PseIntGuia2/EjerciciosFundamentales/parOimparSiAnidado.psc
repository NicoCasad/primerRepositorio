Algoritmo parOimparSiAnidado
	Definir num como Real;
	
	Escribir "Ingrese un numero";
	Leer num;
	
	Si num = 0 Entonces
		Escribir "El numero ingresado no es par ni impar";
	SiNo 
		Si num MOD 2 = 0
			Escribir "El numero es par";
		SiNo
			Si num MOD 2 <> 0 Entonces
				Escribir "El numero ingresado es impar"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
