Algoritmo Ejercicio8
	
	Definir usuario, clave como Cadena
	Definir loggeo Como Logico
	
	Escribir "Ingrese su usuario y contrase�a:"
	Leer usuario, clave
	
	loggeo = Login(usuario, clave)
	
	Escribir "Inicio de sesi�n correcto: ", loggeo
	
FinAlgoritmo

Funcion retorno <- Login(usuario, clave)
	Definir counter Como Entero
	Definir retorno Como Logico
	
	counter = 1
	
	Mientras (usuario <> "usuario1" Y clave <> "asdasd") Y counter < 3 Hacer 
	// Se repite mientras que el counter sea menor a 3 Y el usuario no sea "usuario1" Y la contrase�a no sea "asdasd".
		Escribir "Su usuario y/o contrase�a es incorrecto. Por favor, vuelva a intentarlo."
		Escribir "Ingrese su usuario y contrase�a:"
		Leer usuario, clave
		counter = counter + 1
	Fin Mientras

	Si usuario == "usuario1" Y clave == "asdasd" Entonces
		retorno = Verdadero
	SiNo
		retorno = Falso
	FinSi
	
Fin Funcion