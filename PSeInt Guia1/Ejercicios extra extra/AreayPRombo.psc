Algoritmo perimetroAreaRombo
	DEFINIR lado como Real;
	DEFINIR diagl como Real;
	DEFINIR diagc como Real;
	DEFINIR perimetro como Real;
	DEFINIR area Como Real;
	
	Escribir "Ingresar medida de un lado del rombo";
	Leer lado;
	Escribir "Ingresar medida de la diagonal mas larga";
	Leer diagl;
	Escribir "Ingresar medida de la diagonal mas corta";
	Leer diagc;
	
	perimetro = lado * 4;
	area = (diagl*diagc)/2;
	
	Escribir "El perimetro del rombo es: "  perimetro;
	Escribir "El area del rombo es: " area;
FinAlgoritmo
