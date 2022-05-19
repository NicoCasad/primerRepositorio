Algoritmo secuenciaNumeros
	Definir num, cadenaNum Como Cadena;
	Definir prom, i como Real;
	cadenaNum = "";
	prom = 0;
	
	Mientras Subcadena(cadenaNum, Longitud(CadenaNum) -2, Longitud(CadenaNum) -1) <> ("-1") Hacer
		Escribir "Ingrese un numero positivo, o si quiere finalizar ingrese -1"
		Leer num;
		cadenaNum <- Concatenar(cadenaNum, num);
	FinMientras
	i = Longitud(cadenaNum) -3;
	Mientras i >= 0 Hacer
		prom = prom + ConvertirANumero(Subcadena(cadenaNum, i, i));
		i = i -1;
	FinMientras
	Escribir prom;
	Escribir Longitud(cadenaNum) - 2;
	prom = prom / (Longitud(cadenaNum) - 2);
	Escribir "El promedio de los numeros ingresados es: " trunc(prom);
FinAlgoritmo
