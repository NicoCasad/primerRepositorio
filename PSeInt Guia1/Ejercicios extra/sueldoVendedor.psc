Algoritmo sueldoVendedor
	Definir sueldo, cantidadVentas, sueldoFinal como Real;
	
	Escribir "Ingrese su sueldo base";
	Leer sueldo;
	Escribir "Ingrese la cantidad de ventas realizadas en el mes"
	Leer cantidadVentas;
	
	sueldoFinal = sueldo + (cantidadVentas * 0.1) * sueldo;
	
	Escribir "El sueldo sumando las comisiones es de: " sueldoFinal;
	
FinAlgoritmo
