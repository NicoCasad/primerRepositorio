Algoritmo MenuOperaciones
	Definir n, m,vectorA, vectorB, vectorC Como Entero
	n = ();
	m = n;
	menu(n, m,vectorA, vectorB, vectorC);
FinAlgoritmo

SubProceso menu(n, m,vectorA Por Valor, vectorB, vectorC)
	Definir opcionIngresada Como Caracter;
	Definir recorrer Como Entero;
	
	//Menu
	Escribir "Ingrese la opcion que desea realizar";
	Escribir "a: rellenar vector A"
	Escribir "b: rellenar vector B"
	Escribir "c: rellenar vector C con A + B"
	Escribir "d: rellenar vector C con B - A"
	Escribir "e: mostrar contenido de algun vector"
	Escribir "f: salir del programa"
	Leer opcionIngresada;
	
	//Codigo Menu
	Segun Minusculas(opcionIngresada)
		"a": 
			Escribir "Ingrese el tamaño del vectorA"
			Leer n
			Dimension vectorA(n);
			recorrer = 0;
			Para recorrer <- 0 Hasta n - 1 Con Paso 1 Hacer
				vectorA(recorrer) = Aleatorio(-100, 100);
				
			FinPara
			
		"b":
			Escribir "Ingrese el tamaño del vectorB"
			Leer m
			Dimension vectorB(m);
			recorrer = 0;
			Para recorrer <- 0 Hasta m - 1 Con Paso 1 Hacer
				vectorB(recorrer) = Aleatorio(-100, 100);
				
			FinPara
		"c": 
			si n == () Y m = () Entonces
				Escribir "Primero debe rellenar los vectores A y B"
				menu(n, m);
			SiNo
				si n = () Entonces
					Escribir "Ingrece a la opcion a del menu para rellenar el vectorA"
					menu(n, m);
				SiNo
					Si m = () Entonces
						Escribir "Ingrece a la opcion b del menu para rellenar el vectorB"
						menu(n, m);
					SiNo
						Si m <> n Entonces
							Escribir "El tamaño de vectorA y vector B deben ser iguales, por favor corregir alguno de los dos"
							menu(n, m);
						FinSi
					FinSi
				FinSi
			FinSi
			recorrer = 0
			Dimension vectorC(n);
			Para recorrer <- 0 Hasta n - 1 Hacer
				vectorC(recorrer) = vectorA(recorrer) + vectorB(recrrer);
			FinPara
		"d":
			si n = () Y m = () Entonces
				Escribir "Primero debe rellenar los vectores A y B"
				menu(n, m);
			SiNo
				si n = () Entonces
					Escribir "Ingrece a la opcion a del menu para rellenar el vectorA"
					menu(n, m);
				SiNo
					Si m = () Entonces
						Escribir "Ingrece a la opcion b del menu para rellenar el vectorB"
						menu(n, m);
					SiNo
						Si m <> n Entonces
							Escribir "El tamaño de vectorA y vector B deben ser iguales, por favor corregir alguno de los dos"
							menu(n, m);
						FinSi
					FinSi
				FinSi
			FinSi
			recorrer = 0
			Dimension vectorC(n);
			Para recorrer <- 0 Hasta n - 1 Hacer
				vectorC(recorrer) = vectorB(recrrer) - vectorA(recorrer);
			FinPara
		"e": 
			Escribir "Ingrece la letra del vector del cual desea ver los valores"
			Escribir "vectorA: Ingresar A"
			Escribir "vectorB: Ingresar B"
			Escribir "vectorC: Ingresar C"
			Leer opcionIngresada;
			
			Segun Mayusculas(opcionIngresada)
				"A":
					Si n = () Entonces
						Escribir "Para ver sus valores primero debe rellenarlo";
						menu(n, m);
					FinSi
					recorrer = 0;
					Para recorrer <- 0 Hasta n - 1 Con Paso 1 Hacer
						Escribir vectorA(recorrer) ", ";
					FinPara
				"B":
					Si m = () Entonces
						Escribir "Para ver sus valores primero debe rellenarlo";
						menu(n, m);
					FinSi
					recorrer = 0;
					Para recorrer <- 0 Hasta m - 1 Con Paso 1 Hacer
						Escribir vectorB(recorrer) ", ";
					FinPara
				"C":
					Si vectorC(n) = () Entonces
						Escribir "Para ver sus valores primero debe rellenarlo";
						menu(n, m);
					FinSi
					recorrer = 0;
					Para recorrer <- 0 Hasta n - 1 Con Paso 1 Hacer
						Escribir vectorC(recorrer) ", ";
					FinPara
			FinSegun
		"f": Escribir "gracias por utilizar el programa";
	FinSegun
	Si opcionIngresada <> "f" Entonces
		menu(n, m);
	FinSi
FinSubProceso
	