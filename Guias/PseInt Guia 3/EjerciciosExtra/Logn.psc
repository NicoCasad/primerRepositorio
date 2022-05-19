Algoritmo Logn
	Definir usuario, contrasena Como Caracter;
	
	Escribir "Ingrese usuario"
	Leer usuario;
	Escribir "Ingrese la contraseña"
	Leer contrasena;
	
	Escribir login(usuario, contrasena);
FinAlgoritmo

Funcion respuesta <- login(usuario, contr)
	Definir respuesta como Logico;
	
	Si usuario = "usuario1" Y contr = "asdasd" Entonces
		respuesta = Verdadero
	SiNo
		respuesta = Falso;
	FinSi
FinFuncion
	