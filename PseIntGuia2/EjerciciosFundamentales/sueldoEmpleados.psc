Algoritmo sueldoEmpleados
	Definir cantEmpleados,recorrerEmpleados, cantVentas, recorrerVentas Como Entero;
	Definir sueldoBase, comisiones, sueldTotal, cobroPorVenta como Real;
	Definir nombreEmpleado Como Caracter;
	
	recorrerEmpleados = 1;
	recorrerVentas = 1;
	
	Escribir "Ingrese la cantidad de empleados"
	Leer cantEmpleados;
	
	Para recorrerEmpleados <- 1 Hasta cantEmpleados Hacer
		comisiones = 0;
		Escribir "Ingrese el nombre del empleado"
		Leer nombreEmpleado;
		Escribir "Ingrese el sueldo base del empleado"
		Leer sueldoBase;
		Escribir "Ingrese la cantidad de ventas realizadas por el usuario"
		Leer cantVentas
		Para recorrerVentas <- 1 Hasta cantVentas Hacer
			Escribir "Ingrese el monto por el que se realizo la venta n°" recorrerVentas;
			Leer cobroPorVenta;
			comisiones = comisiones + cobroPorVenta * 0.1;
		FinPara
		sueldTotal = sueldoBase + comisiones;
		Escribir "Las comisiones por ventas a pagara a " nombreEmpleado " son de $" comisiones;
		Escribir "El sueldo total a pagar a " nombreEmpleado "es de $" sueldTotal;
	FinPara
FinAlgoritmo
