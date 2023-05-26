Algoritmo Ejercicio10
	
	Definir num Como Entero
	
	Escribir "Ingrese un número:"
	Leer num
	
	Escribir "La suma de los dígitos de ", num, " es ", sumaDigitos(num)
	
FinAlgoritmo

Funcion suma <- sumaDigitos(num)
	
	Definir suma, dig Como Entero
	
	suma = 0
	Mientras num > 0 Hacer
		dig = num % 10
		suma = suma + dig
		num = trunc(num/10)
	Fin Mientras
	
FinFuncion
