Algoritmo Ejercicio7
	
	Definir num Como Entero
	Definir retorno como Cadena
	
	Escribir "Ingrese un número:"
	Leer num
	
	escalera(num, retorno)
	Escribir retorno
	
FinAlgoritmo


SubProceso escalera(num, respuesta Por Referencia)
	
	Definir i Como Entero
	respuesta = "1"
	i = 2
	Mientras i <= num Hacer
		Escribir respuesta
		respuesta = respuesta + ConvertirATexto(i)
		i = i + 1
	FinMientras
FinSubProceso
	