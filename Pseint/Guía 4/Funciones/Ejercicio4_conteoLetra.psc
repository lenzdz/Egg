Algoritmo Ejercicio4
	
	Definir frase, letra Como Caracter
	
	Escribir "Ingrese una oraci�n:"
	Leer frase
	
	Escribir "Ingrese la letra de la que desea conocer la frecuencia de aparici�n en su oraci�n:"
	Leer letra
	
	frase = Minusculas(frase)
	letra = Minusculas(letra)
	
	Escribir "La letra ", letra, " aparece en su oraci�n ", Contar(frase, letra), " veces."
	
FinAlgoritmo

/// Funciones

Funcion res <- Contar(frase, letra)
	
	Definir res, i Como Entero
	
	res = 0
	Para i <- 0 Hasta Longitud(frase)-1 Hacer
		Si SubCadena(frase,i,i) == letra Entonces
			res = res + 1
		Fin Si
	Fin Para
	
FinFuncion
	