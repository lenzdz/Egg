Algoritmo Ejercicio7
	
	Definir numCadena Como Caracter
	Definir numEntero Como Entero
	
	Repetir
		Escribir "Ingrese un número de tres dígitos o menos:"
		Leer numCadena
	Mientras Que Longitud(numCadena) > 3
	
	numEntero = textoANumero(numCadena)
	
	Escribir numEntero	
	
FinAlgoritmo


/// Funcion

Funcion num <- textoANumero (numCadena)
	Definir num Como Entero
	num = ConvertirANumero(numCadena)
Fin Funcion