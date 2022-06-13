Algoritmo aplicarDescuento
	Definir meses como caracter;
	Definir precio, precioFInal como real;
	
	Escribir "Ingrese el precio del producto";
	Leer precio;
	Escribir "Ingrese el mes actual"
	Leer meses;
	
	Segun Minusculas(meses) Hacer
		"octubre": 
			precioFinal = precio - precio * 0.1;
		"septiembre":
			precioFinal = precio - precio * 0.1;
		"noviembre":
			precioFinal = precio - precio * 0.1;
		De Otro Modo:
			Escribir "Para este mes no hay descuento";
			precioFinal = precio;
	FinSegun
	Escribir "El precio final es de: $" precioFinal;
	
FinAlgoritmo
