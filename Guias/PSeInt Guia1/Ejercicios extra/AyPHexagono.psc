Algoritmo AyPHexagono
	Definir lado, apotema, area, perimetro como Real;
	
	Escribir "Ingrese la medida de un lado del hexagono en cm";
	Leer lado;
	Escribir "Ingrese la medida de la apotema en cm";
	Leer apotema;
	
	perimetro = lado * 6;
	area = (perimetro * apotema) / 2;
	
	Escribir "el perimetro es igual a: " perimetro ", y el area es igual a: " area;
FinAlgoritmo
