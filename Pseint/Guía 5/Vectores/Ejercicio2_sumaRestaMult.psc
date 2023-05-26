Algoritmo Ejercicio2
	
	Definir vector, i, suma, resta, mult Como Real
	Dimension vector(10)
	
	suma = 0
	resta = 0
	mult = 1
	
	Escribir "Ingrese 10 números:"
	Para i <- 0 Hasta 9 Hacer
		Leer vector[i]
		suma = suma + vector[i]
		resta = resta - vector[i]
		mult = mult * vector[i]
	FinPara
	
	Escribir "La suma de todos los números del arreglo es: ", suma
	Escribir "La resta de todos los números del arreglo es: ", resta
	Escribir "La multiplicación de todos los números del arreglo es: ", mult
	
FinAlgoritmo
