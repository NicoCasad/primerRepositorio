Algoritmo calculoInflacion
	Definir precio1, precio2, inflacion como Reales;
	
	Escribir "Ingrese el precio del producto que tenia a principio de a�o";
	Leer precio1;
	Escribir "Ingrese el precio del producto que tiene al finalizar el a�o";
	Leer precio2;
	
	inflacion = (precio2 - precio1)*100 / precio1;
	
	Escribir "La tasa de aumento del precio del producto en el a�o fue de: " redon(inflacion) "%";
		
FinAlgoritmo
