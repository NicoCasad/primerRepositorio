Algoritmo CenDecUni
	Definir dec, cen, uni, num Como Real;
	
	Escribir "Ingrese un numero de 3 cifras"
	Leer num;
	
	uni = trunc(num % 10);
	num = trunc(num / 10);
	dec = trunc (num % 10);
	num = trunc (num / 10);
	cen = trunc(num % 10);
	
	Escribir "centenas: " cen ", decenas: " dec ", unidades: " uni;
FinAlgoritmo
